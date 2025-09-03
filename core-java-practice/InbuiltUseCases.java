
class Employee 
{
    int empId;
    String empName;
    String experience;

    Employee(int id , String name , String exp)
    {
        this.empId = id;
        this.empName = name;
        this.experience = exp;
    }

    @Override
    public String toString() 
    {
        return "Employee [empID=" + empId + ", empName=" + empName + ", experience=" + experience + "]";
    }
}
public class InbuiltUseCases 
{
    public static void main(String[] args) 
    {
        Employee obj1 = new Employee(1, "Nilesh", "10 years");
        Employee obj2 = new Employee(2, "Tejaswini", "9 years");

        System.out.println(obj1);
        System.out.println(obj2);

        System.out.println(obj1.equals(obj2)); // comapring address
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

        System.out.println(obj1 == obj2);

        String female = "Tejasvini";
        String male = "Tejasvini";

        System.out.println("comparing actual contenent : " + female.equals(male)); // checks actual content
        System.out.println("comparing actual contenent : " + female == male); // compares address.
    }
}
