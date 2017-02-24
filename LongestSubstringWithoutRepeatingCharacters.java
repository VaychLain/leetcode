package leetcode;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("");
		System.out.println(i);
	}
	public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int maxnum = 1;
		int j;
		if (s == "") return 0;
        for (int i= 0;i<s.length();i++){
        	map.put(s.charAt(i), 1);
			for(j = i+1;j<s.length();j++){
				if (map.containsKey(s.charAt(j))){
					maxnum = Math.max(maxnum , j - i) ;
					System.out.println(j - i);
					break;
				}
				map.put(s.charAt(j), 1);
				
			}
			if (j == s.length()){
				maxnum = Math.max(maxnum , j - i) ;
			}
			
			map.clear();
		}
		
		return maxnum;
    }

}
