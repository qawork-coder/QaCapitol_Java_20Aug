
public class MethodOverloading {

	public void sum() {
		System.out.println("no parameters");
	}

	public void sum(int a) {
		System.out.println("1 parameters");
	}

	public void sum(double a) {
		System.out.println("1 parameters");
	}

	public void sum(int a, int b) {
		System.out.println("2 parameters");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading obj = new MethodOverloading();
		obj.sum(1, 2);
		obj.sum();
		obj.sum(10.2);
		obj.sum(10);

	}

}
