
public class C extends B {

	public void fun3() {
		System.out.println("Class C");
	}

	public static void main(String args[]) {
		C obj = new C();
		obj.fun1();
		obj.fun2();
		obj.fun3();
	}
}
