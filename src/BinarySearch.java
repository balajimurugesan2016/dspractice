
public class BinarySearch {

	public int search(int[] arr, int key, int low, int high) {

		if ((low > high) || arr.length < 1) {
			return -1;
		}

		if (arr.length == 1) {

			if (arr[0] == key) {
				return 0;
			} else {
				return -1;
			}
		}

		int mid = (low + high) / 2;

		if (arr[mid] == key) {

			return mid;

		} else if (arr[mid] > key) {

			return search(arr, key, mid + 1, high);
		} else {
			return search(arr, key, low, mid - 1);
		}
	}

	public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		int[] data = { 7,8,1,2,3,4,5,6 };
		System.out.println(bs.search(data, 1, 0, data.length - 1));

	}

}
