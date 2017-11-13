import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String a=scanner.next();
		String b=scanner.next();
		String c=scanner.next();
		String d=scanner.next();
		String[] week={"MON","TUE","WED","THU","FRI","SAT","SUN"};
		int len1,len2,flag=0;
		if(a.length()>b.length())
			len1=b.length();
		else
			len1=a.length();
		
		if(c.length()>d.length())
			len2=d.length();
		else
			len2=c.length();
		
		for(int i=0;i<len1;i++){
			if(a.charAt(i)==b.charAt(i)&&flag==0&&a.charAt(i)>='A'&&a.charAt(i)<='z'){
				System.out.print(week[a.charAt(i)-'A']+" ");
				flag=1;
				continue;
			}
			if(a.charAt(i)==b.charAt(i)&&flag==1){
				if(a.charAt(i)<='9')
					System.out.print("0"+(a.charAt(i)-'0')+":");
				else
					System.out.print("1"+(a.charAt(i)-'A'+1)+":");
				break;
			}
		}
		

		for(int i=0;i<len2;i++){
			if(c.charAt(i)==d.charAt(i)&&c.charAt(i)!='&'){
				System.out.print(String.valueOf((i/10))+String.valueOf((i%10)));
				break;
			}
		}
	}
	
	

}
