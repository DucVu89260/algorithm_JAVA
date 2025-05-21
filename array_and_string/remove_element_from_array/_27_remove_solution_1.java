package remove_element_from_array;
public class _27_remove_solution_1
{
   public static int removeElement(int[] a, int val)
   {
        int n = a.length;

        for(int i = 0; i < n; )
        {
            if(a[i] == val)
            {
               // remove element a[i]
               for(int j = i; j <= (n-2); j++)
               {
                   a[j] = a[j+1];
               }
               n--;
            } else { // element no need to remove
               i++;
            }
        }

        return n;
   }

   public static void main(String[] args)
   {
      int[] a={0,1,2,2,3,0,4,2};
      removeElement(a, 2);
      
      for(int num : a)
      {
         System.out.println(num + "");
      }

      // System.out.println("done");
   }
}