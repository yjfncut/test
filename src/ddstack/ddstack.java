package ddstack;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class ddstack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		downStack ds=new downStack();
		Scanner sc=new Scanner(System.in);
		Set<String> set=new HashSet<String>();
		int n=sc.nextInt(),sum=0;			
		int[] array=new int[n];
		for(int i=0;i<n;i++){
			array[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++){
			ds.clean();
			ds.push(array[i]);
			for(int j=i+1;j<i+n;j++){
				if(array[j%n]>ds.peek()){
					if(set.contains(String.valueOf(i)+String.valueOf(j%n))||set.contains(String.valueOf(j%n)+String.valueOf(i))){
						ds.push(array[j%n]);
						continue;
					}
					set.add(String.valueOf(i)+String.valueOf(j%n));
					sum++;
					if(array[j%n]>array[i])
						break;
					else
						ds.push(array[j%n]);
				}else if(array[j%n]==ds.peek()){
					if(set.contains(String.valueOf(i)+String.valueOf(j%n))||set.contains(String.valueOf(j%n)+String.valueOf(i))){
						ds.push(array[j%n]);
						continue;
					}
					set.add(String.valueOf(i)+String.valueOf(j%n));
					sum++;
					ds.push(array[j%n]);
				}else{
					if(ds.size()<2){
						if(set.contains(String.valueOf(i)+String.valueOf(j%n))||set.contains(String.valueOf(j%n)+String.valueOf(i))){
							ds.push(array[j%n]);
							continue;
						}
						set.add(String.valueOf(i)+String.valueOf(j%n));
						sum++;
						ds.push(array[j%n]);
					}else if(ds.size()>=2){
						continue;
					}
					
					
//				ds.push(array[j%n]);
//				if(ds.size()==2){
//					if(set.contains(String.valueOf(i)+String.valueOf(j%n))||set.contains(String.valueOf(j%n)+String.valueOf(i)))
//						continue;
//					set.add(String.valueOf(i)+String.valueOf(j%n));
//					sum++;
				
				}
			}
		}
		
		System.out.print(sum);

	}
	

	
	public static class downStack{
		static Stack<Integer> stack=new Stack<Integer>();
		downStack(){}
		
		public static int push(int n){
			if(stack.empty()){
				return stack.push(n);
			}else{
				if(stack.peek()>n){
					return stack.push(n);
				}
				else if(stack.peek()==n){
					if(stack.size()==2){
						stack.pop();
						return stack.push(n);
					}else{
						return stack.push(n);
					}
				}
				else{
					while(!stack.empty()&&stack.peek()<n){
						stack.pop();
					}
					return stack.push(n);
				}
			}
		}
		
		public static int pop(){
			return stack.pop();
		}
		
		public static int peek(){
			return stack.peek();
		}
		
		public static int size(){
			return stack.size();
		}
		
		public static void clean(){
			stack.clear();
		}
		
	}
	

}
