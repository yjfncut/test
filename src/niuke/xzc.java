package niuke;

public class xzc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s="";
		
		Rotation r=new Rotation();
		
		r.chkRotation("RFSPUYLYR",9,"UYLYRRFSP",9);
		
	}
	int tmp=0;
    public int[] selectionSort(int[] A, int n) {
        for(int i=0;i<n;i++){
            int flag=A[i];
            int idx=i;
            for(int j=i+1;j<n;j++){
                if(A[j]<flag){
                    flag=A[j];
                    idx=j;
                }
            }
            tmp=A[j];
            A[j]=A[i];
            A[i]=tmp;
            
        }
        return A;
    }

    
	public static class Rotation {
		 public boolean chkRotation(String A, int lena, String B, int lenb) {
		        if(lena!=lenb)
		            return false;
		        char[] carray=(A+A).toCharArray();
		        char[] ba=B.toCharArray();
		        int flag=0;
		        for(int i=0;i<2*lena;i++){
		            for(int j=0;j<lenb;j++){
		                if(carray[i]==ba[j]){
		                   flag++;
		                   i++;
		                }else
		                    break;
		            }
		            if(flag==lenb)
		                return true;
		            else
		                flag=0;
		        }
		        return false;
		    }
	}

}
