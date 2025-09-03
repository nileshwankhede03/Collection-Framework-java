import java.util.Hashtable;
import java.util.Map;

public class HashTable 
{
    public static void main(String[] args) 
    {
        Map<Integer,String> map = new Hashtable<>();

        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "C");
        // map.put(null, "A");
        // map.put(null, null);
        // map.put(7, null);

        for(Map.Entry<Integer,String> e : map.entrySet())
        {
            System.out.println(e.getKey()+" = "+e.getValue());
        }
    }
}
