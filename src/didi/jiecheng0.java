package didi;

import java.util.Scanner;

public class jiecheng0 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0,sum=1;
		for(int i=1;i<=n;i++){
			sum*=i;
			while(sum%10==0){
				count++;
				sum/=10;
			}
			if(sum>1000)
				sum%=1000;
		}
		System.out.print(count);

	}

}
