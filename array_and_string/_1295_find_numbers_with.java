public class _1295_find_numbers_with {

    public static int FindNumbers(int[] nums) {

        int count=0;

        for(int a : nums){
            //kiem tra so chu so cua a
            //Neu nhu so chu so la Chan --> Tang bien dem them 1
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

        System.out.println(FindNumbers(nums));
    }
}
