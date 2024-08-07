class RunTimePolymorphism{
    public static void main(String []args){
        A obj = new B();
        obj.massage();
    }
}
class A{
    void massage(){
        System.out.println("In Class A");
    }
}
class B extends A{
    void massage(){
        System.out.println("In Class B");
    }
}