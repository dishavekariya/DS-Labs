public class SelectionSort{
	public static void main(String[] args) {
		int[] a = {3,1,9,7,4,5,6,4};
		int length = a.length;

		for(int i=0;i<length;i++){
			int min = a[i];
			int index = i;
			for(int j=i;j<length;j++){
				if(a[j]<min){
					min = a[j];
					index = j;
				}
				
			}
			a[index] = a[i];
			a[i] = min;
		}

		for(int i=0;i<length;i++){
			System.out.print(a[i] + " ");
		}
	}
}