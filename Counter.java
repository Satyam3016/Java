//Static variable will get the memory only once, if any object changes the value of the static variable, it will ratain its value
class Counter
{
	static int c=0;
	Counter()
	{
		c++;
		System.out.println(c);
	}
	public static void main(String args[])
	{
		Counter k1=new Counter();
		Counter k2=new Counter();
		Counter k3=new Counter();
	}
}