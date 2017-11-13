import java.util.Scanner;


public class fenbi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//n根彩色
		int m=sc.nextInt();//m根白色
		
		int a=sc.nextInt();//a根彩色
		int b=sc.nextInt();//b根白色
		
		int c=sc.nextInt();//c根白色
		
		int d=sc.nextInt();//d根彩色
		
		int x=sc.nextInt();//a+b
		
		int y=sc.nextInt();//c
		
		int z=sc.nextInt();//d
		
		//优先单色
		int caise_boxnum=n/d;
		int baise_boxnum=m/c;
		int shuangze_boxnum=Math.min((n%d)/a, (m%c)/b);
		int price1=shuangze_boxnum*x+caise_boxnum*z+baise_boxnum*y;
		//优先双色
		int cs_box=n/a;
		int bs_box=m/b;
		int ss_box=Math.min(cs_box, bs_box);
		
		int lost_bai=m-ss_box*b;
		int lost_cai=n-ss_box*a;
		int price2=ss_box*x+(lost_bai/c)*y+(lost_cai/d)*z;
		
		int best_price=Math.max(price1, price2);
		
		System.out.print(best_price);

	}

}
