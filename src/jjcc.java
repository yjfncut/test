import java.util.Scanner;


public class jjcc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s.replace("/", " ");
		String[] sarray=s.split(" ");
		int[] array=new int[4];
		for(int i=0;i<4;i++){
			array[i]=Integer.valueOf(sarray[i]);
		}
		int i=array[0]/array[1];

	}

}
