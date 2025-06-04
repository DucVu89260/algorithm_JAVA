package remove_element_from_array;
public class _27_remove_solution_1
{  

   //interpretation of the above code:
      // We iterate through each element of the array a.
      // If the current element is equal to val, we remove it by shifting all subsequent elements to the left.
      // The size of the array is reduced by one each time an element is removed.
      // The process continues until all elements have been checked.

   public static int removeElement(int[] a, int val)
   {
        int n = a.length;

        for(int i = 0; i < n; )
        {
            if(a[i] == val)
            {
               // If the current element is equal to val, we need to remove it
               for(int j = i; j <= (n-2); j++)
               {
                   a[j] = a[j+1];
                   // shift elements to the left
               }
               n--;
            } else {
               // if the current element is not equal to val
               // we just move to the next element
               i++;
            }
        }

        return n;
        // The new size of the array after removing all occurrences of val

   }

   public static void main(String[] args)
   {
      int[] a={0,1,2,2,3,0,4,2};
      removeElement(a, 2);
      
      for(int num : a)
      {
         System.out.print(num + " ");
      }

      // System.out.println("done");
   }
}