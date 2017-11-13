import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class geweishu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int tmp=0;
		char[] sarray=s.toCharArray();
		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		for(int i=0;i<sarray.length;i++){
			if(m.containsKey(Integer.valueOf(String.valueOf(sarray[i])))){
				tmp=m.get(Integer.valueOf(String.valueOf(sarray[i])));
				tmp++;
				m.put(Integer.valueOf(String.valueOf(sarray[i])), tmp);
			}else{
				m.put(Integer.valueOf(String.valueOf(sarray[i])), 1);
			}
		}
		for(int i=0;i<10;i++){
			if(m.get(i)!=null)
				System.out.println(i+":"+m.get(i));
		}
	}

}
