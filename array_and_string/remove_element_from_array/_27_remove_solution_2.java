package remove_element_from_array;

public class _27_remove_solution_2
{  

   //interpretation of the above code:
      // We iterate through each element of the array a.
      // If the current element is not equal to x, we keep it in the array.
      // We maintain a pointer k that indicates the position where the next non-x element should be placed.
      // The process continues until all elements have been checked, and we return the new size of the array.

   public static int removeElement(int[] a, int x)
   {
      int k = 0;
      // non-x means not equal to x
      // k is the index where the next non-x element will be placed
      // Initially, k is set to 0, meaning we will start placing non-x elements from the beginning of the array

      for(int i = 0; i < a.length; i++)
      {
         if(a[i] != x) // If the current element is not equal to x
         {
            a[k] = a[i];
            // Place the current element at index k
            // This effectively keeps all non-x elements at the beginning of the array
            k++;
            // Increment k to point to the next position for a non-x element
            
         } else {
            //skip
         }
      }
      return k;
   }

   public static void main(String[] args)
   {
      int[] a = {1,2,3,4,5,6,2,4};
      removeElement(a, 2);
      
      for(int num : a)
      {
         System.out.print(num + " ");
      }

      // System.out.println("done");

   }
}
