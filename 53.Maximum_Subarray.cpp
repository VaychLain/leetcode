#include <iostream>
#include <vector>
#include <math.h>
using namespace std;

class Solution {
public:
    int maxSubArray(vector<int>& nums) 
	{   
		int sum;
		vector<int> dp(nums.size(),0);
		sum = nums[0];
		cout << sum <<endl;
		dp[0] =nums[0];
		for (int i=1;i<nums.size();++i){
			dp[i] = dp[i-1] > 0 ? (nums[i] + dp[i-1] ): nums[i];
			sum = max(sum, dp[i]);
			cout << sum <<endl;
		}
		return sum;
    }
};

int main(){
	Solution a;
	vector<int> nums = {-2,1,-3,4,-1,2,1,-5,4};
	int ans = a.maxSubArray(nums);
	
	cout << ans <<endl;
} 
