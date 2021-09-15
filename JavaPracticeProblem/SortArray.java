import java.util.*;
class SortArray {  
  public static void main(String args[]) { 
	  int[] a = {0,23,14,12,9};
	  int n = a.length;
	  sortArray(a, n);
	  printArray(a);
  } 

	public static void sortArray(int[] a, int n){
		int midIndex, temp= 0;
		for(int i = 0; i < n-1; i++){
			midIndex = i;
			for(int j = i+1; j < n; j++){
				if(a[j] < a[midIndex]){
					midIndex = j;
				}
			}
			temp = a[i];
			a[i] = a[midIndex];
			a[midIndex] = temp;
		}
	}

	public static void printArray(int[] a){
		System.out.println(Arrays.toString(a));
	}
}