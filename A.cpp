#include<bits/stdc++.h>
using namespace std;
int n,t;
bool flag;
vector<int> a;
int main(){
    scanf("%d",&t);
    while(t--){
        scanf("%d",&n);
        a.resize(n + 1,0);
        for(int i = 0;i <=n;i++){
            a[i] = i + 1;
        }
        sort(a.begin(),a.end());
        printf("%d",a[1]);
        for(int i = n - 1;i >= 0;i--){
            if(i == 1) continue;
            printf(" %d",a[i]);
        }
        printf("\n");
    }
    return 0;
}