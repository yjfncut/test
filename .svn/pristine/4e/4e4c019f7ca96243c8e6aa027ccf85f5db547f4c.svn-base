import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class wjj {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		int n=sc.nextInt(),key=0,val=0,max=0,maxflag=0;
		for(int i=0;i<n;i++){
			key=sc.nextInt();
			val=sc.nextInt();
			if(map.containsKey(key)){
				if(map.get(key)+val>max){
					max=map.get(key)+val;
					maxflag=key;
					map.put(key, max);
				}else{
					map.put(key, map.get(key)+val);
				}
			}else{
				if(max<val){
					max=val;
					maxflag=key;
					map.put(key, val);
				}else{
					map.put(key, val);
				}
			}
		}
		System.out.print(maxflag+" "+max);
	}

}
