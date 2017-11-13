package pat_jia;

import java.util.Scanner;

public class fenshu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),fenzi=0,fenmu=1,a,b,zhengshu=0;
		String s="";
		String[] c=new String[2];
		jieguo jg=new jieguo(0,1,0);
		for(int i=0;i<n;i++){
			s=sc.next();
			c=s.split("/");
			a=Integer.valueOf(c[0]);
			b=Integer.valueOf(c[1]);
			jg=fenshuhe(a,b,jg);
		}
		if(jg.getFenzi()!=0&&jg.getZhengshu()!=0)
			System.out.print(jg.getZhengshu()+" "+jg.getFenzi()+"/"+jg.getFenmu());
		else if(jg.getZhengshu()==0&&jg.getFenzi()!=0)
			System.out.print(jg.getFenzi()+"/"+jg.getFenmu());
		else if(jg.getZhengshu()!=0&&jg.getFenzi()==0)
			System.out.print(jg.getZhengshu());
		else 
			System.out.print(0);
	}

	public static jieguo fenshuhe(int a1,int a2,jieguo jg){
		int fenmu=jg.getFenmu();
		int fenzi=jg.getFenzi();
		int zhengshu=jg.getZhengshu();
		int fz=a1*fenmu+a2*fenzi;
		int fm=a2*fenmu;
		zhengshu+=fz/fm;
		fz-=zhengshu*fm;
		int xiao=Math.abs(fz)>Math.abs(fm)?fm:fz;		
		for(int i=Math.abs(xiao);i>0;i--){				
			if(fz%i==0&&fm%i==0){
				fenzi=fz/i;
				fenmu=fm/i;
				break;
			}
		}
		jg.setFenmu(fenmu);
		jg.setFenzi(fenzi);
		jg.setZhengshu(zhengshu);
		if(xiao==0)
			jg.setFenzi(0);
		return jg;
	}
	
	static class  jieguo{
		int fenzi;
		int fenmu;
		int zhengshu;
		jieguo(int fz,int fm,int zs){
			fenzi=fz;
			fenmu=fm;
			zhengshu=zs;
		}
		public int getFenzi() {
			return fenzi;
		}
		public void setFenzi(int fenzi) {
			this.fenzi = fenzi;
		}
		public int getFenmu() {
			return fenmu;
		}
		public void setFenmu(int fenmu) {
			this.fenmu = fenmu;
		}
		public int getZhengshu() {
			return zhengshu;
		}
		public void setZhengshu(int zhengshu) {
			this.zhengshu = zhengshu;
		}
		
	}
}
