#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
int myAtoi(char* str) {
	int sign = 1,i = 0;
	long long result = 0;
	while (str[i] == ' ') 
		i++;
	if (str[i] == '-' || str[i] == '+')  
		sign = (str[i++] =='-')?-1:1;
	while('0'<= str[i] && str[i] <= '9') 
        {
            result = result*10 + (str[i++]-'0');
            printf("%lld,%d\n",result,sign);
        }
        
            if(result*sign >= INT_MAX) return INT_MAX;
            if(result*sign <= INT_MIN) return INT_MIN;                
        
        return result*sign;
}

int main(){
	char a[]="9223372036854775809";
	long long total;
	total = pow(2,63); 
	printf("%lld\n",total);
	printf("9223372036854775809");
	printf("%d\n",myAtoi(a));
	return 0;
}
