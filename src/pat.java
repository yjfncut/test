import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class pat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char[] c=s.toCharArray();
		List<Integer> p=new ArrayList<Integer>();
		List<Integer> a=new ArrayList<Integer>();
		List<Integer> t=new ArrayList<Integer>();
		int pnum=0,tnum=0,sum=0;
		for(int i=0;i<s.length();i++){
			if(c[i]=='P')
				p.add(i);
			if(c[i]=='A')
				a.add(i);
			if(c[i]=='T')
				t.add(i);
		}
		for(int i=0;i<a.size();i++){
			for(int j=0;j<p.size();j++){
				if(a.get(i)>p.get(j)){
					pnum++;
				}else{
					break;
				}
			}
			for(int j=t.size()-1;j>=0;j--){
				if(a.get(i)<t.get(j)){
					tnum++;
				}else{
					break;
				}
			}
			sum%=1000000007;
			sum+=pnum*tnum;
			pnum=0;
			tnum=0;
		}
		System.out.print(sum);
	}

}
