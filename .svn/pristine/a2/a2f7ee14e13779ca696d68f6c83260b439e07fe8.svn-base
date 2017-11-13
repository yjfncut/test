import java.util.Arrays;
import java.util.Scanner;


public class blackhole {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		int l=a.length();
		if(a.length()<4){
			for(int i=0;i<4-l;i++)
				a=a.concat("0");
		}
		int[] arr=toarray(a);
		int[] f=new int[4];
		int[] big=new int[4];
		int[] small=new int[4];
		int[] sz=toarray(a);
		while(true){
			big=bigarray(toarray(a));
			small=smallarray(toarray(a));
			for(int i=0;i<4;i++)
				System.out.print(big[i]);
			System.out.print(" - ");
			for(int i=0;i<4;i++)
				System.out.print(small[i]);
			System.out.print(" = ");
			f=jian(big, small);
			for(int i=0;i<4;i++)
				System.out.print(f[i]);
			
			a=ts(f);
			if(hole(f)==0)
				return;
			if(hole(f)==6174)
				return;
			System.out.println();
		}
		

	}
	
	public static int[] toarray(String s){
		int[] arr=new int[4];
		for(int i=0;i<4;i++){
			arr[i]=Integer.parseInt(s.substring(i, i+1));
		}				
		return arr;
	}
	
	
	public static int[] bigarray(int[] s){
		int flag=0;
		int[] tmp=new int[4];
		tmp=s;
		for(int i=0;i<4;i++){
			for(int j=i+1;j<4;j++){
				if(tmp[i]<tmp[j]){
					flag=tmp[i];
					tmp[i]=tmp[j];
					tmp[j]=flag;
				}
				
			}
		}				
		return tmp;
	}
	
	public static int[] smallarray(int[] s){
		int flag=0;
		int[] tmp=new int[4];
		tmp=s;
		for(int i=0;i<4;i++){
			for(int j=i+1;j<4;j++){
				if(tmp[i]>tmp[j]){
					flag=tmp[i];
					tmp[i]=tmp[j];
					tmp[j]=flag;
				}	
			}
		}				
		return tmp;
	}
	
	public static int[] jian(int[] big,int[] small){
		int[] arr=new int[4]; 
		for(int i=3;i>=0;i--){
				if(big[i]<small[i]){
					arr[i]=big[i]-small[i]+10;
					big[i-1]=big[i-1]-1;
				}else{
					arr[i]=big[i]-small[i];
				}
		}				
		return arr;
	}
	
	public static int hole(int[] big){
		int sum=0;
		for(int i=0;i<4;i++){
			sum=sum*10+big[i];
		}
		return sum;
		
	}
	public static String ts(int[] a){
		StringBuilder b=new StringBuilder();
		for(int i=0;i<4;i++){
			b.append(a[i]);
		}
		return b.toString();
		
	}
	
	
	

}
