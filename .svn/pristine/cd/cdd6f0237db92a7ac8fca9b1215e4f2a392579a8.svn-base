import java.util.Scanner;


public class pucha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String young="",tmp;
		String old="";
		String oldbirthday="",youngbirthday="";
		String newname;
		int yx=0;
		for(int i=0;i<n;i++){
			newname=sc.next();
			tmp=sc.nextLine();
			tmp=tmp.trim();		
			if(tmp.compareTo("1814/09/06")<0||tmp.compareTo("2014/09/06")>0)
				continue;
			if(young==""||old==""){
				oldbirthday=tmp;
				youngbirthday=tmp;
				young=newname;
				old=newname;
			}else if(tmp.compareTo(oldbirthday)<0){
				oldbirthday=tmp;
				old=newname;
			}else if(tmp.compareTo(youngbirthday)>0){
				youngbirthday=tmp;
				young=newname;
			}
			yx++;	
		}
		System.out.print(yx+" "+old+" "+young);

	}

}

