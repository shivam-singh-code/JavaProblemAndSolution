import java.util.*;
class ArraysOF012S {  
  public static void main(String args[]) { 
    int[] a = {0,2,1,2,0};
	  int n = a.length;
	  sortArray(a, n);
	  printArray(a);
	  
  } 

	public static void sortArray(int[] a, int n){
		//Sorting arrays using three pointer
		int start = 0;
		int mid = 0;
		int piviot = 1;
		int end = n-1;

		while(mid <= end){
			if(a[mid]< piviot){
				swap(a, start, mid);
				start++;
				mid++;
			}
			else if(a[mid] > piviot){
				swap(a, mid, end);
				
				end--;
			}
			else{
				mid++;
			}
		}
	}

	public static void swap(int[]a, int i, int j){
		int temp = a[j];
		a[j] = a[i];
		a[i] = temp;
	}

	public static void printArray(int[] a){
		System.out.println(Arrays.toString(a));
	}
}