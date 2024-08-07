class PassThroughMethod{
	public static void main(String []args){
		Person p = new Person("Biswa");
		System.out.println("Before : " +p.GetName());
		p.SetName("S Pondit");
		System.out.println("After : " + p.GetName());
	}
}
class Person{
	private String name;
	Person(String Name){
		this.name = Name;
	}
	public String GetName(){
		return this.name; 
	}
	public void SetName(String s){
		this.name = s;
	}
}