// 8)Iterate Set:

// Create a Set of strings.

// Use an Iterator to display all the elements.
import java.util.*;
import java.util.TreeSet;

public class SetIterator 
{
    public static void main(String[] args) 
    {
        Set<String> fruits = new HashSet<>();

        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        // Iterator banavala

        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
/*
Java में Iterator एक generic interface है।

Iterator<E>


यहाँ E मतलब है → वो data type जिसके elements आप iterate कर रहे हो।

🔹 next() का return type
E next()


👉 इसका मतलब है कि next() वही type return करेगा जो collection (Set/List/Map keys, etc.) का element type है।

Example 1: String Set
Set<String> set = new HashSet<>();
Iterator<String> itr = set.iterator();

String value = itr.next();   // return type = String


👉 यहाँ next() String return करेगा।

Example 2: Integer List
List<Integer> list = new ArrayList<>();
Iterator<Integer> itr = list.iterator();

Integer num = itr.next();    // return type = Integer


👉 यहाँ next() Integer return करेगा।

✅ Simple Rule:

Iterator<T> → next() का return type हमेशा T होगा।
 */
