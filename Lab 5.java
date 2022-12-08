/******************************************************************************
Lab 5
Create a class Person with two instance variables of type String called firstName and 
LastName, an instance variable of type int called age, an instance variables of type int 
called height (measured in inches), and an instance variable of type double called weight. 
Define an appropriate constructor that takes initial values for all instance variables and 
calls the corresponding set methods. Define get and set methods for all instance variables. 
All set (mutator) methods should validate that reasonable data is being passed to the 
object.
Then create a test application that queries the user for information and uses that 
information to create two objects of type Person. The application should display all 
information about both objects.
*******************************************************************************/
import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
    	    int age;
    	    int height;
    	    int person;
    	    int weight;
    	    String firstname;
    	    String lastname;
        	System.out.println("Please input your First Name: ");
        	firstname = input.nextLine();
        	System.out.println("Please input your Last Name: ");
        	lastname = input.nextLine();
            System.out.println("Please input the age: ");
        	age = input.nextInt();
        	System.out.println("Please input the height in inches: ");
        	height = input.nextInt();
        	System.out.println("Please input the weight in lbs: ");
        	weight = input.nextInt();
        	FirstName f = new FirstName(firstname);
        	LastName l = new LastName(lastname);
        	Age a = new Age(age);
        	Height h = new Height(height);
        	Weight w = new Weight(weight);
        	System.out.println(f.getFirstName());
        	System.out.println(l.getLastName());
        	System.out.println(a.getAge());
        	System.out.println(h.getHeight());
        	System.out.println(w.getWeight());
	    
	}
}

/*class Person {
    public int age;
    public String FirstName;
    public String LastName;
    public int height;
    public double weight;
    public void setData(int age, int height, double weight)
    {
        this.age = age;
        // this.FirstName = FirstName;
        // this.LastName = LastName;
        this.height = height;
        this.weight = weight;
    }
    public void display()
    {
        System.out.println("Age is " + age);
} */
class FirstName
{
    String FirstName;
    public FirstName(String f)
    {
        // System.out.println("Please enter the person's age")
        setFirstName(f);
    }
    public void setFirstName(String f)
    {
            FirstName = f;
    }
    public String getFirstName()
    {
        return FirstName;
    }
}
class LastName
{
    String LastName;
    public LastName(String l)
    {
        // System.out.println("Please enter the person's age")
        setLastName(l);
    }
    public void setLastName(String l)
    {
            LastName = l;
    }
    public String getLastName()
    {
        return LastName;
    }
}
class Age
{
    private int age;
    private double weight;
    public Age(int a)
    {
        // System.out.println("Please enter the person's age")
        setAge(a);
    }
    public void setAge(int a)
    {
        if (a > 0)
        {
            age = a;
        }
    }
    public int getAge()
    {
        return age;
    }
}
class Height
{
    private int height;
    public Height(int h)
    {
        // System.out.println("Please enter the person's age")
        setHeight(h);
    }
    public void setHeight(int h)
    {
        if (h > 0)
        {
            height = h;
        }
    }
    public int getHeight()
    {
        return height;
    }
}
class Weight
{
    private int weight;
    public Weight(int w)
    {
        // System.out.println("Please enter the person's age")
        setWeight(w);
    }
    public void setWeight(int w)
    {
        if (w > 0)
        {
            weight = w;
        }
    }
    public int getWeight()
    {
        return weight;
    }
}




