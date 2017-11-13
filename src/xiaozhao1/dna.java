package xiaozhao1;

import java.util.Scanner;

public class dna {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char[] sa=s.toCharArray();
		int maxcur=0,maxall=0,tmp=0;
		for(int i=0;i<sa.length;i++){
			if(sa[i]=='A'||sa[i]=='T'||sa[i]=='G'||sa[i]=='C'){
				tmp++;
				maxcur=maxcur>tmp?maxcur:tmp;
			}else{
				maxcur=maxcur>tmp?maxcur:tmp;
				maxall=maxall>maxcur?maxall:maxcur;
				tmp=0;
			}
		}
		maxall=maxall>maxcur?maxall:maxcur;
		System.out.print(maxall);

	}

}
