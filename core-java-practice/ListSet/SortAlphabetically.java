// 3)Sort List Alphabetically:

// Create a List of 5 country names and sort them alphabetically.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;

class Test 
{
    Scanner sobj = new Scanner(System.in);
    List<String> list = new ArrayList<>();

    public void AcceptList(int n)
    {
        System.out.println("Enter the country names : ");
        for(int i = 0; i < n; i++)
        {
            String value = sobj.nextLine();
            list.add(value);
        }
    }

    public void DisplayList()
    {
        System.out.println("Entered countries are : ");
        for(String values : list)
        {
            System.out.println(values);
        }
    }

    public void SortListAlphabetically()
    {
        // Convert List to TreeSet (automatically sorted, no duplicates)
        Set<String> sortedSet = new TreeSet<>(list);

        // Convert Set back to List
        List<String> sortedList = new ArrayList<>(sortedSet);

        System.out.println("Countries in alphabetical order : ");
        for(String country : sortedList)
        {
            System.out.println(country);
        }
    }
}

public class SortAlphabetically 
{
    public static void main(String[] args) 
    {
        Test obj = new Test();
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the number of countries you want : ");
        int n = sobj.nextInt();
        sobj.nextLine(); 

        obj.AcceptList(n);
        obj.DisplayList();
        obj.SortListAlphabetically();
    }
}
