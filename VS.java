import java.util.Scanner;

class VS
{
   public static void main(String[] args)
   {
      int a, b, Biggest;
      Scanner Sc=new Scanner(System.in);
      
      System.out.print("Enter the First Number: ");
      a = Sc.nextInt();
      System.out.print("Enter the Second Number: ");
      b = Sc.nextInt();
      
      if(a>b)
         Biggest = a;
      else
         Biggest = b;
      
      System.out.println("Here is the Biggest Numbr = " +Biggest);
   }
}