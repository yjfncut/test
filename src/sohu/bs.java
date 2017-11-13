package sohu;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class bs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Set set=new HashSet<Character>();
		while(sc.hasNext()){
			String s=sc.next();
			char[] c=s.toCharArray();
			baoshi[] b=new baoshi[c.length];
			for(int i=0;i<c.length;i++){
				b[i]=new baoshi(c[i]);
				if(i>=1){
					b[i-1].setNext(b[i]);
				}
			}
			b[c.length-1].setNext(b[0]);
			int flag=0;
			int minlen=Integer.MAX_VALUE;
			for(int i=0;i<c.length;i++){
				baoshi tmp=b[i];
				
				while(flag<c.length){
					if(tmp.getLeixing()>='A'&&tmp.getLeixing()<='E'){
						set.add(tmp.getLeixing());
					}else if(flag==0){
						tmp=tmp.getNext();
						continue;
					}
					if(set.size()==5){
						if(flag<minlen){
							minlen=flag;
						}
						break;
					}
					tmp=tmp.getNext();
					flag++;
				}
				flag=0;
				set.clear();
			}	
			System.out.println(c.length-minlen-1);
			minlen=Integer.MAX_VALUE;
			
			
		}

	}

	
	static class baoshi{
		char leixing;
		baoshi next;
		baoshi(char lx){
			leixing=lx;
		}
		public char getLeixing() {
			return leixing;
		}
		public void setLeixing(char leixing) {
			this.leixing = leixing;
		}
		public baoshi getNext() {
			return next;
		}
		public void setNext(baoshi next) {
			this.next = next;
		}
	}

}
