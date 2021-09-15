import java.util.*;
class LAS {  
  public static void main(String args[]) { 
	  int[] a = {0,23,14,12,9,25,10,50,20};
	  int n = a.length;
	  int k = 4;
	  kthLargest(a, n,k);
	  System.out.println(" ");
	  kthSmallest(a, n ,k);
	  // printArray(a);
  } 

	//Sort in descending order
	public static void kthLargest(int[] a, int n, int k){
		for(int i = 0; i < n; i++){
			for(int j= i+1; j< n; j++){
				if(a[i] < a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			if(i == k-1){
				System.out.println(k+"th(Kth) largest element in the aray is: "+ a[i]);
			}
		}
		printArray(a);
	}


	//Sort in Ascending order
	public static void kthSmallest(int[] a, int n, int k){
		for(int i= 0; i < n; i++){
			for(int j = i+ 1; j < n; j++){
				if(a[i]>a[j]){
					int temp = a[j];
				    a[j] = a[i];
					a[i] = temp;
				}
			}
			if(i == k-1){
				System.out.println(k+"th(Kth) smallest element in the aray is: "+ a[i]);
			}
		}
		printArray(a);
	}

	public static void printArray(int[] a){
		System.out.println(Arrays.toString(a));
	}
}