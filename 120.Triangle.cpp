#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int minimumTotal(vector<vector<int>>& triangle) {
        vector<int> minpath = triangle.back();
        
		for (int row = triangle.size()-2;row >=0;--row)
			for (int i=0;i<=row;++i){
				minpath[i] = min(minpath[i],minpath[i+1]) + triangle[row][i];
			}
        
        return minpath[0];
        
    }
};

int main(){
	
	int ans ;
	Solution tri;
	
	vector<vector<int>> triangle = {{2},{3,4},{6,5,7},{4,1,8,3}};
	
	ans = tri.minimumTotal(triangle);
	cout << ans << endl;
}

