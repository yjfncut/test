import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class reverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] li=new int[n];
		String p="";
		for(int i=0;i<n;i++){
			li[i]=sc.nextInt();		
		}		
		while(n!=0){
			if(n%2==0){
				p+=refirst(li)+" ";
				n--;
			}else{
				p+=relast(li)+" ";
				n--;
			}
		}
		
		System.out.print(p.substring(0, p.length()-1));

	}
	
	public static int relast(int[] array){
		int ret = 0;
		for(int i=array.length-1;i>0;i--){
			if(array[i]!=0){
				ret=array[i];
				array[i]=0;
			}
		}
		return ret;
	}
	
	public static int refirst(int[] array){
		int ret = 0;
		for(int i=0;i<array.length;i++){
			if(array[i]!=0){
				ret=array[i];
				array[i]=0;
			}
		}
		return ret;
	}

}
