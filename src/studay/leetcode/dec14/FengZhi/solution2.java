package studay.leetcode.dec14.FengZhi;

public class solution2 {
	public static int findPeakElement(int[] num) {
	    int len =0;
	    for(int i=0; i<num.length; i++){
	        if(num[len]>=num[i]){
	            continue;
	        }
	        if(num[len]<num[i]){
	            len=i;
	        }
	    }
	    return len;
}
	
	public static void main(String[] args){
	    int A[]={4,1,5,6,9,7,10,1};
		int value=solution2.findPeakElement(A);
		System.out.print("峰值是：  "+value);
	}
	
}
