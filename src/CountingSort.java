import java.util.Collection;

public class CountingSort {
	
	public static void sort(int [] array) {
		
		int zeros = 0;
		int ones = 0;
		int twos = 0;
		for(int i = 0;i<array.length;i++) {
			if(array[i] == 0) {
				++zeros;
			}
			else if(array[i] == 1) {
				++ones;
			}
			else if(array[i] == 2) {
				++twos;
			}
		
		}
		
		for(int i=0;i<array.length;i++) {
			if(zeros != 0) {
				array[i] = 0;
				zeros--;
			}
			else if(ones != 0){
				 array[i] = 1;
				 ones--;
			}
			else if(twos != 0) {
				array[i] = 2;
				twos--;
			}
			
			
			
		}
	
	}

	public static void main(String[] args) {
		int [] data = { 1,2,0,1,2,1,2,0,0,0,1,2};
		sort(data);
		for(int i = 0;i<data.length;i++) {
			System.out.println(data[i]);
		}
		
		

	}

}
