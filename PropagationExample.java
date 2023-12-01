package ExceptionHandling;

public class PropagationExample {
	void my(){
		int data = 50 / 0;
	}
	
	void name(){
		my();
	}

	void pay(){
		try{
			name();
	    } 
		catch (Exception e){
	        System.out.println("exception is clear");
	     }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropagationExample obj = new PropagationExample();
	    obj.pay();
	    System.out.println("Rest of the Code...");
	}

}




  

