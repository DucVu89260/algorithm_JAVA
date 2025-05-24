package remove_element_from_array;

public class _27_remove_solution_2
{
   public static int removeElement(int[] a, int x)
   {
      int k = 0;

      for(int i = 0; i < a.length; i++)
      {
         if(a[i] != x)
         {
            a[k] = a[i];
            k++;
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
      
      // for(int num : a)
      // {
      //    System.out.println(num + "");
      // }

      System.out.println("done");

   }
}
