public class _1662_check_2_string_arrays_equivalent_2 {
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
