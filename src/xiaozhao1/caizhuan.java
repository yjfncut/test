package xiaozhao1;

import java.util.Scanner;

public class caizhuan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] sa=s.toCharArray();
		int count=0,len=0;
		if(s.length()%2==0)
			len=s.length()/2;
		else
			len=s.length()/2-1;
		for(int i=0;i<s.length()/2;i++){
			if(sa[i]==sa[i+1]){
				count++;
				sa[i+1]='o';

			}
			if(i+1==s.length()/2)
				break;
			if(sa[s.length()-1-i]==sa[s.length()-2-i]){
				sa[s.length()-2-i]='o';
				count++;
			}
				
		}
		System.out.print(count);

	}

}
