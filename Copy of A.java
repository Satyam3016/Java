//Constructor: It's a special type of member function whose name is same as class name, does
//not have any return type not even void. It is called automatically when we create the 
//object of the class. It is mainly used to initialize the instance variable(s).
//2 types of Constructor: 1. Default 2. Parameterized
class A
{
	A(int i)//constructor
	{
		System.out.println("Constructor is created	"+i);
	}	
	public static void main(String args[])
	{
		A obj=new A(5);
	}
}