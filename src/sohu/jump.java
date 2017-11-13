package sohu;

import java.util.Scanner;

public class jump {

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
//		for(int w=0;w<39;w++)
//			System.out.print(w%10+" ");
//		System.out.println();
		int best=Integer.MIN_VALUE,besttag=0,count=0;
		for(int i=0;i<n;i++){
			int tmp=a[i];
			if(i==n-1){
				count++;
				break;
			}
			int s=i+a[i]>(n-1)?n-1:i+a[i];
			for(int j=i+1;j<=s;j++){
				if(a[j]-tmp>=best)
				{
					best=a[j]-tmp;
					besttag=j;
				}
				tmp--;
			}			
			best=Integer.MIN_VALUE;
			
			
//			for(int w=0;w<besttag;w++)
//				System.out.print(" ");
//			System.out.print(besttag+" ");
			i=besttag-1;
			count++;
			if(a[besttag]+besttag>=n)
				break;
		}
		if(a[besttag]+besttag>=n)
			System.out.print(++count);
		else
			System.out.print(-1);

	}

}
