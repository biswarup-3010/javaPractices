class PassByRef{
	public static void main(String []args){
		Person obj = new Person("Bipul");
		System.out.println(obj.GetName());
		obj.SetName(obj);
		System.out.println(obj.GetName());
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
	public void SetName(Person s){
		s.name = "Biswa";
	}
}
