import java.util.Scanner;

class FactorialNum
{
   public static void main(String[]args)
   {
      int X, i, a=1;
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter a Number: ");
      X = sc.nextInt();
      
      for(i=X; i>=1; i--)
      {
         a = a*i;
      }
      
      System.out.println("Here is the Factorial Result = " +a);
   }
}