
public class maxvalbinarysearch {
	
	public static int binarySearch(int [] arr, int start, int end) {
		if(start > end) {
			
			return -1;
		}
		
		int mid = (start + end) / 2;
		
		if(arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1] ) {
			
			return mid;
			
		}
		
         if(arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
			
			return binarySearch(arr,mid + 1, end);
			
		}
         else
         {
        	 return binarySearch(arr,start, mid - 1);
         }
		
	}

	public static void main(String[] args) {
		int [] arr = { 1, 2, 3, 4, 5, 120, 180, 190, 3, 2, 1 };
		System.out.println(binarySearch(arr,0,arr.length - 1));
		
		
	}

}
