import java.util.*;
class FreqCount {  
  public static void main(String args[]) { 
    int[] a = {1,2,3,4,5,1,2,3,4,5};
	  int n = a.length;
	  int x = 5;
	  System.out.println("Frequency of " + x + " in the array is: "+ freqCounter(a, n, x));
  } 

	public static int freqCounter(int[] a, int n, int x){
		int count = 0;
		for(int i =0; i < n; i++){
			if(a[i] == x){
				count++;
			}
		}
		return count;
	}
}