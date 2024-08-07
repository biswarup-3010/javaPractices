class InterfaceApp{
    public static void main(String[] args){
        B obj = new B();
        obj.massage();
    }
}
interface A{
    void massage();
}
class B implements A{
    public void massage(){
        System.out.println("Interface demo");
    }
}