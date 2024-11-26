//"Final" keyword: Can be used with "variable", "method" and "class". Mainly to restrict the user.

//"final" variable: If we make any variable as final, we cannot change he value(it will be constant).


class Test

{
	
	final int p= 100;//It is a constant


	void Fun()

	{
	   p=200;
	}


	public static void main(String[] args)
	
	{

	   Test ob = new Test();

	   ob.Fun();

	}

}