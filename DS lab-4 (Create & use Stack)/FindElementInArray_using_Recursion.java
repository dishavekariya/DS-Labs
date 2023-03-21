public class FindElementInArray_using_Recursion{
	public static void main(String[] args) {
		int[] ar ={1,2,3,4,5};

		System.out.print(isThere(ar,4));
	}

	public static int isThere(int[] a,int n){
		if(a.length==0){
			return 0;
		}

		if(a[0]==n){
			return 1;
		}
		else{
			int[] b = new int[a.length-1];
			for(int i=0,j=1 ;j<a.length; i++,j++){
				b[i] = a[j];
			}
			return isThere(b,n);
		}

	}
}