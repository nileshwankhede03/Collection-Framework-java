import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueFrequency 
{
    public static void main(String[] args) 
    {
        List<Integer> list = Arrays.asList(2,1,1,3,2,1);

        Map<Integer,Integer> map = new HashMap<>();

        for(Integer numbers : list)
        {
            map.put(numbers, map.getOrDefault(numbers, 0)+1);
        }

        List<Integer> list2 = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " -> "+ entry.getValue());

            if(entry.getValue() == 1)
            {
                list2.add(entry.getKey());
            }
        }

        System.out.println("Unique element is : "+list2);
    }
}
