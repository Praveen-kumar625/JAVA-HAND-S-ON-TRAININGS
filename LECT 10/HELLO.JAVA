// WHAT IS DIAMOND PROBLEM
// DIAMOND PROBLEM IS A SITUATION IN WHICH A CLASS INHERITS FROM TWO CLASSES THAT HAVE A COMMON BASE CLASS. THIS CAN LEAD TO AMBIGUITY WHEN THE DERIVED CLASS TRIES TO ACCESS MEMBERS OF THE BASE CLASS, AS IT IS UNCLEAR WHICH PATH TO FOLLOW.
// BASIC INTERFACE IMPLEMENTATION


/* 
interface A{
    void show();
}
class B implements A{
    public void show(){
        System.out.println("Hello");
    }
}
class Main{
    public static void main(String[] args){
        B obj = new B();
        obj.show();
    }
}
*/

// if we implement interface method without public then compile time
// error should be occurred because interface method should be public
// but if we implement interface method as default then no error will be occurred
// point to be noted is that interface method should be public while implementing


// interface variable (public static final by default)

/* 
interface A {
    int data = 50; // public static final by default
    void display();
}
interface B {
    int data = 100; // public static final by default
    void display();
}
class C implements A, B {
    public void display() {
        System.out.println("Value of data from interface A: " + A.data);
        System.out.println("Value of data from interface B: " + B.data);
    }
}
class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.display();
    }
}
*/
// in the above code if we try to change the value of data variable then compile time
// error kya aa sakti hai?
// error aa sakti hai agar hum interface method ko public nahi banate hai
// error aa sakti hai agar hum interface variable ko change karne ki koshish karte hai
// error aa sakti hai agar hum interface variable ko directly access karte hai without interface name
// error aa sakti hai agar hum interface method ko override nahi karte hai while implementing


