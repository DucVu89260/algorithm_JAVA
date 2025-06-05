package inspect_array;
public class _1295_find_numbers_with {

    //interpretation of the above code:
        // We are going to find the number of elements in the array nums that have an even number of digits.
        // We iterate through each element of the array nums.
        // For each element, we count the number of digits in that element.
        // If the number of digits is even, we increment the count variable.

    public static int FindNumbers(int[] nums) {

        int count=0;

        for(int a : nums){
            //count the number of digits in a
            //if the number of digits is even, increment count
            //else continue to the next element
            int numberOfDigits = countDigit(a);
            if(numberOfDigits % 2 == 0){
                count++;
            }
        }
        return count;
    }
    
    private static int countDigit(int a){
        int count = 0;
        int result=a;
        while(result != 0){
            result = a / 10;
            a= result;
            count ++;
        }
        return count;
    }

    public static void main(String[] args) {
        
        int[] nums = {1,22,3,4444,154789};

        System.out.println("Total numbers with even number of digits: " + FindNumbers(nums));
    }
}
