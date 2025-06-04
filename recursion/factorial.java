package recursion;

public class factorial {
   public static int Factorial(int n)
    {
        if( n == 0 || n == 1) {
            return 1; // Base case: 0! = 1 and 1! = 1
        } else {
            return n * Factorial(n - 1); // Recursive case
        }
    }

    public static void main(String[] args) {
        int n = 5; // Example input
        int result = Factorial(n);
        System.out.println("Factorial of " + n + " is: " + result); // Output: Factorial of 5 is: 120
    }
}
