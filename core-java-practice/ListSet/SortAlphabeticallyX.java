import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Test 
{
    Scanner sobj = new Scanner(System.in);
    List<String> list = new ArrayList<>();

    // Accept list from user
    public List<String> AcceptList(int n)
    {
        System.out.println("Enter the country names : ");
        for(int i = 0; i < n; i++)
        {
            String value = sobj.nextLine();
            list.add(value);
        }
        return list;  // return the ArrayList
    }

    // Sort and return ArrayList
    public List<String> SortListAlphabetically()
    {
        // Create a copy so original list is not changed
        List<String> sortedList = new ArrayList<>(list);

        // Sort alphabetically
        Collections.sort(sortedList);

        return sortedList;
    }
}

public class SortAlphabeticallyX
{
    public static void main(String[] args) 
    {
        Test obj = new Test();
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the number of countries you want : ");
        int n = sobj.nextInt();
        sobj.nextLine(); // consume newline

        // Accept countries
        List<String> countries = obj.AcceptList(n);
        System.out.println("\nOriginal List: " + countries);

        // Get sorted list
        List<String> sortedCountries = obj.SortListAlphabetically();
        System.out.println("\nSorted List (Alphabetical): " + sortedCountries);
    }
}
