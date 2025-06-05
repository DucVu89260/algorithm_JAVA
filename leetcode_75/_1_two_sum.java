package leetcode_75;

public class _1_two_sum {
   public static int[] twoSum(int[] nums, int target) {
      //better solution using a hashmap
      java.util.HashMap<Integer, Integer> map = new java.util.HashMap<>();
      for (int i = 0; i < nums.length; i++) {
         int complement = target - nums[i];
         if (map.containsKey(complement)) {
            return new int[] { map.get(complement), i };
         }
         map.put(nums[i], i);
      }
      return null;
   }

   public static void main(String[] args) {
      int[] nums = {2, 7, 11, 15};
      int target = 9;

      int[] result = twoSum(nums, target);
      System.out.println("Two keys that add up to " + target + " are: " + result[0] + " and " + result[1]);
   }
}