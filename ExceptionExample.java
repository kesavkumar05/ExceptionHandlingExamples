package ExceptionHandling;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int data = 80 / 0 ;  
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException Error");
		}  
		System.out.println("Rest of the Code...");  
	}  
}


