import java.util.*;
public class Student_{
    String FirstName;
    String LastName;
    int age;
    int marks;
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Student_ s1=new Student_();
        Student_ s2=new Student_();
        // for s1 
        System.out.println("Enter name of S1 and S2 respectively :");
        s1.FirstName=sc.next();
        s1.LastName=sc.next();
        s2.FirstName=sc.next();
        s2.LastName=sc.next();
        System.out.println("Enter age of S1 and S2 respectively :");
        s1.age=sc.nextInt();
        s2.age=sc.nextInt();

        // print data 
        System.out.println("Name of S1 :"+s1.FirstName+" "+s1.LastName+" , Age "+s1.age);
        System.out.println("Name of S2 :"+s2.FirstName+" "+s2.LastName+" , Age "+s2.age);
    }
}