import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class idcode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		String[] M={"1","0","X","9","8","7","6","5","4","3","2"};
		int[] weight={7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
		Map<Integer,String> map=new HashMap<Integer,String>();
		String[] sa=new String[n];
		String tmp="";
		int w=0,flag=0;
		for(int i=0;i<11;i++){
			map.put(i, M[i]);
		}
		for(int i=0;i<n;i++){
			sa[i]=sc.next();
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<sa[i].length()-1;j++){
				tmp=sa[i].substring(j, j+1);
				if(tmp.equals("X")){
					System.out.println(sa[i]);
					break;
				}else{
					w+=Integer.valueOf(tmp)*weight[j];
				}
				if(j==sa[i].length()-2){
					if(!map.get(w%11).equals(sa[i].substring(sa[i].length()-1, sa[i].length()))){
						flag++;
						System.out.println(sa[i]);
					}		
				}
			}
			w=0;
			
		}
		if(flag==0)
			System.out.println("All passed");

	}

}
