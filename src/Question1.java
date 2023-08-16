// Java program to count frequencies of elements
import java.util.*;

class Sol {
    public static void countFrequencies(ArrayList<Integer> list)
    {

        // hash set is created and elements of
        // arraylist are inserted into it
        Set<Integer> st = new HashSet<Integer>(list);
        for (Integer s : st)
            System.out.println(s + " : " + Collections.frequency(list, s));
    }

    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(2);
        countFrequencies(list);
    }
}
