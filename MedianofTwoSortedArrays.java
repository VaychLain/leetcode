package leetcode;

public class MedianofTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums1 = {};
		int [] nums2 = {1};
		double res = new MedianofTwoSortedArrays().findMedianSortedArrays(nums1,nums2);
		System.out.println(res);
	}
	
	 public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        double median;
	        int i = 0 ,j =0;
	        int m,n;
	        int [] a,b;
	        int left,right;
	        
	        if ( nums1.length < nums2.length){
	        	a = nums1;
	        	b = nums2;
	        	m = nums1.length;
	        	n = nums2.length;
	        }
	        else {
	        	a = nums2;
	        	b = nums1;
	        	m = nums2.length;
	        	n = nums1.length;
	        }
	        if (n == 0) return 0.0;
	        int imin = 0;
	        int imax = m;
	        int half = ( m + n + 1 ) / 2;
	        while(imin<=imax){
	        	i = (imin + imax) / 2;
	        	j = half - i;
	        	
	        	if (i < m && b[j-1] > a[i]){
	        		imin = i + 1;
	        	}else if (i > 0 && a[i-1] > b[j]){
	        		imax = i-1;
	        		  }
	        	 else{
	        		 if (i == 0) left = b[j-1]; 
	        		 else if (j == 0) left = a[i-1];
	        		 else left = Math.max(a[i-1], b[j-1]);
	        		 
	        		 if((m + n )%2 ==1)  return left;
	        		 
	        		 if (i == m ) right = b[j];
	        		 else if (j == n)  right = a[i];
	        		 else right = Math.min(a[i],b[j]);
	        		 
	        		 return ((left + right )/2.0);
	        	 }
	        }
	        return 0;
	        
	 }
	 

}





