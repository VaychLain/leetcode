#include <iostream>
#include <string>
#include <vector>
using namespace std;
//
//class Solution {
//public:
//    int numDecodings(string s) {
//        if(s.empty() || s[0]<'1' || s[0]>'9') return 0;
//        vector<int> dp(s.size()+1, 0);
//        dp[0] = dp[1] = 1;
//        for(int i=1; i<s.size(); i++) {
//            if(!isdigit(s[i])) {
//                return 0;
//            }
//            int val = (s[i-1]-'0')*10+(s[i]-'0');
//            if(val<=26 && val>9) {
//                dp[i+1] += dp[i-1];
//            }
//            if(s[i]!='0') dp[i+1] += dp[i];
//            if(dp[i+1]==0) return 0;
//        }
//        return dp.back();
//    }
//};

class Solution {
public:
    int numDecodings(string s) {
      int r2 = 1 ,r1 = 1;
        if (s.length() == 0 || s[0]== '0')  
        	return 0;
        for (int i=1;i<s.length();i++){
        	if (s[i]=='0') 
				r1 = 0;
        	if (s[i-1]>'2'||(s[i-1]=='2'&&s[i]>'6'))
        		r2 = 0;

		r1 = r1 + r2;
		r2 = r1 - r2;

		}
        return r1;  
    }
};


int main(){
	int a=10;
	Solution b;
	a= b.numDecodings("17");
	cout << a<< endl;
} 
