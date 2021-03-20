
public class MergeSortRevision {

	private void split(int [] array,int low, int high) {
		if(high == low) {
			return;
		}
		
		int mid = ( low + high ) / 2;
		split(array,low, mid);
		split(array,mid + 1, high);
		merge(array,low,mid,high);
		
	
	}
	
	public void merge(int [] array, int low, int mid, int high) {
		int [] result  = new int[array.length];
		int i = low,k = low;
		int j = mid + 1;
		while(i <= mid && j <= high) {
			
			if(array[i] < array[j]) {
				
				result[k++] = array[i++];
				
			}
			else
			{
				result[k++] = array[j++];
			}
		}
		
		while(i <= mid) {
			result[k++] = array[i++];
		}
		while(j <= high) {
			result[k++] = array[j++];
		}
		
		for(i = low;i<=high;i++) {
			
			array[i] = result[i];
		}
		
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		MergeSortRevision msr = new MergeSortRevision();
		int [] arr = {10,9,8,7,6,5};
		msr.split(arr, 0, arr.length - 1);
	
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + ",");
		}

	}

}
