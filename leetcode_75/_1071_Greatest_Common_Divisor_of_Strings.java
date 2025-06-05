package leetcode_75;

public class _1071_Greatest_Common_Divisor_of_Strings {
   public static String greatestCommonDivisorOfStrings(String str1, String str2) {
      if (str1.length() < str2.length()) {
         return greatestCommonDivisorOfStrings(str2, str1);
      }
      if (!str1.startsWith(str2)) {
         return "";
      }
      if (str2.isEmpty()) {
         return str1;
      }
      return greatestCommonDivisorOfStrings(str1.substring(str2.length()), str2);
   }

}
