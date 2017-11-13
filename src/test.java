import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;


public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		List<tmp> l=new ArrayList<tmp>();
		PriorityQueue<tmp> l=new PriorityQueue<tmp>();
		l.add(new tmp(1));
		l.add(new tmp(5));
		l.add(new tmp(3));
		l.add(new tmp(2));
		l.add(new tmp(4));
		while(l.size()!=0)
			System.out.print(l.poll().getI());
	}
	
	static class tmp implements Comparable<tmp>{
		int i;
		tmp(int s){
			i=s;
		}
		public int compareTo(tmp o) {
//			return i-o.i;//从小到大排序
			return o.i-i;//从大到小排序
		}
		public int getI() {
			return i;
		}
		public void setI(int i) {
			this.i = i;
		}
		
		
	}

}
