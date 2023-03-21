public class BinarySearch{
	public static void main(String[] args){
		int[] a = {4,5,3,7,8,6,1,5,4,3,10};
		a = sort(a);

		for(int temp : a){
			System.out.print(temp+" ");
		}

		
	}
	public static int[] sort(int[] a){
		int l = a.length;
		int temp;
		int min=a[0];
		for(int i=0;i<l;i++){
			min = a[i];
			for(int j=i;j<l;j++){
				if(a[j]<min){
					temp = min;
					min = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	} 
}