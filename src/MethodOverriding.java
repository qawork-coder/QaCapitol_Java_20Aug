
public class MethodOverriding extends MethodOverridingBase {

	public void printName(int n) {
		System.out.println("ChildClass");
	}
	
	public static void main(String args[])
	{
		MethodOverriding obj=new MethodOverriding();
		obj.printName(10);
	}
	
}
