
// son & daughter (child class ) && Father (parent class)
class Father
{
    Father()
    {
        System.out.println("cons of father called");
    }
    public void Fathermethod()
    {
        System.out.println("father ji called");
    }
}

class Son extends Father
{
    Son()
    {
        System.out.println("cons of son called");
    }
    public void Sonmethod()
    {
        System.out.println("beta called");
    }
}

class Daughter extends Father
{
    Daughter()
    {
        System.out.println("cons of Daughter called");
    }
    public void Daughtermethod()
    {
        System.out.println("beti ji called");
    }
}

public class HeirarchicleInheritance 
{
    public static void main(String[] args) 
    {
        Daughter obj = new Daughter();

        obj.Fathermethod();;
        obj.Daughtermethod();
        

        
        System.out.println("-------------------");

        // son
        Son sobj = new Son();
        sobj.Fathermethod();;
        sobj.Sonmethod();
    }
}
