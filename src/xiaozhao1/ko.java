package xiaozhao1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ko {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int zhengshi=0;
		List<sx> l=new ArrayList<sx>();
		l.add(new sx(0));
		int sum=0;
		for(int i=0;i<n;i++){
			sum=zhengshi+l.size();
			for(sx s:l){
				if(s.month<3){
					sx tmp=s;
					l.remove(s);
					l.add(new sx(s.month+1));
				}
				else{
					l.remove(s);
					zhengshi++;
					if(l.size()==0)
						break;
				}
			}
			for(int j=0;j<zhengshi;j++)
				l.add(new sx(0));
		}
		System.out.print(sum);

	}

	static class sx{
		int month=0;
		sx(int m){
			month=m;
		}
	}

}


