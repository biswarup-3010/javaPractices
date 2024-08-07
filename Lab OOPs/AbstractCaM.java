class AbstractCaM{
    public static void main(String[] args){
        B obj = new B();
        obj.massage();
        obj.msg2();
    }
} 
abstract class A{ // Abstract class
    abstract void massage(); //abstract methods cannot have a body
    void msg2(){
        System.out.println("Normal msg2");
    }
}
class B extends A{
    void massage(){
        System.out.println("Massage of class B Normal");
    }
}