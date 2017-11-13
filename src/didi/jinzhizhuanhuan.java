package didi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class jinzhizhuanhuan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int flag=0;
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(10, "A");
		map.put(11, "B");
		map.put(12, "C");
		map.put(13, "D");
		map.put(14, "E");
		map.put(15, "F");
		List<Integer> l=new ArrayList<Integer>();
		if(m<0)
		{
			flag=1;
			m=Math.abs(m);
		}
		while(m>0){
			l.add(m%n);
			m/=n;
		}
		if(flag==1)
			System.out.print("-");
		for(int i=l.size()-1;i>=0;i--){
			if(l.get(i)<10)
				System.out.print(l.get(i));
			else
				System.out.print(map.get(l.get(i)));
		}

	}

}
