// abstract class contains 
// 1.Variables 2.Constructor 3.Abstract & Non - Abstract methods
// NOTE : Can not create object of abstract class
// USE : 1.use abstract keyword before class 
// 2.add abstract method before returntype and don't give body.

abstract class Demo 
{
    Demo()
    {
        System.out.println("Inside Demo constructor");
    }

    public void Display()
    {
        System.out.println("Inside Display method...");
    }

    public abstract void myAbstractMethod();
}

public class AbstractDemo extends Demo 
{
    public int a;
    public int b;

    public AbstractDemo()
    {
        System.out.println("Inside AbstractDemo class constructor");
    }
    @Override
    public void myAbstractMethod() // abstract method defination
    {
        System.out.println("Inside myAbstractMethod method defination");
    }

    public static void main(String[] args) 
    {
        // Demo obj = new Demo(); // ERROR : AbstractDemo is abstract; cannot be instantiated.
        // AbstractDemo obj = new AbstractDemo();
        // obj.Display();
        // obj.myAbstractMethod();

        // case 1
        Demo dobj = null;

        dobj = new AbstractDemo(); // dynamic dispaatching
        dobj.myAbstractMethod();
        dobj.Display();

    }
}
/*
parent class (Demo) jyat abstract method aahe
NOTE : 
    Kabhi kabhi object banane ki koshish hoti hai jo fail bhi ho sakti hai.Tab hum pehle null declare karke rakhte hain.

Connection con = null;
try {
    con = DriverManager.getConnection(...);
} catch(Exception e) {
    e.printStackTrace();
}
 */

/*
    Output:
        Inside Demo constructor
        Inside AbstractDemo class constructor
        Inside Display method...
        Inside myAbstractMethod method defination
 */

/*

### 🔹 Abstract Class in Java

* An **abstract class** is a class that may have **abstract methods** (methods without a body) as well as **concrete methods** (with a body).
* You **cannot create objects** of an abstract class directly.
* Abstract methods **must** be implemented by the first concrete subclass.

---

### 🔹 Dynamic Method Dispatch

* **Dynamic dispatch** = deciding at **runtime** which implementation of an overridden method will run.
* This happens when:

  1. A superclass reference variable points to a subclass object.
  2. An overridden method is called using that reference.
  3. JVM decides at runtime which method to call (subclass version or superclass version).

---

### 🔹 Is Dynamic Dispatch Necessary in Abstract Class?

👉 **Not always.**

* **Case 1 (Abstract methods)**
  If an abstract class has **abstract methods**, then yes, **dynamic dispatch is used** when you call those methods through a superclass reference.

  ```java
  abstract class Animal {
      abstract void sound();
  }

  class Dog extends Animal {
      void sound() { System.out.println("Bark"); }
  }

  class Cat extends Animal {
      void sound() { System.out.println("Meow"); }
  }

  public class Main {
      public static void main(String[] args) {
          Animal a;        // reference of abstract class
          a = new Dog();   // object of subclass
          a.sound();       // Bark (decided at runtime)

          a = new Cat();
          a.sound();       // Meow (decided at runtime)
      }
  }

  ✅ Here, **dynamic dispatch is happening**.

Case 2 (Concrete methods in abstract class)**
  If the abstract class has **normal methods**, then those can be called **without dynamic dispatch** (they behave like normal method calls).

  ```java
  abstract class Shape {
      void display() {
          System.out.println("This is a shape");
      }
  }

  class Circle extends Shape {}

  public class Main {
      public static void main(String[] args) {
          Shape s = new Circle();
          s.display();   // Directly from Shape (no dynamic dispatch needed)
      }
  }


✅ **Conclusion:**

* **Dynamic dispatch is not "necessary"** in abstract classes.
* But when you use **abstract methods + polymorphism**, **dynamic dispatch is the mechanism** that makes it work.

 */