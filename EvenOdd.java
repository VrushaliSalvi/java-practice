import java.util.Scanner;

class EvenOdd {

    public static void main(String[] args) {

        Scanner Ps = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = Ps.nextInt();

        if(a % 2 == 0)
            System.out.println(a + " Is A Even Number");
        else
            System.out.println(a + " Is A Odd Number");
    }
}