
public class MergeSortown {

	public void mergesort(int[] arr, int[] result, int low, int high) {

		if (low == high) {
			return;
		}

		int mid = (low + high) / 2;
		mergesort(arr, result, low, mid);
		mergesort(arr, result, mid + 1, high);
		merge(arr, result, low, mid, high);

	}

	public void merge(int[] arr, int[] result, int low, int mid, int high) {

		int i = low, k = low;
		int j = mid + 1;
		while (i <= low && j <= high) {
			if (arr[i] < arr[j]) {
				result[k++] = arr[i++];
			} else {
				result[k++] = arr[j++];
			}

		}

		while (i <= mid) {

			result[k++] = arr[i++];
		}
		while (j <= high) {

			result[k++] = arr[j++];
		}
		
		for(int l = low;l <= high; l++) {
			
			arr[l] = result[l];
		}
		
		

	}

	public static void main(String[] args) {
		MergeSortown mso = new MergeSortown();
		int[] data = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int[] result = new int[data.length];
		mso.mergesort(data, result, 0, data.length - 1);
		for (int i = 0; i < data.length; i++) {

			System.out.println(data[i]);
		}
	}

}
