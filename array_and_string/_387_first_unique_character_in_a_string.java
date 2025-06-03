public class _387_first_unique_character_in_a_string {
   public static int firstUniqChar(String s) {
      int[] count = new int[123];
      char[] arr = s.toCharArray();

      for(int i = 0; i < arr.length; i++) {
         char c = arr[i];
         int index = (int) c;
         count[index]++;
      }

      for (int i = 0; i < arr.length; i++) {
         char c = arr[i];
         int index = (int) c; 
         if(count[index] == 1) { 
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
