//Method or Function Overloading (Polymorphism)
//If we have more than one function with same name within a class but the no. of paremeter or the types of parameter different
//By changing the no. of parameters 
class Over
{
	void sum(int x, int y)
	{
		System.out.println("Sum is"+(x+y));
	}
	void sum(int x, int y, int z)
	{
		System.out.println("Sum is"+(x+y+z));
	}
	public static void main(String args[])
	{
		Over obj=new Over();
		obj.sum(10,20,30);
		obj.sum(10,20);
		//obj.sum();
	}
}