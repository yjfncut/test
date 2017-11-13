package meituan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class maxx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int min=1000001,smax=0,stmp=0;
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			min=a[i];
			for(int j=i;j<n;j++){
				if(a[j]<min){
					min=a[j];
				}
				stmp=min*(j-i+1);
				if(stmp>smax)
					smax=stmp;
			}
		}
		System.out.print(smax);
		
		
//		List<bar> pb=new ArrayList<bar>();
//		for(int i=0;i<n;i++){
//			pb.add(new bar(sc.nextInt(),i));
//		}
//		Collections.sort(pb);
		
		
		
		
//		int maxscur=0,maxsall=0;
		
	}
	
	public static int getmin(int[] a,int begin,int end){
		int min=a[begin];
		for(int i=begin;i<end;i++){
			if(a[i]<min)
				min=a[i];
		}
		return min;
	}
	
//	static class bar implements Comparable<bar>{
//		int high;
//		int downflag;
//		bar(int a,int b){
//			high=a;
//			downflag=b;
//		}
//		public int compareTo(bar o) {
//			return high-o.high;
//		}
//		public int getHigh() {
//			return high;
//		}
//		public void setHigh(int high) {
//			this.high = high;
//		}
//		public int getDownflag() {
//			return downflag;
//		}
//		public void setDownflag(int downflag) {
//			this.downflag = downflag;
//		}
//		
//		
//	}

}
