
public class Perms {
	
	
	
	public void callPermutation(int n,Character[] totals,String val){
		
		
		if(n < 1) {
	      
			for(int i = 0;i< totals.length;i++) {
				
				System.out.print(totals[i]);
				
			}
		
			System.out.println();
		}
		
		else
		{

			for(int i = 0;i<val.length();i++) {
			
			   totals[n - 1] = val.charAt(i);
			   callPermutation(n - 1, totals, val);
			   totals[n - 1] = val.charAt(i);
			   
			}
			
		}

		
	}
	
	
	
	public static void main(String [] args) {
		
		Perms perm = new Perms();
		
		String test = "ABC";
		Character[] arr = new Character[3];
		perm.callPermutation(test.length(), arr, test);
		
	}

}
