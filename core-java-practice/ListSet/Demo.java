// 1)Add & Display List:

// Create a List of integers.

// Add 10 numbers and display them using a loop.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
}
public class Demo 
{
    public static void main(String[] args) 
    {
        Test obj = new Test();
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter the number of that you want : ");
        int n = sobj.nextInt();
        obj.AcceptList(n);

        obj.DisplayList();
    }
}
