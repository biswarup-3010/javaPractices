class PassByVal{
	public static void main(String []args){
		int val = 3;
		System.out.println("Before : " + val);
		mdfy(val);
		System.out.println("After : " + val);
	}
	public static void mdfy(int n){
		n = 1;
	}
}
