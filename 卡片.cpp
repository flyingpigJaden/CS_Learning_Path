#include <stdio.h>
int main(){
	int T=0;
	int A=0,B=0,C=0,K=0,A1=0,B1=0,C1=0;
	scanf("%d",&T);
	for(int i=0;i<T;i++){
	
	scanf("%d %d %d %d",&A,&B,&C,&K);
	for(int j=0;j<K;j++){
	
	A1=A;
	B1=B;
	C1=C;
	A=(B+C)/2;
	B=(A1+C)/2;
	C=(A1+B1)/2;
	if (A == A1 && B == B1 && C == C1) {

                break; 
            }
	
}
	printf("%d %d %d\n",A,B,C);
}
return 0;
}