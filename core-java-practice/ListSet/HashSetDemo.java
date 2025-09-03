//5)Set Uniqueness Test:

// Create a HashSet of 5 integers.
// Try adding duplicate values and observe the result.

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo 
{
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(111);
        set.add(121);
        set.add(111);
        set.add(151);
        set.add(201);

        for(Integer values : set)
        {
            System.out.println(values);
        }


        // output
        // 151
        // 121
        // 201
        // 111

        // conclusion : duplicate not allow & order not maintained but faster.
    }
}
