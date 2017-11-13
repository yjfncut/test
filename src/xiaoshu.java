import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class xiaoshu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr=new int[10];
		for(int i=0;i<10;i++)
			arr[i]=scanner.nextInt();
		
		for(int i=1;i<10;i++){
			if(arr[i]!=0){
				System.out.print(i);
				arr[i]--;
				break;
			}
		}
		
		for(int i=0;i<10;i++){
			for(int j=0;j<arr[i];j++)
				System.out.print(i);
		}

	


	}

}
