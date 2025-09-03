import java.util.*;

class SetDemo 
{
    public static void main(String[] args) {
        // HashSet (no order)
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Banana");
        hashSet.add("Apple"); // duplicate, ignored
        System.out.println("HashSet: " + hashSet);

        // LinkedHashSet (insertion order)
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Mango");
        linkedHashSet.add("Banana");
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // TreeSet (sorted order)
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Mango");
        treeSet.add("Banana");
        System.out.println("TreeSet: " + treeSet);
    }
}

// HashSet: [Banana, Apple, Mango]   // random order
// LinkedHashSet: [Apple, Mango, Banana]  // insertion order
// TreeSet: [Apple, Banana, Mango]   // sorted order
