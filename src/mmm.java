import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class mmm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[] c1=sc.next().toCharArray();
		char[] c2=sc.next().toCharArray();
		int lost=0;
		Map<Character,Integer> m1=new HashMap<Character,Integer>();
		Map<Character,Integer> m2=new HashMap<Character,Integer>();
		for(int i=0;i<c1.length;i++){
			if(m1.containsKey(c1[i])){
				m1.put(c1[i], m1.get(c1[i])+1);
			}else{
				m1.put(c1[i], 1);
			}
		}
		
		for(int i=0;i<c2.length;i++){
			if(m1.containsKey(c2[i])&&m1.get(c2[i])>0){
				m1.put(c2[i], m1.get(c2[i])-1);
			}else{
				lost++;
			}
		}
		
		if(lost>0)
			System.out.print("No "+lost);
		else
			System.out.print("Yes "+(c1.length-c2.length));
		
		
	}

}
