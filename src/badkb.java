import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class badkb {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String c=sc.nextLine();
		String w=sc.nextLine();
		c=c.toUpperCase();
		w=w.toUpperCase();
		char[] c1=c.toCharArray();
		char[] w1=w.toCharArray();
		Map<Integer,Character> m=new HashMap<Integer,Character>();
		List<Character> cl=new ArrayList<Character>();
		List<Character> wl=new ArrayList<Character>();
		List<Character> l=new ArrayList<Character>();
		for(int i=0;i<w1.length;i++){
			wl.add(w1[i]);
		}
		for(int i=0;i<c1.length;i++){
			if(!wl.contains(c1[i])&&!l.contains(c1[i])){
				l.add(c1[i]);
				System.out.print(c1[i]);
			}
		}
	}

}
