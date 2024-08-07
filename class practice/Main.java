import java.lang.Integer;
class Main{
    static void swap(Integer a,Integer b){
        a=a+b;
        a=a-b;
        b=a-b;
    }
    public static void main(String args[]){
         Integer a=10;
         Integer b=20;
         swap(a,b);
         System.out.println("a = "+a+" b = "+b);
    }
}