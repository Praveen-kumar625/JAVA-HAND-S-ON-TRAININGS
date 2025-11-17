// JAY SHREE RAM


// TYPES OF VARIABLES IN JAVA
// 1. Local Variables
// 2. Instance Variables
// 3. Static Variables
// STATIC VARIABLES: static variables are also known as class variables.
// static variables are shared among all the objects of the class.

// // constructor
// class car{
// car(){
//     System.out.println("hello");
// }
// }
// class Main{
//     public static void main(String args[]){
//     Car obj=new Car();

//     }
// }


// // constructor with parameters
// class car{
//     Car(String String){
//     System.out.println(String);
//     }
//     }
//     class Main{
//         public static void main(String args[]){
//         Car obj=new Car("hello");
//         car obj2=new Car("jay shree ram");
    
//     }
//     }


// types of constructor
// 1. Default constructor
// 2. Parameterized constructor
// 3. Copy constructor
// DEFAULT CONSTRUCTOR: A constructor which does not have any parameters is known as default constructor.
// If we do not create any constructor in the class, then the Java compiler creates a default constructor for that class.
// The default constructor initializes all the member variables to zero or null values.



// class Car{
    
//     int a;
//     Car(int a){
       
//         this.a=a;
//     }
        
// }
// class Main{
//     public static void main(String args[]){
//     Car obj=new Car(5);
//     System.out.println(obj.a);
//     }
// }



// // // Create a class Student with fields name, rollNumber, and marks. Write a method to display student details. Create 3 student objects and display their data.
// class Student{
//     String name;
//     int rollNumber;
//     float marks;

//     Student(String name, int rollNumber, float marks){
//         this.name = name;
//         this.rollNumber = rollNumber;
//         this.marks = marks;
//     }

//     void displayDetails(){
//         System.out.println("Name: " + name);
//         System.out.println("Roll Number: " + rollNumber);
//         System.out.println("Marks: " + marks);
//         System.out.println();
//     }
// }
// class Main{
//     public static void main(String args[]){
//         Student s1 = new Student("PRAVEEN", 1, 80.1f);
//         Student s2 = new Student("JAY SHREE RAM", 2, 90.1f);
//         Student s3 = new Student("RUPESH", 3, 78.0f);

//         s1.displayDetails();
//         s2.displayDetails();
//         s3.displayDetails();
//     }
// }



// Create a class Rectangle with length and breadth as fields. Add methods to calculate area and perimeter. Create objects with different values and call those methods
// class Rectangle{
//     int length;
//     int breadth;

//     Rectangle(int length, int breadth){
//         this.length = length;
//         this.breadth = breadth;
//     }

//     int area(){
//         return length * breadth;
//     }

//     int perimeter(){
//         return 2 * (length + breadth);
//     }
// }
// class Main{
//     public static void main(String args[]){
//         Rectangle r1 = new Rectangle(5, 10);
//         Rectangle r2 = new Rectangle(7, 14);

//         System.out.println("Area of Rectangle 1: " + r1.area());
//         System.out.println("Perimeter of Rectangle 1: " + r1.perimeter());

//         System.out.println("Area of Rectangle 2: " + r2.area());
//         System.out.println("Perimeter of Rectangle 2: " + r2.perimeter());
//     }
// }



