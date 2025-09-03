import java.util.*;

class Student 
{
    int rollNo;
    String name;

    // Constructor
    Student(int rollNo, String name) 
    {
        this.rollNo = rollNo;
        this.name = name;
    }

    // toString() method override for printing
    @Override
    public String toString() 
    {
        return "Roll No: " + rollNo + ", Name: " + name;
    }
}

public class UserDefinedListExample 
{
    public static void main(String[] args) 
    {
        // List of Student (user-defined class)
        List<Student> students = new ArrayList<>();

        // Adding objects into ArrayList
        students.add(new Student(101, "Nilesh"));
        students.add(new Student(102, "Rahul"));
        students.add(new Student(103, "Amit"));

        // Iterating (printing)
        for (Student s : students) 
        {
            System.out.println(s);
        }
    }
}
