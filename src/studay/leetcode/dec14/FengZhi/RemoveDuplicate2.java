package studay.leetcode.dec14.FengZhi;
/*
 * Follow up for ”Remove Duplicates”: What if duplicates are allowed at most twice?
For example, Given sorted array A = [1,1,1,2,2,3],
Your function should return length = 5, and A is now [1,1,2,2,3]
 */
public class RemoveDuplicate2 {
public int removeDuplicate(int[] A){
	int index=0;
	int cnt = 0;
	for (int i=1;i<A.length;i++){
		
		if(A[index]!=A[i]){
			A[++index]=A[i];
		cnt = 0;
		}else if ((A[index]==A[i])&&(cnt<1)){
		A[++index]=A[i];
		cnt++;
		
		}
	}
	return index+1;
	
	
}
}
