#include <stdio.h>
#include <limits.h>
int reverse(int x) {
        long long b = 0;
        while(x!=0){
        	b = x%10 + b*10;
        	x = x/10;
		}
		return (b<INT_MIN || b>INT_MAX) ? 0 : b;
    }

int main(){
	int i=1000000003;
	printf("%d\n",reverse(i));
	return 0;
}

