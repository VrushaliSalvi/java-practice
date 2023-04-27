//Print Greatest of three numbers using Conditional operator in java

class Conditional3 {
public static void main(String[] args) 
{
//Three input numbers 
int a = 80;
int b = 65;
int c = 95;

int result = ( a > b ) ? (a > c ? a : c) : ( b > c ? b : c);

System.out.println("Here is the Greatest of Three Number:"+result);
}
}
