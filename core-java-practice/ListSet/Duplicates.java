// 2)Remove Duplicates:

// Write a Java program to remove duplicate elements from a List using a Set.

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class Test 
{
    Scanner sobj = new Scanner(System.in);
    List<Integer> list = new ArrayList<>();

    public void AcceptList(int n)
    {
        System.out.println("Enter the elements : ");
        for(int i = 0; i < n; i++)
        {
            int value = sobj.nextInt();
            list.add(value);
        }
    }

    public void DisplayList()
    {
        System.out.println("Entered the elements are : ");
        for(Integer values : list)
        {
            System.out.println(values);
        }
    }

    // remove duplicate
    public void RemoveDuplicate()
    {
        List<String> names = new ArrayList<>();

        names.add("Tejasvini");
        names.add("Nilesh");
        names.add("Tanvi");
        names.add("Ram");
        names.add("saad");
        names.add("Ram");

        System.out.println("Original List with names : "+names);

        // Step 2: Convert List to Set (Set removes duplicates automatically)
        Set<String> set = new LinkedHashSet<>(names);

        // Step 3: Convert Set back to List (if List required)
        List<String> Uniquelist = new ArrayList<>(set);

        System.out.println("Unique elements : "+Uniquelist);
    }
}

public class Duplicates 
{
    public static void main(String[] args) 
    {
        Test obj = new Test();
        Scanner sobj = new Scanner(System.in);

        // System.out.print("Enter the number of that you want : ");
        // int n = sobj.nextInt();
        // obj.AcceptList(n);

        // obj.DisplayList();

        obj.RemoveDuplicate();
    }
}
