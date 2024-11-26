//Constructor Overloading: Multiple constructor inside a class (i.e Default & Paramerized both)
class B
{
	B()
	{
		System.out.println("Default Constructor");
	}
	B(int x)
	{
		System.out.println("Parameterized Constructor");
	}
	public static void main(String args[])
	{
		B obj2=new B(); ///it will invoke the Default Constructor
	
		B obj1=new B(5);//it will invoke the Parameterized Constructor
	}	
}