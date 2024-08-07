import java.util.Scanner;
class Test{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int x=1;
        do{
            x=sc.nextInt();
            if(x%10==0){
                break;
            }
        }while(x>=0 || x<0);
    }
}