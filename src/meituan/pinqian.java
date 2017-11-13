package meituan;

import java.util.Scanner;

public class pinqian {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int p1=1,
			p5=2,
			p10=4,
			p20=17,
			p50=4*4*4*4*4+17*17*4+17*64,
			p100=p50*p50;
		
		int s=sc.nextInt();
		int s100=s/100;
		s=s%100;
		int s50=s/50;
		s=s%50;
		int s20=s/20;
		s=s%20;
		int s10=s/10;
		s=s%10;
		int s5=s/5;
		s=s%5;
		long type=1;
		for(int i=0;i<s100;i++){
			type*=p100;
		}
		for(int i=0;i<s50;i++){
			type*=p50;
		}
		for(int i=0;i<s20;i++){
			type*=p20;
		}
		for(int i=0;i<s10;i++){
			type*=p10;
		}
		for(int i=0;i<s5;i++){
			type*=p5;
		}
		
		System.out.print(type);

	}
	
//	public static long pq(int n){
//		if(n<5)
//			return 1;
//		else if(n<10)
//			return 2;
//		else if(n==10)
//			return 3;
//		else if(n<20)
//			return pq(10)*pq(n-10);
//		else if(n==20)
//			return 1+pq(10)*pq(10);
//		else if(n<50)
//			return pq(20)*pq(n-20);
//		else if(n==50)
//			return 1+pq(25)*pq(25);
//		else if(n<100)
//			return pq(50)*pq(n-50);
//		else if(n==100)
//			return 1+pq(50)*pq(50);
//		else
//			return pq(100)*pq(n-100);
//	}

}
