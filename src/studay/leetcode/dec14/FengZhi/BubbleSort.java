package studay.leetcode.dec14.FengZhi;
/*
 * 冒泡排序java实现
 */
public class BubbleSort {

	public static void bubbleSort(int[] A){
		int temp;
		for(int i=0;i<A.length;i++)
		 for(int j=i+1;j<A.length;j++){
			 if(A[i]>A[j]){
				 temp=A[i];
				 A[i]=A[j];
				 A[j]=temp;
			 }
			
		}
		for(int k=0;k<A.length;k++){
			System.out.println("冒泡排序后的结果是："+A[k]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={2,-5,10,20,6,4,100,20,-5,0};
		bubbleSort(A);
		
	}

}
