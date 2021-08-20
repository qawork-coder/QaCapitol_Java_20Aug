
public class MethodWithReturnTypes {
	
	public int sum()
	{
		//System.out.println(2+3);
		return 2+3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodWithReturnTypes obj=new MethodWithReturnTypes();
		int sum=obj.sum();
		
		System.out.println(obj.sum());
		
		System.out.println(sum);
	}

}
