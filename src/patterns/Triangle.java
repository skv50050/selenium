package patterns;
import java.util.*;
class Triangle
{
 public static void main(String []args)
 {
  Scanner s= new Scanner(System.in);
  System.out.print("Enter the Number of Lines :");
  int i,j,k;
  char ch= 'a';
  i= s.nextInt();
  for(j=1; j<=i; j++)
  {
   for(k=1; k<=j; k++)
   {
    System.out.print(ch+"\t");
    ch++;
   }
   System.out.print("\n");
  }
 }
}