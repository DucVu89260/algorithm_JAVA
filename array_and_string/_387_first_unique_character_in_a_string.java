public class _387_first_unique_character_in_a_string {

   //interpretation of the code below:
      //The first unique character in a string is the character that appears only once in the string.
      //The function firstUniqChar takes a string as input and returns the index of the first unique character.
      //If there is no unique character in the string, the function returns -1.


   public static int firstUniqChar(String s) {
      int[] count = new int[123];
      // ASCII values of characters range from 0 to 122, so we create an array of size 123
      // to count occurrences of each character in the string.

      char[] arr = s.toCharArray();
      // Convert the string to a character array for easier processing.

      for(int i = 0; i < arr.length; i++) {
         char c = arr[i];
         // For each character in the array, we count its occurrences.

         int index = (int) c;
         // Convert the character to its ASCII value to use as an index in the count array.
         
         count[index]++;
         // Increment the count for this character.
      }

      for (int i = 0; i < arr.length; i++) {
         char c = arr[i];
         int index = (int) c; 
         if(count[index] == 1) { 
            // If the count of this character is 1, it means it's unique.
            // We return the index of the first unique character.
            return i; 
         }
      }

      return -1; 
    }

   public static void main(String[] args) {
      String s = "iloveleetcodeiface";
      int result = firstUniqChar(s);
      System.out.println("The index of the first unique character is: " + result);
   }
}
