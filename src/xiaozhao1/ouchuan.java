package xiaozhao1;

import java.util.Scanner;

public class ouchuan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int flag=0;
		s=s.substring(0,s.length()-2);
		while(s.length()>0){
			for(int i=0;i<s.length()/2;i++){
				if(s.substring(i, i+1).equals(s.substring(s.length()/2+i,s.length()/2+i+1))){
					flag++;
					continue;
				}else{
					flag=0;
					break;
				}
			}
			if(flag==0)
				s=s.substring(0,s.length()-2);
			else
				break;
		}
		System.out.print(flag*2);
		
	}

}
