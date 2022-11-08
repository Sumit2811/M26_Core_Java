package Strings.java;

public class MethodOverloading {

	public static void main(String[] args) {
		Poly obj=new Poly();
		obj.m();
		obj.m(45);
		obj.m(5.0);
		

	}

}
class Poly
{
	public void m()
	{
		System.out.println("No Arguments..");
	}
	
	public void m(int i)
	{
		System.out.println("Integer Arguments...");
	}
	
	public void m(double d)
	{
		System.out.println("Double Arguments...");
	}
}