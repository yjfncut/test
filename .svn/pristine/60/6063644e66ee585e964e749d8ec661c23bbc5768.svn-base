import java.util.Scanner;


public class lucknum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt(),sum=0;
		for(int i=1;i<=n;i++){
			if(f(i)==g(i))
				sum++;
		}
		System.out.print(sum);

	}
	
	public static int f(int n){
		int sum=0;
		while(n!=0){
			sum+=n%10;
			n/=10;
		}
		return sum;
	}
	
	public static int g(int n){
		int sum=0;
		while(n!=0){
			sum+=n%2;
			n/=2;
		}
		return sum;
	}

}
