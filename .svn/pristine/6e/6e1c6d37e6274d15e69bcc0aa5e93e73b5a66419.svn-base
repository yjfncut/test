import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class abd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int d=scanner.nextInt();
		int jinwei=0,wei=0,flag2=0,flag=0,sum=0,sum10;
		List<Integer> l=new ArrayList();
		sum10=a+b;
		while(sum10>0){
			flag=sum10%d;		
			l.add(flag);
			sum10/=d;
		}
		for(int i=l.size()-1;i>=0;i--)
			System.out.print(l.get(i));

	}

}
