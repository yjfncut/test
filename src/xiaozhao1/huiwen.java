package xiaozhao1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class huiwen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] sa=s.toCharArray();
		int count=0;
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(int i=0;i<sa.length;i++){
			if(map.containsKey(sa[i])){
				map.put(sa[i], map.get(sa[i])+1);
			}else{
				map.put(sa[i], 1);
			}
		}
		
		Iterator iter=map.entrySet().iterator();
		while (iter.hasNext()){
			Map.Entry<Character,Integer> entry=(Map.Entry<Character, Integer>)iter.next();
			Character key=entry.getKey();
			Integer val=entry.getValue();
			if(val%2!=0){
				count++;
			}
		}
		
		System.out.print(count);
		

	}

}
