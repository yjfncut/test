package niuke;

public class aa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int[] insertionSort(int[] A, int n) {
	        for(int i=1;i<n;i++){
	            int flag = A[i];
	            for(int j=i;j>0&&A[j-1]>flag;j--){
	               A[j]=A[j-1];
	            }
	            A[i]=flag;
	        }
	        return A;
	    }
}
