//Multi-level Inheritance
class Animal
{
	int k=10; //Data Member
	void eat(int x) // Method or Member Function
	{
		System.out.println("Eating");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking");
	}
}
class BabyDog extends Dog
{
	void weep()
	{
		System.out.println("Weeping");
	}
	public static void main(String args[])
	{
		BabyDog obj=new BabyDog();
		obj.eat(5);
		obj.bark();
		obj.weep();
		System.out.println(obj.k);
	}
}