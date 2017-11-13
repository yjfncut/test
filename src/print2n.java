import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import org.xml.sax.HandlerBase;


public class print2n {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		String[] sa=s.split(" ");
		int len=sa.length;
		int[] ia=new int[len];
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<len;i++){
			ia[i]=Integer.valueOf(sa[i]);
			if(map.containsKey(ia[i])){
				map.put(ia[i], map.get(ia[i])+1);
			}else{
				map.put(ia[i],1);
			}
		}
		Iterator iter=map.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry<Integer, Integer> entry=(Map.Entry<Integer, Integer>) iter.next();
			Integer key=entry.getKey();
			Integer val=entry.getValue();
			if(val>=len/2){
				System.out.print(key);
				break;
			}
		}
		

	}

}
