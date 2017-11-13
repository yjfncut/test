import java.util.Scanner;


public class shalou {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String b=sc.next();
		int i=0,tmp=0;
		int sum=0;
		int yiban=a/2;
		while(true){
			if(sum>yiban)
				break;
			i++;
			sum+=2*i+1;
			
		}
		sum-=2*i+1;
		int shengxia=a-2*sum-1;
		
		for(int j=2*(i-1)+1;j>0;j-=2,tmp++){
			for(int k=0;k<tmp;k++){
				System.out.print(" ");
			}
			for(int m=0;m<j;m++){
				System.out.print(b);
			}
			System.out.println();		
		}
		tmp-=2;
		for(int j=3;j<=2*i-1;j+=2,tmp--){
			for(int k=0;k<tmp;k++){
				System.out.print(" ");
			}
			for(int m=0;m<j;m++){
				System.out.print(b);
			}
			System.out.println();		
		}
		
		
		
		System.out.print(shengxia);

	}

}
