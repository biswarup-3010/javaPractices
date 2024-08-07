import java.util.*;
class CheckVowel{
	static boolean isVowel(char c){
		
		if(c == 'a' || c=='e' || c=='i' || c=='o' || c == 'u') return true;
		return false;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character : ");
		char c = sc.next().toLowerCase().charAt(0);
		if(isVowel(c)) System.out.println("Vowel");
		else System.out.println("Not a Vowel");
	}
}
