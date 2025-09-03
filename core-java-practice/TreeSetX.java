// 7) Use TreeSet:
// Store random integers in a TreeSet.
// Display them in ascending order == sorted.
import java.util.*;
import java.util.TreeSet;

public class TreeSetX
{
    public static void main(String[] args) 
    {
        Set<Integer> set = new TreeSet<Integer>();

        set.add(51);
        set.add(111);
        set.add(101);
        set.add(151);
        set.add(103);
        set.add(21);

        System.out.println("By default in ascending order : "+set);
    }
}
