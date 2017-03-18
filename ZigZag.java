package leetcode;

public class ZigZag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String re = new ZigZag().convert("P", 1);
		System.out.println(re);
	}
	public String convert(String s, int nRows) {
	    char[] c = s.toCharArray();
	    int len = c.length;
	    StringBuffer[] sb = new StringBuffer[nRows];
	    for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();
	    int i=0;
	    while(i<len){
	    	for(int idx = 0;idx < nRows && i<len;idx++,i++)
	    		sb[idx].append(c[i]);
	    	for(int idx = nRows - 2;idx >=1 && i<len;idx--,i++)
	    		sb[idx].append(c[i]);
	    }
	    	    
	    for (int i1=1;i1<sb.length;i1++)
	    	sb[0].append(sb[i1]);
	    
	    return sb[0].toString();
	}
	
}
