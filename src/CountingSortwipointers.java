
public class CountingSortwipointers {
	
	
	public static void swap(int [] data,int a, int b)
	{
		int temp = 0;
		temp = data[a];
		data[a] = data[b];
		data[b] = temp;
		
	}
	public static void swapwithpointers(int[] arr,int length) {
		int low  = 0;
		int high = length;
		int mid = low + 1;
		while(mid <= high) {
		  
			if(arr[mid] == 0) {			
				swap(arr,low,mid);
				low++;
				mid++;
			}
			else if(arr[mid] == 2) {
				swap(arr,high,mid);
				high--;

				
			}
			else if(arr[mid] == 1) {
				mid++;
			}
	
		}
		
		
		
		
	}

	public static void main(String[] args) {
		int [] data = { 2,1,1,0,1,2,1,2,0,0,0,1};
		swapwithpointers(data,data.length - 1);
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}

	}

}
