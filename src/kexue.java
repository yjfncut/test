import java.util.Scanner;


public class kexue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int jinwei=0,dian = 0,jflag=0;
		String[] sarray=s.split("E");
		char[] c1=sarray[0].toCharArray();
		char[] c2=sarray[1].toCharArray();
		for(int i=c2.length-1;i>0;i--,jflag++){
			jinwei+=(c2[i]-'0')*Math.pow(10, jflag);				
		}
		
		for(int i=0;i<c1.length;i++){
			if(c1[i]=='.'){
				dian=i;
				break;
			}		
		}
		
		
		if(c1[0]=='+'){
			if(c2[0]=='+'){
				for(int i=1;i<=dian+jinwei;i++){
					if(i>=c1.length){
						System.out.print(0);
						continue;
					}						
					if(c1[i]=='.')
						continue;
					System.out.print(c1[i]);
				}
			}else{
				if(dian-jinwei-1<0)
					System.out.print("0.");
				for(int i=dian-jinwei-1;i<0;i++){
					System.out.print("0");
				}											
				for(int i=1;i<c1.length;i++){		
					if(c1[i]=='.')
						continue;
					System.out.print(c1[i]);
				}
				
			}
			
		}else{
			System.out.print('-');
			if(c2[0]=='+'){
				for(int i=1;i<=dian+jinwei;i++){
					if(i>=c1.length){
						System.out.print(0);
						continue;
					}						
					if(c1[i]=='.')
						continue;
					System.out.print(c1[i]);
				}
			}else{
				if(dian-jinwei-1<0)
					System.out.print("0.");
				for(int i=dian-jinwei-1;i<0;i++){
					System.out.print("0");
				}											
				for(int i=1;i<c1.length;i++){		
					if(c1[i]=='.')
						continue;
					System.out.print(c1[i]);
				}
				
			}
		}

	}

}
