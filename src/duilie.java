import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;


public class duilie {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LinkedList<Integer> ll=new LinkedList<Integer>();
        int n = in.nextInt(),left=0,right=0,crazy=0;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
        	ll.addLast(nums[i]);
        }
        left=ll.removeLast();
        right=ll.removeFirst();
        crazy=Math.abs(left-right);
        for(int i=0;i<n-2;i++){
        	if(ll.size()==1)
        		break;
        	if(ll.size()==0)
        	{
        		System.out.print(crazy);
        		return;
        	}
        	if(i%2==0){
        		crazy+=Math.abs(right-ll.getLast());
        		crazy+=Math.abs(left-ll.getFirst());
        		left=ll.removeFirst();
        		right=ll.removeLast();
        	}else{
        		crazy+=Math.abs(left-ll.getLast());
        		crazy+=Math.abs(right-ll.getFirst());
        		right=ll.removeFirst();
        		left=ll.removeLast();
        	}

        }
        int last=Math.abs(ll.getLast()-left)>Math.abs(ll.getLast()-right)?Math.abs(ll.getLast()-left):Math.abs(ll.getLast()-right);
        System.out.print(crazy+last);
        
        

	}

}
