class Student{
	int id; //instance variable 
	String name;//Data Member
	int k=10;
	void Input(int id,String name)//Member Function
	{
		this.id=id;
		this.name=name;
	}
	void Output()
	{
		System.out.println("ID: "+id+" Name: "+name);
	}
	public static void main(String args[])
	{
		Student s1=new Student();
		Student s2=new Student();
		s1.Input(10,"Ayan");
		s2.Input(20,"Ajay");
		s1.Output();
		s2.Output();
		System.out.println(s1.k);
	}
}