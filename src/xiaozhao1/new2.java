package xiaozhao1;

import java.util.Scanner;

public class new2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		int flag1=0;
		int flag2=n-1;
		int mid=n/2;
		int sum=0;
		while(true){
			if(a[flag1]==a[flag2]){
				sum+=2*a[flag1];
				flag1++;
				flag2--;
			}else if(a[flag1]<a[flag2]){
				sum+=2*a[flag1];
				flag1++;
			}else{
				sum+=2*a[flag2];
				flag2--;
			}
			
			if(flag2<=flag1){
				break;
			}
			
			
		}
		System.out.print(sum);

	}

}
