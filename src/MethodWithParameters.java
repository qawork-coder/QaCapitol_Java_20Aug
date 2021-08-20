
public class MethodWithParameters {

	public void checkEligibility(int age) {

		//int age = 10;

		if (age >= 18) {

			System.out.println("The person is eligible to vote");
		} else {
			System.out.println("The person is not eligible to vote");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//className objName=new className()
		MethodWithParameters obj=new MethodWithParameters();//Creating the object of the class
		obj.checkEligibility(10);//Calling the method
	}

}
