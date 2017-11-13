package didi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class pinzhuo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int rs,xf,sum=0;
		int[] zhuozi=new int[n];
		keren full=new keren(Integer.MAX_VALUE,0);
		for(int i=0;i<n;i++)
			zhuozi[i]=sc.nextInt();
		List<keren> lkr=new ArrayList<keren>();
		for(int i=0;i<m;i++){
			rs=sc.nextInt();
			xf=sc.nextInt();
			lkr.add(new keren(rs,xf));
		}
		Collections.sort(lkr);
		555
		for(int i=0;i<n;i++){
			for(int j=lkr.size()-1;j>=0;j--){
				if(zhuozi[i]>=lkr.get(j).getRenshu()){
					sum+=lkr.get(j).getXiaofei();
					lkr.set(j, full);
					break;
				}
					
			}
		}
		System.out.print(sum);
		
		
		
		

	}
	
	static class keren implements Comparable<keren>{
		int renshu;
		int xiaofei;
		keren(int r,int x){
			renshu=r;
			xiaofei=x;
		}
		public int getRenshu() {
			return renshu;
		}
		public void setRenshu(int renshu) {
			this.renshu = renshu;
		}
		public int getXiaofei() {
			return xiaofei;
		}
		public void setXiaofei(int xiaofei) {
			this.xiaofei = xiaofei;
		}
		public int compareTo(keren o) {
			return xiaofei-o.getXiaofei();
		}
		
	}

}
