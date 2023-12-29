//2.Create a class called Student. Inside the Student class, 
// implement the following instance variables (fields): 
// ● String name ● int age ● String department Implement the following constructors
//  in the Student class: ● A default constructor that initializes the 
//  name to "Unknown", age to 20, and department to "Unassigned". 
//  ● A constructor that takes two parameters: name and age, and initializes the department to "IT".
//  ● A constructor that takes three parameters: name, age, and department. In the Main class,
//   create instances of the Student class using each constructor.
//   Print out the details of each student, including their name, age, and department.

package Practice;

public class Student {
    private String name;
    private int age;
    private String department;

    //defult constructor
    public Student(){
        this.name = "Unknown";
        this.age = 20;
        this.department = "Unasssigned";
    }
    //constructor with 2 parameters
    public Student(String name, int age){
        this.name = name;
        this.age = age;
        this.department ="IT";
    }

      // Constructor with three parameters
      public Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

      public String getDepartment(){
        return department;
    }
    
    public static void main(String[] args){
        // Create instances using each constructor
        Student student1 = new Student(); // Default constructor
        Student student2 = new Student("John", 22); // Constructor with two parameters
        Student student3 = new Student("Alice", 25, "Physics"); // Constructor with three parameters
   
         // Print out the details of each student
         System.out.println("Student 1 Details:");
         System.out.println("Name: " + student1.getName());
         System.out.println("Age: " + student1.getAge());
         System.out.println("Department: " + student1.getDepartment());
         System.out.println();
 
         System.out.println("Student 2 Details:");
         System.out.println("Name: " + student2.getName());
         System.out.println("Age: " + student2.getAge());
         System.out.println("Department: " + student2.getDepartment());
         System.out.println();
 
         System.out.println("Student 3 Details:");
         System.out.println("Name: " + student3.getName());
         System.out.println("Age: " + student3.getAge());
         System.out.println("Department: " + student3.getDepartment());
    }
}
