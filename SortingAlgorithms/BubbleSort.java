public class BubbleSort {
void bubbleSort(int arr[]){
  int n = arr.length;
  for(int i=0;i<n-1;i++){
    for(int j=0;j<n-i-1;j++){
     if(arr[j]>arr[j+1]){
      int temp = arr[j];
      arr[j]=arr[j+1];
      arr[j+1]= temp;
     }
    }
  }
}
void printArray(int arr[]){
  int n= arr.length;
  for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
  }
  System.out.println();
}
}


/*Bubble Sort
 * Time Complexity : O(N^2);
 * Space Comlexity :O(1)
 * When To Use:
 * 1) When input is almost sorted
 * 2) Space is concern
 * 3) Easy to implement
 * When to Avoid:
 * Average Time -Complexity is Poor
 */
