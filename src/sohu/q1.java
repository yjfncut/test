package sohu;

import java.util.Scanner;

public class q1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String number=sc.next();
		int cnt=sc.nextInt();
		int[] narray=new int[number.length()];
		for(int i=0;i<number.length();i++){
			narray[i]=Integer.valueOf(number.substring(i, i+1));
		}
		int len=narray.length,maxflag=0,max=Integer.MIN_VALUE,tmp;
		
		for(int j=0;j<narray.length-cnt;j++){
			tmp=maxflag;
			for(int i=tmp;i<len-cnt;i++){
				if(narray[i]>max){
					maxflag=i;
					max=narray[i];
				}
				
			}
			narray[maxflag]=-1;
			System.out.print(max);
			len++;
			max=Integer.MIN_VALUE;
		}

	}

}
