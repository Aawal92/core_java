package collections;

import java.util.ArrayList;
import java.util.List;

public class LearnCollection {

    /*
    LIST
        - Ordered collections of data
        - Able to hold duplicate value
        - Preserves insertion order ( can access and insert by position)
     */

    public static void main(String[] args){
        List<String> names = new ArrayList<>();
        names.add("Tareq");
        names.add("Dalal");
        names.add("Abdullah");
        names.add(2, "Tuhin");

        for(String name : names){
            System.out.println(name);
        }
    }
}
