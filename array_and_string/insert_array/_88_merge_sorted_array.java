package insert_array;

public class _88_merge_sorted_array {
    public static void merge(int[] n1, int m, int[] n2, int n) {
        
        for(int ai:n2){
            insertIntoArray(ai , n1 , m);
            m++;
        }
    }

    private static void insertIntoArray(int a, int[] n, int m) {
        boolean foundK = false;
        for(int k = 0; k < m ; k++)
        {
            if(a < n[k]){
                foundK = true;

                for(int i = m - 1; i >= k; i--)
                {
                    n[i+1] = n[i];
                }
                n[k] = a;

                break;
            }
        }

        if(foundK == false)
        {
            n[m]= a;
        }

    }

    public static void main(String[] args) {
        int[] n1={2, 3, 4, 5, 0, 0, 0};
        int[] n2={0, 3, 6};
        
        merge(n1, 4, n2, 3);
        System.out.println("done");
    }
}
