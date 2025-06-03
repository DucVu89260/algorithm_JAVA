package two_dim_array;
public class _1672_richest_customer_wealth {
    public static int maximumWealth(int[][] accounts) {
        int numCustomers = accounts.length;
        int numBanks = accounts[0].length;
        int[] total_wealth = new int[numCustomers];


        int maxWealth = 0;

        for (int i = 0; i < numCustomers; i++) {
            int sumCustomer = 0;

            for (int j = 0; j < numBanks; j++) {
                sumCustomer += accounts[i][j];
            }
            total_wealth[i] = sumCustomer;

            if (sumCustomer > maxWealth) {
                maxWealth = sumCustomer;
            }
        }

        for(int i=1; i < total_wealth.length; i++) {
            System.out.println("Total wealth of customer " + i + ": " + total_wealth[i]);
        }
        return maxWealth;
    };

    public static void main(String[] args) {
        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 12},
            {4, 5, 6}
        };
        System.out.println(maximumWealth(accounts)); 
    }
}
