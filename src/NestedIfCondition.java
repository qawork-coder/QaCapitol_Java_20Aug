
public class NestedIfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age=10;
		String Country="US";
		

		if (age >= 18) 
		{
			System.out.println("The person is partially eligible to vote");
			if(Country.contains("India"))
			{
				System.out.println("You are eligible");
			}
			else
			{
				System.out.println("Not Indian");
			}
		} 
		else
		{
			System.out.println("The person is not eligible to vote");

		}

		
	}

}
