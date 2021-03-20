
public class AddZerostofront {

	public static void addzerostofront(int [] arr, int len)
	{
		
		int high = arr.length - 1;
		for(int i = len;i>=0;i--)
		{
			if(arr[i] != 0) {
				arr[high] = arr[i];
				high--;
			
			}
		}
		while(high>=0) {
			arr[high] = 0;
			high--;
		}
		
		
	}
	
	
	public static void main(String[] args) {
	   int [] data = {1,3,0,0,4,0,9};
	   addzerostofront(data,data.length - 1);
	   for(int i=0;i<data.length;i++) {
		   System.out.println(data[i]);
	   }
	}

}
