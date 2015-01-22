package studay.leetcode.dec14.FengZhi;

public class QuickSort {

	/**
	 * @param A
	 * @param low
	 * @param high
	 */
	public static void quickSort(int[] A,int low,int high){
		int l=low;
		int h=high;
		int pivot=A[low];
		int temp;
	//	while(l<h){
			while((l<h)&&(A[h]>=pivot)){
				h--;}
			if(l<h){
			temp=A[l];
			A[l]=A[h];
			A[h]=temp;
			l++;
			}
			while((l<h)&&(A[l]<=pivot)){
				l++;
				
			}
			if(l<h){
				temp=A[l];
				A[l]=A[h];
				A[h]=temp;
				h--;
			}
			
	//	}
		
		for(int i=0;i<A.length;i++){			
			System.out.println(A[i]);
		}
		
		if(l>low) quickSort(A, low,l);
		if(h<high) quickSort(A,h,high);
			
			
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={2,-5,10,20,6,4,100,20,-5,0};
		
		System.out.printf("快速排序后的结果为：\n");
		quickSort(A,0,9);
		
		
	}

}
