#include <stdio.h>
#include <stdlib.h>

int uniquePaths(int m, int n) {
    int path[m][n];
    int i,j;
    for (int i = 0; i < m; i++)
    	path[i][0] = 1;
    for (int j = 0; j < n; j++)
		path[0][j] = 1;
    for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                path[i][j] = path[i - 1][j] + path[i][j - 1];
    return path[m-1][n-1];
}

int main(){
	int m = 3, n = 7;
	int ans;
	ans = uniquePaths(3,7);
	printf("%d\n",ans);
}
