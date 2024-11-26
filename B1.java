// this() can be used to invoke current class constructor
// call to this() must be the first statement in constructor
class B1
{
	B1()
	{
		this(5);//it will invoke the Parameterized Constructor
		System.out.println("Default Constructor");

	}
	B1(int x)
	{
		
		System.out.println("Parameterized Constructor");
	}
	public static void main(String args[])
	{
		//this();
	
		B1 obj1=new B1();//it will invoke the Default Constructor
	}	
}