package practice;

public class Exception {
	
	//throwing exception using throws keyword that might get encountered when divison is 0
	static int divide(int a, int b) throws ArithmeticException{
		if(b == 0) {
			//explictly throwing exception to handle gracefully
			throw new ArithmeticException("Divison by 0 not possible");
		}else {
			return a/b;
		}
	}
	
	public static void main(String[] args)  {
		//as an exception might get thrown using try catch block
		try {			
			System.out.println(divide(2,0));
		}catch(ArithmeticException e) {
			System.out.print(e);
		}
		
	}
}
