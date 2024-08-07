class intro{ 
    public static void main(String []args){
        Student s1=new Student("Biswarup",21);
        Student s2=new Student("SP",20);
        System.out.println(s1.Name+"   "+s1.age);
        System.out.println(s2.Name+"   "+s2.age);
        s1.change_name("bi");
        System.out.println(s1.Name+"   "+s1.age);
        System.out.println(s2.Name+"   "+s2.age);
    }
}
class Student{
    String Name;
    int age;
    void change_name(String Newname){
        this.Name=Newname;
    }
    Student(String s,int n){
        this.Name=s;
        this.age=n;
    }
}