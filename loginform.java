import java.util.Scanner;
import java.util.regex.*;
class loginform
{
	public static void main(String args[])
	{

		Scanner ps=new Scanner(System.in);
		String username,pwd,mobilenum;
		System.out.println("-----------Login Page-----------");
		System.out.println("Enter username : ");
		username=ps.nextLine();
		System.out.println("Enter Password : ");
		pwd=ps.nextLine();
		System.out.println("Enter Mobile Number : ");
		mobilenum=ps.nextLine();

		if(Pattern.matches("[a-zA-Z@]{4,}",username))//checking for username
		{
			if(Pattern.matches("[a-zA-Z0-9]{6,}",pwd))//checking for password
			{
				if(Pattern.matches("[0-9]{10}",mobilenum))//checking for Mobile number
				{
					if(pwd.equals("123456789"))//comparing password
						{
							System.out.println("Login success");
						}
						else{
								System.out.println("wrong password");
							}	
				}
				else{
				System.out.println("password is not valid");
				}
		}
		else{
				System.out.println("username is not valid");
			}


	}

}
}