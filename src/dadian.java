import java.util.Scanner;


public class dadian {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float a=sc.nextInt();
		float b=sc.nextInt();
		float CLK_TCK=100;
		double time=(b-a)/100;				
		int hh=(int) (time/3600);
		time=time%3600;
		int mm=(int) (time/60);
		time=time%60;
		int ss=(int)(time+0.5);
		System.out.print(hh/10);
		System.out.print(hh%10);
		System.out.print(":");
		System.out.print(mm/10);
		System.out.print(mm%10);
		System.out.print(":");
		System.out.print(ss/10);
		System.out.print(ss%10);
	}

}
