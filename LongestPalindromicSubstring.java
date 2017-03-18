package leetcode;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String re = new LongestPalindromicSubstring().longestPalindrome("ggabaabaabaaball");
		System.out.println(re);

	}  
		
	public String longestPalindrome(String s) {
		String LSubStr = "";
		int maxRight = 0, pos = 0,maxlen = 0;
		int left=0,right =0;
		StringBuilder builder = new StringBuilder();
        builder.append(s);
        int length = builder.length();
        for(int i=0,k=0;i<=length;i++)
        {  
            builder.insert(k,"#");  
            k=k+2;  
        }
        String ne_s = builder.toString();
        int len = ne_s.length();
        
        int [] RL = new int [len];
        for (int i1=0;i1<len;i1++)
        	RL[i1] = 0;
        
        for (int p = 0; p<len; p++){
        	if (p < maxRight){
        		RL[p] = Math.min(RL[2*pos-p], maxRight-p);
        	}
        	else
        		RL[p] = 1;
        	while(p-RL[p] >= 0 && p+RL[p] < len && ne_s.charAt(p-RL[p])==ne_s.charAt(p+RL[p]))
        		RL[p] += 1;
        	if (RL[p] + p -1 > maxRight){
        		maxRight = RL[p] + p -1;
        		pos = p;
        	}
        	if (RL[p] > maxlen){
        		maxlen = RL[p];
        		left = (p-RL[p])%2==1 ? (p-RL[p])/2+1 : (p-RL[p])/2;
        		right = (p+RL[p])/2;
        		LSubStr = s.substring(left,right);
        	}
        }
        return LSubStr;
    }
	
}
