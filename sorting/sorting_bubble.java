package sorting;

public class sorting_bubble {
   public static void printArray(int no, int[] a)
    {
        System.out.printf("%d: ", no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }

    public static void bubbleSort(int[] a)
    {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    isSorted = false;
                    // Swap a[j] and a[j + 1]
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp; 
                }
            }
            printArray(i , a);
            if(isSorted) {
                break; 
            }
        }
    }

    public static void main(String[] args)
    {
        int[] a = {
            5, 2, 9, 1, 5, 6
        };

        bubbleSort(a);

    }
}
