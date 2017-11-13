import java.util.Scanner;


public class kuaisupaixue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] array={6,1,5,4,8,3,9,12,51,11,15,14,13,25,69,47,56,74,26,78};
		int n=array.length;
		kp(array,0,array.length-1);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		
		
	}
	public static void kp(int[] x,int left,int right){
		if(left<right){
			int i=left,j=right,biaozhi=x[left];
			while(i<j){
				while(x[j]>biaozhi&&i < j)
					j--;
				if(i<j)
					x[i++]=x[j];
				while(x[i]<biaozhi&&i < j)
					i++;
				if(i<j)
					x[j--]=x[i];
			}
			x[i]=biaozhi;
			kp(x,left,i-1);
			kp(x,i+1,right);
		}	
	}
}
