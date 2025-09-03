
class GrandFather 
{
    public String property;
    public String name;

    GrandFather(String prop , String nm)
    {
        System.out.println("Grandfather called");
        this.property = prop;
        this.name = nm;
    }
    
    public void GrandFatherProperty()
    {
        System.out.println("GrandFather Property...");
        System.out.println("Property of GF : "+property);
        System.out.println("Name of GF : "+name);
    }
}

class Father extends GrandFather
{
    String fatherPro;
    String name;

    Father(String gfName , String gfProp , String nm , String fp)
    {
        super(gfName, gfProp);
        System.out.println("father called");
        this.name = nm;
        this.fatherPro = fp;
    }
    
    public void FatherProperty()
    {
        System.out.println("Father Property...");
        System.out.println("father property : "+fatherPro);
        System.out.println("father name : "+name);
    }
}
public class SingleInheritance 
{
    public static void main(String[] args) 
    {
        Father obj = new Father("BABA", "50 Cr","B F W", "10 Cr");

        obj.GrandFatherProperty();
        obj.FatherProperty();
    }
}
