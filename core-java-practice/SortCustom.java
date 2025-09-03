// 10) Sort Custom Objects:

// Create a class Employee with id, name, and salary.

// Store multiple objects in a List.
// Sort by salary in ascending order.

import java.util.*;

class Employee 
{
    public int id;
    public String name;
    public double salary;

    Employee(int id , String name , Double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + salary;
    }
}
public class SortCustom 
{
    public static void main(String[] args) 
    {
        List<Employee> list = new ArrayList<>(); // arraylist cha constructor madhe only collection ch paas kru shakto
        list.add(new Employee(1, "Nilesh", 180000d));
        list.add(new Employee(2, "Darshan", 160000d));
        list.add(new Employee(3,"sanika", 42425d));

        System.out.println("🔹 Original List:");
        for (Employee employee : list) {
            System.out.println(employee);
        }

        Collections.sort(list,Comparator.comparing(emp -> emp.salary)); // emp is a variable

        System.out.println("Check order : ");
        for (Employee e : list) {
            System.out.println(e);
        }
    }
}
