import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class fenghuo {
	
	static class fht{
		private int high=0;
		private int num=0;
		private fht next=null;
		private fht pre=null;
		public fht(int h,int n){
			high=h;
			num=n;
			next=null;
			pre=null;
		}
		public fht(){
			high=0;
			num=0;
			next=null;
			pre=null;
		}
		public int getHigh() {
			return high;
		}
		public void setHigh(int high) {
			this.high = high;
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		public fht getNext() {
			return next;
		}
		public void setNext(fht next) {
			this.next = next;
		}
		public fht getPre() {
			return pre;
		}
		public void setPre(fht pre) {
			this.pre = pre;
		}
		
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		fht header=new fht(),p=null;
		for(int i=0;i<n;i++){
			fht tmp=new fht(sc.nextInt(),i);
			if(i==0)
			{							
				header.setNext(tmp);
				p=header.getNext();
			}else if(i==n-1){
				p.setNext(tmp);
				tmp.setPre(p);
				tmp.setNext(header.getNext());
				header.getNext().setPre(tmp);
			}else{
				p.setNext(tmp);
				tmp.setPre(p);
				p=p.getNext();				
			}
		}
		fht f=header.getNext();
		for(int i=0;i<n;i++){			
			System.out.print(f.getNum()+""+f.getHigh());
			f=f.getNext();
		}
		
		List<Integer> list=new ArrayList<Integer>();
		
		fht m=header.getNext();
		for(int i=0;i<n;i++){
			fht one=m.getNext();
//			for()
			
			
			
		}
		
		

	}
	
	

}
