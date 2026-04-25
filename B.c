#include <stdio.h>


void solve() {
    int n;
    scanf("%d", &n);
    
    int count = 0; 
    
    for(int i = 0; i < n; i++) {
        int p_i;
        scanf("%d", &p_i); 
        
        
        if(p_i <= i + 1) { 
            count++;
        }
    }
    
    
    printf("%d\n", count); 
}

int main() {
    int t;
   
    if (scanf("%d", &t) == 1) {
        
        while (t > 0) {
            solve();
            t--;
        }
    }
    return 0;
}