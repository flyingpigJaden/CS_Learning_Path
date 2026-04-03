#include <stdio.h>
int main(){
	int N;
	scanf("%d",&N);
	int con=0;

	for(int i=1;i<=N;++i){
			int digit=1;
		int temp=i;
		while(temp>0){
		
		if((temp%10)%2==digit%2){
			temp=temp/10;
			digit++;
			
		}
		else
		 break;
		if(temp==0)
		con++;
	}
}
printf("%d",con);
return 0;
}