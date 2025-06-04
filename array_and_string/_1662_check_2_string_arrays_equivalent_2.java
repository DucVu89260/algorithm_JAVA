public class _1662_check_2_string_arrays_equivalent_2 {

   //interpretation of the code below:
      // The function arrayStringsAreEqual checks if two string arrays are equivalent.
      // Two string arrays are considered equivalent if they can be concatenated to form the same string.
      // The function first creates two empty strings r1 and r2.
      // It then iterates through each string in word1 and appends it to r1.
      // Next, it iterates through each string in word2 and appends it to r2.
      // Finally, the function returns true if r1 and r2 are equal, and false otherwise.

   public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
      String r1 = "";
      String r2 = "";

      for (String s : word1)
      {
         r1 += s; // Concatenate each string in word1 to r1
      }

      for (String s : word2)
      {
         r2 += s; // Concatenate each string in word1 to r1
      }

      return r1.equals(r2);
   }
   
   public static void main(String[] args) {
      String[] word1 = {"ab", "c"};
      String[] word2 = {"a", "bc"};
      boolean result = arrayStringsAreEqual(word1, word2);
      System.out.println("Are them equivalent? " + result);
   }
}
