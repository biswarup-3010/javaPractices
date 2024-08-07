import java.util.Scanner;
@FunctionalInterface
interface A{
	void show();
}
class First{
	public static void main(String args[]){
		// A obj = ()->System.out.println("Hello");
		// obj.show();
		Scanner sc = new Scanner(System.in);
		int i,j;
		i = sc.nextInt();
		j = sc.nextInt();
		try{
			i = i/j;
			System.out.println(i);
		}catch(Exception e){
			System.out.println("Default : " + i);
		}
	}
}
