
public class BinarySearchrotate {

	public static int search(int[] arr, int key, int start, int end) {

		if (start > end) {

			return -1;

		}
		int mid = (start + end) / 2;
		if (arr[mid] == key) {

			return mid;
		}

		if (arr[start] <= arr[mid]) {
			if (key > arr[start] && key < arr[mid]) {
				return search(arr, key, start, mid - 1);
			}

			return search(arr, key, mid + 1, end);
		}
	

		if (key >= arr[mid] && key < arr[end]) {
			return search(arr, key, mid + 1, end);
		}

		return search(arr, key, start, mid - 1);

	}

	public static void main(String[] args) {

		int[] val = {  7,8,1,2,3,4,5,6 };
		int searchterm = 1;

		System.out.println(search(val, searchterm, 0, val.length - 1));

	}

}
