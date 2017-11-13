package pat_jia;

import java.util.Scanner;

public class patnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[] c=sc.nextLine().toCharArray();
		int len=c.length,p=0,a=0,t=0,count=0;
		pat[] patarray=new pat[len+1];
		for(int i=1;i<len+1;i++){
			if(c[i-1]=='P')
				p++;
			else if(c[i-1]=='A')
				a++;
			else
				t++;
			patarray[i]=new pat(p,a,t);
		}
		
		for(int i=1;i<len+1;i++){
			if(c[i-1]=='T'){
				count+=patarray[i].getA()*patarray[i].getP();
			}
		}
		System.out.print(count);
		

	}
	
	static class pat{
		int p;
		int a;
		int t;
		pat(int p,int a,int t){
			this.p=p;
			this.a=a;
			this.t=t;
		}
		public int getP() {
			return p;
		}
		public void setP(int p) {
			this.p = p;
		}
		public int getA() {
			return a;
		}
		public void setA(int a) {
			this.a = a;
		}
		public int getT() {
			return t;
		}
		public void setT(int t) {
			this.t = t;
		}
		
	}

}
