package meituan;

import java.util.Scanner;

public class twostr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
		int len1=s1.length(),len2=s2.length();
		int len=len1+len2;
		int s1_start=0,s2_start=0;
		int curmax=0,max=0;
		for(int i=0;i<len;i++){
			s1_start=0;s2_start=0;
			if(i<len1)
				s1_start=len1-i;
			else
				s2_start=i-len1;
			
			for(int idx=0;(s1_start+idx)<len1&&(s2_start+idx)<len2;idx++){
				if(c1[s1_start+idx]==c2[s2_start+idx]){
					curmax++;
				}else{
					if(curmax>max){
						max=curmax;
					}
					curmax=0;
				}
				if(curmax>max){
					max=curmax;
				}	
			}
			
		}
		
		System.out.print(max);
		

	}

}
