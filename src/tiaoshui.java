import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		List<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			l.add(sc.nextInt());
		}
		int tmp=0;
		for(int i=0;i<n;i++){//第n个出场
			for(int j=0;j<i;j++){//前n个人
				if(l.get(i)<l.get(j)){
					tmp++;
				}
			}
			if(i==n-1||n!=1)
				System.out.print(tmp);
			else
				System.out.print(tmp+" ");
			tmp=0;
		}

	}

}
