class SuperKeyword{
    public static void main(String []args){
        B obj = new B();
        // obj.show();
        // obj.fun(); // Super Method
    }
}
class A{
    int a = 10;
    A(){
        System.out.println("Super Class Constructor");
    }
    void fun(){
        System.out.println("Super Method");
    }
}
class B extends A{
    int a = 20;
    B(){
        System.out.println("Child Class Constructor");
    }
    void fun(){
        super.fun();
        System.out.println("Child Method");
    }
    void show(){
        System.out.println("Super : "+super.a); // Super variable
        System.out.println("Child : "+a);
    }
}