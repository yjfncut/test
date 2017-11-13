package goodfuture;

import java.util.Scanner;

public class longnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] c=s.toCharArray();
		int len=c.length;
		int maxlencur=0,maxnumall=0,flag=0;
		
		for(int i=0;i<len;i++){
			if(c[i]>='0'&&c[i]<='9'&&i!=len-1){
				maxlencur++;
			}else{
				if(maxnumall>maxlencur){
					maxlencur=0;
					continue;
				}else{
					maxnumall=maxlencur;
					flag=i;
				}
				maxlencur=0;
			}
		}
		int last=flag==len-1?flag:flag-1;
		for(int i=flag-maxnumall;i<=last;i++){
			System.out.print(c[i]);
		}

	}

}
