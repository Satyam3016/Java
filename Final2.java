//"final" method: If we make any method as "final", we cannot "override" it.

//"final" class: If we make any class as "final", we cannot "extend" it.


final class Test1

{

	final void Run(int x)

	{

	   System.out.println("Hello World");

	}

}


class Test2 extends Test1

{

	void Run(int y)

	{

	   System.out.println("Hello JAVA");

	}


	public static void main(String[] args)

	{

	   Test2 ob = new Test2();

	}

}