import java.util.Scanner;
class Exp{
	public static void main(String args[]) throws ArithmeticException{
		int a =10,b=0;
		try{
			int c = a/b;
			throw new ArithmeticException("Not Possible");
		}
		finally{
			System.out.println("End");
		}
	}
}
