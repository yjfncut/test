package goodfuture;

import java.util.PriorityQueue;
import java.util.Scanner;

public class lessk {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		String[] sa=s.split(" ");
		PriorityQueue<cl> p=new PriorityQueue<cl>();
		for(int i=0;i<sa.length-1;i++){
//			if(p.size()<Integer.valueOf(sa[sa.length-1])){
				p.add(new cl(sa[i]));
//			}else{
//				p.remove(sa.length-1);
//			}
		}
		for(int i=0;i<Integer.valueOf(sa[sa.length-1])-1;i++)
			System.out.print(p.poll().i+" ");
		System.out.print(p.poll().i);
		
		

	}
	
	static class cl implements Comparable<cl>{
		int i;

		public int compareTo(cl o) {
			return i-o.i;
		}
		cl(String s){
			this.i=Integer.valueOf(s);
		}
		
	}

}
