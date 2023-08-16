
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

        // displaying the original ArrayList
        System.out.println("Original ArrayList is : "
                + List);

        // converting the ArrayList to a HastSet.
        HashSet<String> hset = new HashSet<String>(List);

        // displaying the HastSet with only Unique values
        System.out.println("ArrayList Unique Values is : "
                + hset);
    }
}
