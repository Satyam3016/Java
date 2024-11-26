// 'static' keyword:used for Memory management
// 'static' variable: common property for all objects(e.g college name of students, organization name of employess)

class Student2{
	int id; //instance variable non-static 
	String name;//Data Member non-static 
	static String cleg="SVIMS";//static variable
	static void Update()
	{
		cleg="MAKAUT";
	}
	void Input(int id,String name)//Member Function & non-static 
	{
		this.id=id;
		this.name=name;
	}
	void Output() //non-static function
	{
		System.out.println("ID: "+id+" Name: "+name+" College Name:"+cleg);
	}
	public static void main(String args[])
	{
		Student2 s1=new Student2();
		Student2 s2=new Student2();
		s1.Input(10,"Ayan");
		s2.Input(20,"Ajay");
		s1.Output();
		s2.Output();
		Update();//calling of static method without object of the class
		s1.Output();
		s2.Output();
	}
}