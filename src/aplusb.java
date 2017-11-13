import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class aplusb {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int[] a1=new int[n1];
		int[] a2=new int[n2];
		Set<Integer> s=new HashSet<Integer>();
		for(int i=0;i<n1;i++){
			a1[i]=sc.nextInt();
			s.add(a1[i]);
		}
		for(int i=0;i<n2;i++){
			a2[i]=sc.nextInt();
			s.add(a2[i]);
		}
		List<Integer> l = new ArrayList<Integer>(s);
		Collections.sort(l);
		for(int i=0;i<l.size()-1;i++){
			System.out.print(l.get(i)+" ");
		}
		System.out.print(l.get(l.size()-1));
		
		

	}

}
