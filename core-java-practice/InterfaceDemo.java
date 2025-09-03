
// interface Demo
// {
//     public abstract void m1();
//     public abstract void m2();
// }

// class Demo2 implements Demo
// {
//     public void m1()
//     {
//         System.out.println("Inside m1 method");
//     }

//     public void m2()
//     {
//         System.out.println("Inside m2 method");
//     }
// }

// public class InterfaceDemo 
// {
//     public static void main(String[] args) {
//         Demo2 obj = new Demo2();

//         obj.m1();
//         obj.m2();
//     }
// }

class Demo implements Runnable
{
    @Override
    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println(Thread.currentThread().getName()+ " - Count: " + i);
        }
    }
}
public class InterfaceDemo 
{
    public static void main(String[] args) {
        Demo obj = new Demo();

        // Runnable ko Thread object me pass karte hain
        Thread t1 = new Thread(obj, "Thread-1");
        Thread t2 = new Thread(obj, "Thread-2");

        t1.start();  // ye run() ko call karega
        t2.start();
    }
}

/*  

Interface : 

what is Marker interface ? 
= Empty interface is called as marker interface.
example : Serializable , cloneable etc...

What is Functional Interface ?
= it contains only the single abstract methods 
Example : Runnable and Comparable etc...

%%%%%%%%%%%%%%%     Runnable Interface      %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

Ye ek functional interface hai (isme sirf ek method hota hai: public void run();).

Ye mainly multithreading ke liye use hota hai.

Jab tumhe thread ke through koi kaam karwana ho, tab Runnable ka use karte hain.

🔹 Example 1: Basic Runnable
class MyTask implements Runnable {
    public void run() {
        // ye kaam thread ke through hoga
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyTask task = new MyTask();

        // Runnable ko Thread object me pass karte hain
        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();  // ye run() ko call karega
        t2.start();
    }
}


🔹 1. Serializable
Kya hai?

Serializable ek marker interface hai (matlab isme koi method nahi hota).

Ye Java ko signal deta hai ki is class ke objects ko file / network pe easily save aur transfer kiya jaa sakta hai.

Is process ko bolte hain Serialization (object → byte stream).

Aur jab wapas byte stream → object banta hai, usse bolte hain Deserialization.

Kyu use hota hai?

Jab tumhe object ko file me save karna ho (future use ke liye).

Jab tumhe object ko network ke through bhejna ho (jaise client-server apps me).

Example:
import java.io.*;

class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student(101, "Nilesh");

        // Object ko file me save karna
        FileOutputStream fos = new FileOutputStream("student.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);
        oos.close();

        // Object wapas lana (deserialize)
        FileInputStream fis = new FileInputStream("student.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student s2 = (Student) ois.readObject();
        ois.close();

        System.out.println(s2.id + " " + s2.name);
    }
}


👉 Isme Serializable interface lagana zaroori hai, warna NotSerializableException aayega.

🔹 2. Cloneable
Kya hai?

Cloneable bhi ek marker interface hai.

Ye Java ko signal deta hai ki is class ke objects ko duplicate (clone) kiya ja sakta hai.

Matlab ek existing object ka copy banana.

Kyu use hota hai?

Jab tumhe ek object ka same copy chahiye, bina manually naye object create karke values copy kare.

Useful in prototyping design pattern, games, simulations, etc.

Example:
class Student implements Cloneable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();   // Object class ka clone() call kiya
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student(101, "Nilesh");
        Student s2 = (Student) s1.clone();

        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);
    }
}


👉 Agar Cloneable interface implement nahi kiya, toh CloneNotSupportedException aayega.

🔹 Difference ek line me:

Serializable → object ko save/transfer karne ke liye (file/network).

Cloneable → object ka duplicate banane ke liye.
*/