package sorting;

public class sorting_selection {
   public static void printArray(int no, int[] a)
    {
        System.out.printf("%d: ", no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }

    public static void selectionSort(int[] a)
    {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            if(minIndex != i) {
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }

            printArray(i, a);
        }
    }

    public static void main(String[] args)
    {
        int[] a = {
            5, 2, 9, 1, 5, 6
        };

        selectionSort(a);

    }
}
