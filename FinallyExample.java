package ExceptionHandling;

public class FinallyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		int data = 25 / 5;
	    System.out.println(data);
	}
	catch (NullPointerException e) {
		System.out.println(e);
	}
	finally{
		System.out.println("Working Fine");
	}
	System.out.println("Rest of the Code...");
	}
}
