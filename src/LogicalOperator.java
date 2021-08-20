
public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println((10>2)&&(5>2));//T&T=T
		System.out.println((10>2)&&(5<2));//T&F=F
		
		System.out.println((10>2)||(5>2));//T||T=T
		System.out.println((10>2)||(5<2));//T||F=T
		
		
		System.out.println(!((10>2)||(5>2)));//T||T=!(T)=F
		System.out.println(!((10>2)||(5<2)));//T||F=!(T)=F
	}

}
