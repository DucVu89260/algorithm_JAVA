public class _1662_check_2_string_arrays_equivalent_1 {

   //interpretation of the code below:
      // The function arrayStringsAreEqual checks if two string arrays are equivalent.
      // Two string arrays are considered equivalent if they can be concatenated to form the same string.
      // The function first creates two StringBuilder objects sb1 and sb2.
      // It then iterates through each string in word1 and appends it to sb1.
      // Next, it iterates through each string in word2 and appends it to sb2.
      // Finally, the function returns true if the strings represented by sb1 and sb2 are equal, and false otherwise.

   public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
      StringBuilder sb1 = new StringBuilder();
      StringBuilder sb2 = new StringBuilder();
      // Create two StringBuilder objects to hold the concatenated strings

      for (String str : word1) {
         sb1.append(str);
         // Append each string in word1 to sb1
      }

      for (String str : word2) {
         sb2.append(str);
      }

      return sb1.toString().equals(sb2.toString());
      // need to convert StringBuilder to String using toString() method
   }
   
   public static void main(String[] args) {
      String[] word1 = {"ab", "c"};
      String[] word2 = {"a", "bc"};
      boolean result = arrayStringsAreEqual(word1, word2);
      System.out.println("Are them equivalent? " + result);
   }
}
