
class Employee
{
    public int id;
    public String name;
    public static String company = "TCS";

    Employee(int id , String name)
    {
        this.id = id;
        this.name = name;
        // this.company = cmp;
    }

    public void Display()
    {
        System.out.println(id + " " + name);
    }

}
public class StaticDemo 
{

    public static void main(String[] args) 
    {
        System.out.println("Company name : "+Employee.company);

        Employee obj = new Employee(1, "Nilesh");
        obj.Display();
        
    }
}
