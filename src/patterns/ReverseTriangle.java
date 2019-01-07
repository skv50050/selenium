package patterns;
import java.util.*;
class ReverseTriangle
{
 public static void main(String []args)
 {
  int i, j, k;
  System.out.print("Enter the Number of Lines :");
  Scanner s= new Scanner(System.in);
  k = s.nextInt();
  for(i=1; i<=k; i++)
  {
   for(j=k; j>=i; j--)
   {
    System.out.print("*\t");
   }
   System.out.println();
  }
 }
}