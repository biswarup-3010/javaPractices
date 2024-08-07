import java.util.*;
public class ArList{
    public static void main(String args[]){
        // List<String> arr = new ArrayList<String> ();
        // List<String> arr = new LinkedList<String> ();
        // List<String> arr = new Vector<String> ();
        Stack<String> arr = new Stack<String> ();
        // arr.add("Biswa");
        // arr.add("Smritylekha");
        // arr.add("Pondit");
        arr.push("Biswa");
        arr.push("Smritylekha");
        arr.push("Biswa");
        arr.push("Smritylekha");
        arr.push("Biswa");
        arr.pop();
        Iterator<String> it = arr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
