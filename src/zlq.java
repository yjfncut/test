import java.util.Scanner;


public class zlq {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		String[] sarry1=s1.split("\\.");
		String[] sarry2=s2.split("\\.");
		int[] a1=new int[3];
		int[] a2=new int[3];
		int a=0,b=0,c=0;
		for(int i=0;i<3;i++){
			a1[i]=Integer.valueOf(sarry1[i]);
			a2[i]=Integer.valueOf(sarry2[i]);
		}
		
		
		
		if(((a1[0]*17+a1[1])*29+a1[2])>((a2[0]*17+a2[1])*29+a2[2]))
		{
		
		if(a1[2]-a2[2]<0){
			a=a1[2]-a2[2]+29;
			a1[1]--;
		}else{
			a=a1[2]-a2[2];
		}
		
		if(a1[1]-a2[1]<0){
			b=a1[1]-a2[1]+17;
			a1[0]--;
		}else{
			b=a1[1]-a2[1];
		}
		c=a1[0]-a2[0];
		System.out.print("-"+c+"."+b+"."+a);
		
		
		
		}else{

			if(a2[2]-a1[2]<0){
				a=a2[2]-a1[2]+29;
				a2[1]--;
			}else{
				a=a2[2]-a1[2];
			}
			
			if(a2[1]-a1[1]<0){
				b=a2[1]-a1[1]+17;
				a2[0]--;
			}else{
				b=a2[1]-a1[1];
			}
			c=a2[0]-a1[0];
			System.out.print(c+"."+b+"."+a);
		}
		
		
		
		
		
		

		

	}

}
