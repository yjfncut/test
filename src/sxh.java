import java.util.Scanner;
import java.util.Stack;


public class sxh {

	/**
	 * @param args
	 */
	StringBuilder s=new StringBuilder();
	StringBuilder a=new StringBuilder();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack s=new Stack();
		System.out.print(s.peek());
//		int[][] a=new int[][];
		
	}
	
	
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;
	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	
    public void xx(TreeNode A,StringBuilder sb) {
		if(A!=null){
			sb.append(A.val);
			xx(A.left,sb);
			xx(A.right,sb);
		}
    }
	
    public void ad(int i,StringBuilder sb){
    	sb.append(i);
    }
	

}
