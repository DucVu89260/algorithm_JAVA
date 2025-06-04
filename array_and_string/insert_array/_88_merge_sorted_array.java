package insert_array;

public class _88_merge_sorted_array {

    //interpretation of the above code:
        // We iterate through each element of the second array (n2).
        // For each element, we find the correct position in the first array (n1) and insert it.
        // The correct position is determined by comparing the new element with the existing elements in n1.
        // If the new element is less than an existing element, we shift all elements to the right to make space for the new element.
        
        // This is done by shifting elements in n1 to the right to make space for the new element.
        // The new element is then inserted at the correct position.
        // This process is repeated for each element of the second array.
        // The final result is the merged array n1.

    public static void merge(int[] n1, int m, int[] n2, int n) {
        
        for(int ai : n2){
            insertIntoArray(ai , n1 , m);
            m++;
        }
    }

    private static void insertIntoArray(int a, int[] n, int m) {
        boolean foundK = false;
        for(int k = 0; k < m ; k++)
        {
            if(a < n[k]){
                // If the new element is less than the current element in the array
                // we need to insert it at this position
                foundK = true;

                //n[m-1] is the last element in the array
                // We start from the end of the array and shift elements to the right
                for(int i = m - 1; i >= k; i--)
                {
                    n[i+1] = n[i];
                }
                // Shift elements to the right to make space for the new element

                n[k] = a;
                // Insert the new element at the found position

                break;
            }
        }

        if(foundK == false)
        {
            n[m]= a;
            // If the new element is greater than all existing elements, append it at the end
        }

    }

    public static void main(String[] args) {
        int[] n1={2, 3, 4, 5, 0, 0, 0};
        int[] n2={0, 3, 6};
        
        merge(n1, 4, n2, 3);
        System.out.println("done");
    }
}
