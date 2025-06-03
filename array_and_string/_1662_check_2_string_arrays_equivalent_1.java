public class _1662_check_2_string_arrays_equivalent_1 {
   public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
      StringBuilder sb1 = new StringBuilder();
      StringBuilder sb2 = new StringBuilder();

      //this part sb1.append(str) means that we are appending each string in the array word1 to the StringBuilder sb1
      //so that we can compare the final string with the final string of word2

      //first we create a StringBuilder object sb1 and then we iterate through each string in the array word1
      //secondly we do the same for word2
      //and finally we compare the two StringBuilder objects sb1 and sb2

      for (String str : word1) {
         sb1.append(str);
      }

      for (String str : word2) {
         sb2.append(str);
      }

      return sb1.toString().equals(sb2.toString());
   }
   
   public static void main(String[] args) {
      String[] word1 = {"ab", "c"};
      String[] word2 = {"a", "bc"};
      boolean result = arrayStringsAreEqual(word1, word2);
      System.out.println("Are them equivalent? " + result);
   }
}
