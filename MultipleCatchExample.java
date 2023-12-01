package ExceptionHandling;

public class MultipleCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
		       int a[] = new int[5];
		       a[5] = 30 / 0;
		    } catch (ArithmeticException e) {
		       System.out.println("ArithmeticException  Error");
		    } catch (ArrayIndexOutOfBoundsException e) {
		       System.out.println("ArrayIndexOutOfBoundsException  Error");
		    } catch (Exception e) {
		       System.out.println("Parent Exception error");
		    }
		    System.out.println("Rest of the code...");


	}

}




  