// Get Unique Values from ArrayList in Java
import java.util.ArrayList;
import java.util.HashSet;

class Sol2 {

    public static void main(String[] args)
    {

        // Creating ArrayList
        ArrayList<String> List = new ArrayList<String>();

        // adding values in ArrayList
        List.add("a");
        List.add("b");
        List.add("c");
        List.add("b");
        List.add("d");
        List.add("a");
        List.add("c");

        // display original ArrayList
        System.out.println("Original ArrayList is : "
                + List);

        // converting the ArrayList to a HastSet.
        HashSet<String> hset = new HashSet<String>(List);

        // display HastSet
        System.out.println("ArrayList Unique Values is : "
                + hset);
    }
}
