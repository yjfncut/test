import java.util.Scanner;


public class obm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		int h=n%2==0?n/2:n/2+1;
		for(int i=0;i<h;i++){
			if(i==0||i==(h-1)){
				for(int j=0;j<n;j++){
					System.out.print(s);
				}
				System.out.println();
			}else{
				System.out.print(s);
				for(int j=0;j<n-2;j++){
					System.out.print(" ");
				}
				System.out.println(s);
				
			}
		}

	}

}
