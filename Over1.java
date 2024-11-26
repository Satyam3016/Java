//Method or Function Overloading (Polymorphism)
//If we have more than one function with same name within a class but the no. of paremeter or the types of parameter different
//By changing the types of paremeters
class Over1
{
	void sum(int x, double y)
	{
		System.out.println("Sum is"+(x+y));
	}
	void sum(double x, int y)
	{
		System.out.println("Sum is"+(x+y));
	}
	public static void main(String args[])
	{
		Over1 obj=new Over1();
		obj.sum(10.5,20);
		obj.sum(10,2.5);
		//obj.sum();
	}
}