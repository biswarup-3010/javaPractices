import java.util.*;
class A1{
    public static void UseArrayList(){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(arr.get(0));
        arr.remove(0);
         for(int i : arr){
            System.out.println(i);
        }
    }
    public static void UseList(){
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        List<Integer> a = Arrays.asList(5,7,8);
        System.out.println(a.get(0));
        arr.remove(0);
         for(int i : a){
            System.out.println(i);
        }
    }
    public static void UseSet(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of elements : ");
        int n = sc.nextInt();
        // Set<Integer> s = new HashSet<>(); // unsorted ordered
        // Set<Integer> s = new LinkedHashSet<>(); // sorted ordered
        Set<Integer> s = new TreeSet<>();// sorted ordered
        while(n-- >0){
            int x = sc.nextInt();
            s.add(x);
        }
        for(int i : s){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String s[]){
        // UseArrayList();
        UseList();
        // UseSet();
    }
}