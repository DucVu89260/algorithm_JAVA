package sorting;

public class sorting_insertion {
   public static void printArray(int no, int[] a)
    {
        System.out.printf("%d: ", no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }

    public static void insertionSort(int[] a)
    {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            //inserting a[i] into the sorted sequence a[0..i-1]
            int ai = a[i];
            int j = i-1;
            while(j >= 0 && a[j] > ai) {
                a[j + 1] = a[j]; // Shift element to the right
                j--;
            }

            a[j + 1] = ai; // Place the element at its correct position
            printArray(i, a);
        }
    }

    public static void main(String[] args)
    {
        int[] a = {
            5, 2, 9, 1, 5, 6
        };

        insertionSort(a);

    }
}
