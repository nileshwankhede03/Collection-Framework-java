
import java.util.*;

public class GenericMapInputOutput 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // 👉 यहां तुम कोई भी Map implementation change कर सकते हो
        Map<Integer, String> map = new HashMap<>();
        // Map<Integer, String> map = new LinkedHashMap<>();
        // Map<Integer, String> map = new TreeMap<>();
        // Map<Integer, String> map = new Hashtable<>();

        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Input from user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter key (Integer): ");
            int key = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter value (String): ");
            String value = sc.nextLine();

            map.put(key, value);
        }

        System.out.println("\n--- Using Iterator ---");

        // ✅ Generic Iterator (works for all Map implementations)
        Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        sc.close();
    }
}

