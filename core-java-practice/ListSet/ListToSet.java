// 6) Convert List to Set:

// Convert a List of names to a Set to remove duplicates.

// Print the original and the converted collections.

import java.util.*;

class Test 
{
    public void ConvertListToSet()
    {
        List<String> list = new ArrayList<>();

        list.add("Nilesh");
        list.add("Sumedh");
        list.add("Nilesh"); // duplicate
        list.add("Tanvi");
        list.add("Kshitij");
        list.add("Diksha");

        System.out.println("Original List : "+list);

        Set<String> set = new LinkedHashSet<>(list);

        List<String> update = new ArrayList<>(set);

        System.out.println("Updated list with unique elements : "+update);

    }
}

public class ListToSet
{
    public static void main(String[] args) 
    {
        Test obj = new Test();

        obj.ConvertListToSet();

    }
}
