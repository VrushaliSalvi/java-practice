class employee
{
	int empid;
	String empName;
	address adr;

	employee(int eid,String ename,address ad)
	{
		empid=eid;
		empName=ename;
		adr=ad;
	}

	public static void main(String vs[])
	{
		address a1=new address("jalna","Maharastra","India");
		address a2=new address("parbhani","Maharastra","India");

		employee e1=new employee(123,"Aditya",a1);
		employee e2=new employee(124,"Amay",a2);
		e1.display();
		e2.display();
	}

	public void display()
	{
		System.out.println(empid + " is " + empName + " from " + adr.City);
	}

}

class address
{
String City,State,Country;

address(String C, String St,String Co)
{
	City=C;
	State=St;
	Country=Co;
}

}