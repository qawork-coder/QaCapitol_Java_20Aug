
public class ExceptionHandling1 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println(1 / 0);
		} catch (Exception e) {
			System.out.println("an error occured");
			e.printStackTrace();
		}

		System.out.println("tj");

	}

}
