import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class ListCode 
{
    public static void main(String[] args) 
    {
        // ArrayList list = new ArrayList();

        // list.add(11);
        // list.add(21);
        // list.add(51);
        // list.add(101);
        // list.add(101);

        // System.out.println(list.contains(11));
        // list.clear();
        // System.out.println(list);

        // System.out.println(list.isEmpty());
        // System.out.println(list.set(1, "Nilesh"));
        // System.out.println(list);


        // ArrayList<String> list2 = new ArrayList<>();

        // list2.add("Nilesh");
        // list2.add("Ram");
        // list2.add("Sumedh");

        // for(String str : list2) 
        // {
        //     System.out.println(str);
        // }

        // Give input on runtime

        // Scanner sobj = new Scanner(System.in);
        // System.out.println("_____________ArrayList_____________");
        // ArrayList<Integer> list = new ArrayList<>();

        // System.out.println("Enter number of elements : ");
        // int n = sobj.nextInt();

        // System.out.println("Enter the elements : ");
        // for (int i = 0; i < n; i++) 
        // {
        //     int value = sobj.nextInt();
        //     list.add(value);
        // }

        // System.out.println(list);


        // System.out.println("_____________VECTOR_____________");

        // Vector<Integer> vector = new Vector<>();

        // System.out.println("Enter the number of elemenrs : ");
        // int n1 = sobj.nextInt();

        // System.out.println("Enter the elements : ");
        // for(int i = 0; i < n1; i++)
        // {
        //     int value = sobj.nextInt();
        //     vector.add(value);
        // }

        // System.out.println("Entered elements are : ");
        // for (Integer vect : vector) {
        //     System.out.println(vect);
        // }

        Scanner sobj = new Scanner(System.in);
        System.out.println("_____________LinkedList_____________");

        LinkedList<Integer> linkedList = new LinkedList<>();

        System.out.println("Enter the number of elemenrs : ");
        int n3 = sobj.nextInt();

        System.out.println("Enter the elements : ");
        for (int i = 0; i < n3; i++) 
        {
            int value = sobj.nextInt();
            linkedList.add(value);
        }

        System.out.println("Entered elements are : ");
        for(Integer ll : linkedList)
        {
            System.out.println(ll);
        }


    }
}
