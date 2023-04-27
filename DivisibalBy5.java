import java.util.Scanner;

class DivisibleBy5
{
    public static void main(String[] args) 
    {
        int a;
        Scanner Ps = new Scanner(System.in);
        System.out.print("Enter any number:");
        a = Ps.nextInt();
        if(a % 5 == 0)
        {
            System.out.println(a+" is divisible by 5");
        }
        else
        {
            System.out.println(a+" is not divisible by 5");
        }
    }
}