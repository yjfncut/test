package niuke;

import java.util.*;




public class tp {

	public int[][] printTree(TreeNode root) {
		ArrayList<ArrayList<TreeNode>> result=new ArrayList<ArrayList<TreeNode>>();
		ArrayList<TreeNode> level=new ArrayList<TreeNode>();
		LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
		
		queue.add(root);
		TreeNode last=root;
		TreeNode nlast=root;
		TreeNode tmp=null;
		while(queue.size()!=0){
			tmp=queue.poll();
			level.add(tmp);
			if(tmp.left!=null){
				queue.add(tmp.left);
				nlast=tmp.left;
			}
			if(tmp.right!=null){
				queue.add(tmp.right);
				nlast=tmp.right;
			}
			if(tmp==last){
				last=nlast;
				result.add(level);
				level=new ArrayList<TreeNode>();
			}	
		}
		
		int[][] sum=new int[result.size()][];
		for(int i=0;i<result.size();i++){
			sum[i]=new int[result.get(i).size()];
			for(int j=0;j<result.get(i).size();j++)
				sum[i][j]=result.get(i).get(j).val;
		}
		
		
		
		return sum;
         
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;
	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
}
