import java.util.Scanner;


public class jinzhi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		while(true){
			int n=sc.nextInt();
			int num=n;
			int flag=0;
			for(int i=2;i<=n-1;i++){
				num=n;
				while(num!=0){
					flag+=num%i;
					num/=i;
				}
			}		
			int small=flag<(n-2)?flag:(n-2);
			for(int i=small;i>=1;i--)
				if(flag%i==0&&(n-2)%i==0){
					int fz=flag/i,fm=(n-2)/i;
					System.out.print(fz+"/"+fm);
					break;
				}

		}
		
	}

}
