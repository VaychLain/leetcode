#include <iostream>
#include <string>
#include <vector>


using namespace std;


class Solution {
public:
    bool wordBreak(string s, vector<string>& wordDict) {
    	
    	if(wordDict.size()==0) return false;
        
        vector<bool> dp(s.size()+1,false);
        
        dp[0] = true;

        for(int i=1;i<=s.size();++i)
		{
        	for (int j=i-1;j>=0;--j)
			{
				cout <<s.substr(j,i-j).c_str() <<endl;
        		if (dp[j])
				{
        			for(vector<string> :: iterator ite = wordDict.begin();ite!=wordDict.end();++ite)
					{
						//bool cmp = strcmp(ite->c_str(),s.substr(j,i-j).c_str());
						cout << i <<' ' << j <<' ' ;
						cout << *ite <<endl;
        				if(!ite->compare(s.substr(j,i-j)))
						{
        					dp[i]=1;
        					break;
						}
        					
					}
				}
        		
			}
		}
		for(int i = 0 ;i < dp.size();++i)
			cout << dp[i] <<' ' ;
		cout << endl;
        	
		return dp[s.size()];
    }
};


int main(){
	string s = "leetcode";
	
	vector<string> wordDict;
	wordDict.push_back("leet");
	wordDict.push_back("code");
//	wordDict.push_back("a");
//	wordDict.push_back("abc");
//	wordDict.push_back("b");
//	wordDict.push_back("cd");
	
	Solution a;
	
	bool ans = a.wordBreak(s,wordDict);
	cout << ans <<endl;
	return 0;
}



