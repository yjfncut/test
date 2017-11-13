package meituan;

import java.util.Scanner;

public class kb {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int sum=0;
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		
		int K=sc.nextInt();
		sum%=K;
		int sum1=0,sum2=0;
		for(int i=0;i<n;i++){
			
		}
		
		
		
		int cha=n-n2;
		if(cha>0){
			cha=n-n2;
			if(cha<180){
				System.out.print("-"+cha);
			}else{
				System.out.print((360-cha));
			}
		}else{
			if(Math.abs(cha)<=180)
				System.out.print(Math.abs(cha));
			else
				System.out.print(-(360-Math.abs(cha)));
		}

	}

}
