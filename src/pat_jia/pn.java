package pat_jia;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[] c=sc.nextLine().toCharArray();
		int len=c.length,p=0,t=0,count=0;
		List<Integer> a=new ArrayList<Integer>();
		
		for(int i=0;i<len;i++){
			if(c[i]=='A')
				a.add(i);
		}
		
		for(Integer a1:a){
			for(int i=0;i<a1.intValue();i++){
				if(c[i]=='P')
					p++;
			}
			for(int i=a1.intValue()+1;i<len;i++){
				if(c[i]=='T')
					t++;
			}
			count+=t*p;
			count/=1000000007;
			t=0;p=0;
		}
		
		System.out.print(count);

	}

}
