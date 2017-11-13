import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class yihuo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] a=new int[n];
		int count=0;
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(yh(a[i],a[j])>m)
					count++;
			}
		}
		System.out.print(count);

	}
	
	public static int yh(int a,int b){
		int a1=0;
		int b1=0;
		List<Integer> num=new ArrayList();
		int sum=0;
		int ret=0,flag=0;
		while(a>0){
			a1=a1*10+a%2;
			a=a/2;
		}
		while(b>0){
			b1=b1*10+b%2;
			b=b/2;
			if(b1==0){
				b1=1;
			}
		}
		sum=a1+b1;
		while(sum!=0){
			num.add((sum%10)%2);
			sum/=10;
		}		
		for(int i=0;i<num.size();i++){
			ret+=num.get(i)*Math.pow(2, i);
		}
		return ret;	
	}

}
