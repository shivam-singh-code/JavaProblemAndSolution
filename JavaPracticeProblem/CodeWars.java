public class CodeWars {
//   Create a function that accepts 2 string arguments and returns an integer of the count of occurrences the 2nd argument is found in the first one.

// If no occurrences can be found, a count of 0 should be returned.

// ("Hello", "o")  ==>  1
// ("Hello", "l")  ==>  2
// ("", "z")       ==>  0
  public static int strCount(String str, char letter) {    
    int count = 0;
      for(int i = 0; i < str.length(); i++){
       if(str.charAt(i) == letter){
         count++;
        } 
      }
    return count;
  }
}
