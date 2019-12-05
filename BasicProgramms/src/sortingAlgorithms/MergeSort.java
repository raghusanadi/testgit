package sortingAlgorithms;

public class MergeSort {

	public void mergeSort(int[] arr, int low, int hi) {
		if (low < hi) {
			
			System.out.println("entering if with low:"+low+" high:"+hi);
			int mid = (low + hi) / 2;
			
			System.out.println("entering left merge sort  with low :"+low+" high:"+mid);
			mergeSort(arr, low, mid);
			System.out.println("returning from left sort low:"+low+" high:"+mid);
		
			System.out.println("entering right merge sort  with low :"+mid+" high:"+hi);
			mergeSort(arr, mid + 1, hi);
			System.out.println("returning from right sort  low:"+mid+" high"+hi);
		
			System.out.println("entering merge with low:"+low+" mid:"+mid+" hi:"+hi);
			merge(arr, low, mid, hi);
			System.out.println("returning merge with  low"+low+" mid:"+mid+" hi:"+hi);

		}
		System.out.println("exiting if with low:"+low+" high:"+hi);
	}

	void merge(int[] arr, int l, int mid, int r) {

		int n1 = mid - l + 1;
		int n2 = r - mid;
		int[] left = new int[n1];
		int[] right = new int[n2];

		for (int i = 0; i < n1; i++)
			left[i] = arr[l + i];
		for (int i = 0; i < n2; i++)
			right[i] = arr[mid + 1 + i];

		int k = l;
		int i = 0, j = 0;
		while (i < n1 && j < n2) {

			if (left[i] < right[j])
				arr[k++] = left[i++];
			else
				arr[k++] = right[j++];
		}
		while (i < n1) {
			arr[k++] = left[i++];
		}
		while (j < n2) {
			arr[k++] = right[j++];
		}

	}

	public static void main(String[] args) {
		int[] ar = { 1 ,2,25,21,98,35,100};
		MergeSort obj = new MergeSort();
		obj.mergeSort(ar, 0, ar.length - 1);
		for (int n : ar) {
			System.out.print(n + "  ");
		}

	}

}
