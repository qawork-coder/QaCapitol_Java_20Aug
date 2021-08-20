
public class MethodWithoutReturnType {

	public void checkEligibility() {

		int age = 10;

		if (age >= 18) {

			System.out.println("The person is eligible to vote");
		} else {
			System.out.println("The person is not eligible to vote");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//className objName=new className()
		MethodWithoutReturnType obj=new MethodWithoutReturnType();//Creating the object of the class
		obj.checkEligibility();//Calling the method
	}

}
