
public class MergeSort2 {
	
	public void mergesort(int [] arr,int [] res, int low,int high) {
		
		if(low == high) {
			return;
		}
		int mid = ( low + high ) / 2;
		mergesort(arr,res,low, mid);
		mergesort(arr,res,mid + 1, high);
		merge(arr,res,low,mid,high);
		
		
	}
	public void merge(int[] arr,int[] res, int low,int mid,int high) {
		int i = low, k = low;
		int j = mid + 1;
		while(i <= mid && j <= high) {
			if(arr[i] < arr[j]) {
				res[k++] = arr[i++];
			}
			else {
				res[k++] = arr[j++];
			}
		}
		
		while(i <= mid) {
			res[k++] = arr[i++];
		}
		while(j <= high) {
			res[k++] = arr[j++];
			
		}
		for(int l=low;l<=high;l++) {
			
			arr[l] = res[l];
		}
	
	}
	
	public static void main(String[] args) {
		MergeSort2 ms2 = new MergeSort2();
		int [] data = {10,9,8,7,6,5,4,3,2,1};
		int [] result = new int [data.length];
		ms2.mergesort(data, result, 0, data.length - 1);
		for(int i = 0;i <data.length;i++) {
			System.out.println(data[i]);
		}
		
		
	}
	
	

}
