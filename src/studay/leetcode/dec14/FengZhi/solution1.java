package studay.leetcode.dec14.FengZhi;

import org.omg.CORBA.PUBLIC_MEMBER;

public class solution1 {
		static int findPeakElement(int[] num) {
	    if (num == null || num.length < 1) {
	        return 0;
	    } 

	    if (num.length == 1) {
	        return 0;
	    }

	    int difference = num[1] - num[0];

	    for (int i = 1; i < num.length - 1; i++) {
	        if ((difference >= 0 && num[i + 1] - num[i] >= 0) || (difference <= 0 && num[i + 1] - num[i] <= 0)) {
	            difference = num[i + 1] - num[i];
	            continue;
	        }

	        if (num[i] < num[i + 1])
	            continue;
	        else
	            return i;
	    }

	    if (num[0] > num[1])
	        return 0;
	    return num.length - 1;
}

public static void main(String[] args){
    int A[]={4,1,5,6,9,7,10,1};
	int value=solution1.findPeakElement(A);
	System.out.print("峰值是：  "+value);
}

}