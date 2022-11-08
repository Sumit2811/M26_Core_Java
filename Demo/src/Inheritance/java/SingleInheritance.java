package Inheritance.java;

public class SingleInheritance {

	public static void main(String[] args) {
		B obj=new B();
		obj.a=10;
		obj.b=20;
		obj.c=30;
		obj.show();
		obj.display();
		

	}

}
class A
{
	int a,b;
	
	void display()
	{
		System.out.println("I am coming From parent class "+a+" "+b);
	}
}
class B extends A
{
	int c;
	void show()
	{
		System.out.println("I am coming From child class "+a+" "+b+" "+c);
	}
}