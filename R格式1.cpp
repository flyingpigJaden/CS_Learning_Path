#include <stdio.h>
#include <string.h>

int a[10005]; // 用于存储大整数，倒序存放，开够 10000 位绝对安全
char s[1005]; // 用于接收初始的浮点数字符串

int main() {
    int n;
    // 读入转换参数 n 和 浮点数字符串 s
    if (scanf("%d %s", &n, s) != 2) return 0;

    int len = strlen(s);
    int k = 0;   // 记录小数点后有多少位数字
    int pos = 0; // 数组 a 的当前长度

    // 步骤 1：解析字符串，提取纯数字并记录小数点位置
    for (int i = len - 1; i >= 0; i--) {
        if (s[i] == '.') {
            k = len - 1 - i; // 计算得出小数的位数
        } else {
            a[pos++] = s[i] - '0'; // 将字符转化为数字，并倒序存入数组
        }
    }

    int a_len = pos; // 记录目前大整数的总长度

    // 步骤 2：高精度乘法（将大整数连续乘以 2，乘 n 次）
    for (int step = 0; step < n; step++) {
        int carry = 0; // 进位标志
        for (int i = 0; i < a_len; i++) {
            int val = a[i] * 2 + carry; // 当前位乘 2 加上一波的进位
            a[i] = val % 10;            // 当前位保留个数
            carry = val / 10;           // 算出新的进位
        }
        // 如果最高位乘完之后还有进位，数组长度需要变长
        while (carry > 0) {
            a[a_len++] = carry % 10;
            carry /= 10;
        }
    }

    // 步骤 3：模拟四舍五入
    int carry_round = 0;
    // 数组中，索引 k-1 的位置就是小数点后的第一位（也就是决定四舍五入的那一位）
    if (k > 0 && a[k - 1] >= 5) {
        carry_round = 1; // 大于等于5，需要向整数部分进 1
    }

    // 将四舍五入产生的进位，加到整数部分（从索引 k 开始是整数的个位）
    if (carry_round > 0) {
        int i = k;
        while (carry_round > 0) {
            if (i >= a_len) {
                a[a_len++] = 0; // 如果进位导致整数总位数增加，拓展数组
            }
            int val = a[i] + carry_round;
            a[i] = val % 10;
            carry_round = val / 10;
            i++;
        }
    }

    // 步骤 4：打印输出整数部分
    int started = 0; // 标记是否已经遇到非零的最高位，用于过滤开头的无效零（前导零）
    // 从数组的最高位一直倒着打印到个位（索引 k）
    for (int i = a_len - 1; i >= k; i--) {
        if (a[i] != 0) {
            started = 1; 
        }
        if (started) {
            printf("%d", a[i]);
        }
    }

    // 特殊情况保底：如果整数部分全都是零（比如 0.12 乘 2 等于 0.24，没输出过数字）
    if (!started) {
        printf("0");
    }
    printf("\n");

    return 0;
}