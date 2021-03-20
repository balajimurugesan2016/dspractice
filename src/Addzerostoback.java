
public class Addzerostoback {
	
	public static void addzerostoback(int[] data, int len){
		int low = 0;
	
	
		for(int i=0;i<=len;i++) {
			
			if(data[i] != 0) {
				
				data[low++] = data[i];
			}
			
		}
		
	while(low<=len) {
		
		  data[low] = 0;
		  low++;
		
	}

	}
	
	
	

	public static void main(String[] args) {
		 int [] data = {1,3,0,0,4,0,9};
		 addzerostoback(data,data.length - 1);
		 for(int i=0;i<data.length;i++) {
			   System.out.println(data[i]);
		   }
		 

	}

}
