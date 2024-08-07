import java.util.Scanner;

class T extends Thread {
    static int n = 0;
    int a = 0, b = 0;
    String s;

    public void run() {
        try {
            Scanner sc = new Scanner(System.in);
            if (n == 0) {
                a = sc.nextInt();
                b = sc.nextInt();
                a += b;
            } else if (n == 1) {
                // Consume the previous newline character
                s = sc.nextLine();
            }else if (n == 3) {
            	System.out.println("Sum = " + this.a);
        	}
            sc.close();
			
        } 
		catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        T t1 = new T();
        T t2 = new T();
        T t3 = new T();
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            n++;
            t2.join();
            n++;
            t3.join();
            n++;
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Print the sum outside the threads
        
    }
}
