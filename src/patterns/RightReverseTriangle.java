package patterns;
import java.util.*;
class RightReverseTriangle
{
 public static void main(String []args)
 {
  int i, j, k, l;
  System.out.print("Enter the Number of Lines :");
  Scanner s= new Scanner(System.in);
  k = s.nextInt();
  l = k-1;
  for(i=k; i>=1; i--)
  {
   for(j=l; j>=i; j--)
   {
    System.out.print("\t");
   }
   for(j=i; j>=1; j--)
   {
    System.out.print("*\t");
   }
   System.out.println();
  }
 }
}