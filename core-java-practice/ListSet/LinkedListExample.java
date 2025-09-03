// 4)Use LinkedList:

// Use LinkedList to add 5 city names.

// Add an element at the beginning and at the end.

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();


        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Delhi");
        cities.add("Chennai");
        cities.add("Kolkata");

        System.out.println("Original Cities List: " + cities);

        cities.addFirst("Nagpur");

        cities.addLast("Hyderabad");

        System.out.println("Updated Cities List: " + cities);
    }
}
