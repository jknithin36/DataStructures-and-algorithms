public class QuickSort {
  static int partition(int[] array, int start, int end) {
    int pivot = end;
    int i = start - 1;
    for (int j= start; j<=end; j++) {
      if (array[j] <= array[pivot]) {
        i++;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }
    return i;
  }

  public static void quickSort(int[] array, int start, int end) {
    if (start < end) {
      int pivot = partition(array, start, end);
      quickSort(array, start, pivot -1);
      quickSort(array, pivot + 1, end);
    }
  }





	public static void printArray(int []array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
		}
	}

}
/*Quick Sort 
 * Time Complexity : O(N logN);
 * Space Comlexity :O(n)
 * When To Use:
 * 1) When average Time time is O(NlogN)
 * eg: 1,3,4,5,6,7,8,2,9
 * When to Avoid:
 * 1)When Space is Concern
 * 2)When we need Stable Sort
 */