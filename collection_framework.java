// collection framework
// import java.util.ArrayList;
// class Main{
//     public static void main(String[] args){
//         ArrayList<String> cars = new ArrayList<String>();
//         cars.add("Volvo");
//         cars.add("BMW");
//         cars.add("Ford");
//         cars.add("Mazda");
//         System.out.println(cars);
//         System.out.println(cars.get(0));
//         cars.set(0,"Opel");
//         System.out.println(cars);
//         cars.remove(0);
//         System.out.println(cars);
//         System.out.println(cars.size());
//         cars.clear();
//         System.out.println(cars);
//     }
// }
// import java.util.ArrayList;
// class Main{
//     public static void main(String[] args){
//         ArrayList<Integer> list = new ArrayList<Integer>();
//         list.add(10);
//         list.add(15);
//         list.add(20);
//         list.add(25);
//         for(int i : list){
//             System.out.println(i);

//         }
//     }


       
// create a linked list
// import java.util.LinkedList;
// class Main{
//     public static void main(String[] args) {
//         LinkedList<String> cars = new LinkedList<String>();
//         cars.add("Volvo");
//         cars.add("BMW");
//         cars.add("Ford");
//         cars.add("Mazda");
//         System.out.println(cars);
        
//     }
// }



// import java.util.LinkedList;
// class Main{
//     public static void main(String[] args) {
//         LinkedList<Integer> list = new LinkedList<Integer>();
//         list.add(10);
//         list.add(15);
//         list.add(20);
//         list.add(25);
//         int middle = list.size()/2;
//         System.out.println(list.get(middle));
//     }
// }



// pre build function uses of collection framework with a random examples in table form
// import java.util.ArrayList;
// import java.util.LinkedList;

// public class CollectionExamples {

//     // ArrayList operations example
//     public static void demonstrateArrayList() {
//         ArrayList<String> cars = new ArrayList<>();
//         cars.add("Volvo");
//         cars.add("BMW"); 
//         cars.add("Ford");
        
//         System.out.println("ArrayList: " + cars);
//     }
    

//     // LinkedList operations example 
//     public static void demonstrateLinkedList() {
//         LinkedList<Integer> numbers = new LinkedList<>();
//         numbers.add(10);
//         numbers.addFirst(5);
//         numbers.addLast(15);
//         System.out.println("LinkedList: " + numbers);
//     }
    

//     // Common List methods example
//     public static void demonstrateListMethods() {
//         ArrayList<String> fruits = new ArrayList<>();
//         fruits.add("Apple");
//         fruits.set(0, "Orange"); 
//         fruits.remove(0);
//         System.out.println("Size: " + fruits.size());
//     }
    

//     // Iterate through collection example
//     public static void demonstrateIteration() {
//         LinkedList<Integer> list = new LinkedList<>();
//         list.add(1);
//         list.add(2);
//         for(int i : list) {
//             System.out.println(i);
//         }
        
//     }

//     public static void main(String[] args) {
//         demonstrateArrayList();
//         demonstrateLinkedList();
//         demonstrateListMethods();
//         demonstrateIteration();
//     }
// }


// import java.util.ArrayList;
// import java.util.LinkedList;

// public class CollectionDemo {

    // // adding elements
    // public static void addElements() {
    //     ArrayList<String> list = new ArrayList<>();
    //     list.add("First"); // Add at end
    //     list.add(0, "Start"); // Add at index
        
    //     list.addAll(new ArrayList<>()); // Add all from collection
    //     System.out.println("After adding: " + list);
    // }
    

    // // removing elements  
    // public static void removeElements() {
    //     LinkedList<Integer> nums = new LinkedList<>();
    //     nums.add(1);
    //     nums.add(2); 
    //     nums.remove(0); // Remove by index
    //     nums.removeFirst(); // Remove first element
    //     System.out.println("After removing: " + nums);
        
    // }

    // // updating elements
    // public static void updateElements() {
    //     ArrayList<String> items = new ArrayList<>();
    //     items.add("Old");
    //     items.set(0, "New"); // Replace element
    //     System.out.println("After updating: " + items); 
    // }
    

    // // searching elements
    // public static void searchElements() {
    //     LinkedList<String> words = new LinkedList<>();
    //     words.add("Hello");
    //     System.out.println("Contains Hello: " + words.contains("Hello"));
    //     System.out.println("Index of Hello: " + words.indexOf("Hello"));
        
    // }

    // // list info methods
    // public static void listInfo() {
    //     ArrayList<Integer> nums = new ArrayList<>();
    //     System.out.println("Size: " + nums.size());
    //     System.out.println("Is Empty: " + nums.isEmpty());
    // }
    

//     public static void main(String[] args) {
//         addElements();
//         removeElements(); 
//         updateElements();
//         searchElements();
//         listInfo();
//     }
// }


// // searching oprations
// import java.util.ArrayList;
// import java.util.LinkedList;

// boolean exist = list.contains("Hello");
// int index = list.indexOf("Hello");
// int lastIndex = list.lastIndexOf("Hello");
// boolean empty = list.isEmpty();
// int size = list.size();


// LOOPS /ITERATE
// ----------------------------------------------------------------------------------------------------------------------------
// a) normal for loop
// import java.util.ArrayList;

// public class CollectionLoops {
//     // Demonstrating normal for loop iteration
//     public static void normalForLoop() {
//         ArrayList<String> list = new ArrayList<>();
//         list.add("Apple");
//         list.add("Banana");
//         list.add("Orange");

//         for(int i = 0; i < list.size(); i++) {
            
//             System.out.println(list.get(i));
//         }
        
//     }

//     public static void main(String[] args) {
//         normalForLoop();
//     }
// }
// ----------------------------------------------------------------------------------------------------------------------------
// b) for each loop
// public class CollectionLoops {

    // // Demonstrating for-each loop iteration
    // public static void forEachLoop() {
    //     ArrayList<String> list = new ArrayList<>();
    //     list.add("Apple");
    //     list.add("Banana");
    //     list.add("Orange");

    //     for(String item : list) {
    //         System.out.println(item);
    //     }
    // }
    // public static void main(String[] args) {
    //     forEachLoop();
    // }
    // ----------------------------------------------------------------------------------------------------------------------------
    // c) while loop
    // public class CollectionLoops {

        // // Demonstrating while loop iteration
        // public static void whileLoop() {
        //     ArrayList<String> list = new ArrayList<>();
        //     list.add("Apple");
        //     list.add("Banana");
        //     list.add("Orange");

        //     int i = 0;
        //     while(i < list.size()) {
        //         System.out.println(list.get(i));
        //         i++;
        //     }
        // }
        // public static void main(String[] args) {
        //     whileLoop();
        // }
        // ----------------------------------------------------------------------------------------------------------------------------
        // d) do while loop
        // public class CollectionLoops {

            // // Demonstrating do-while loop iteration
            // public static void doWhileLoop() {
            //     ArrayList<String> list = new ArrayList<>();
            //     list.add("Apple");
            //     list.add("Banana");
            //     list.add("Orange");

            //     int i = 0;
            //     do {
            //         System.out.println(list.get(i));
            //         i++;
            //     } while(i < list.size());
            // }
            // public static void main(String[] args) {
            //     doWhileLoop();
            // }
        // }
        // ----------------------------------------------------------------------------------------------------------------------------
        // e) iterator
        // public class CollectionLoops {

            // // Demonstrating iterator iteration
            // public static void iteratorLoop() {
            //     ArrayList<String> list = new ArrayList<>();
            //     list.add("Apple");
            //     list.add("Banana");
            //     list.add("Orange");

            //     java.util.Iterator<String> it = list.iterator();
            //     while(it.hasNext()) {
            //         System.out.println(it.next());
            //     }
            // }
            // public static void main(String[] args) {
            //     iteratorLoop();
            // }
        // }
        // ----------------------------------------------------------------------------------------------------------------------------
        // f) list iterator
        // public class CollectionLoops {

            // // Demonstrating list iterator iteration
            // public static void listIteratorLoop() {
            //     ArrayList<String> list = new ArrayList<>();
            //     list.add("Apple");
            //     list.add("Banana");
            //     list.add("Orange");

            //     java.util.ListIterator<String> it = list.listIterator();
            //     while(it.hasNext()) {
            //         System.out.println(it.next());
            //     }
            //     System.out.println("Reverse order:");
            //     while(it.hasPrevious()) {
            //         System.out.println(it.previous());
            //     }
            // }
            // public static void main(String[] args) {
            //     listIteratorLoop();
            // }
        // }
        // ----------------------------------------------------------------------------------------------------------------------------
        // g) enhanced for loop
        // public class CollectionLoops {

            // // Demonstrating enhanced for loop iteration
            // public static void enhancedForLoop() {
            //     ArrayList<String> list = new ArrayList<>();
            //     list.add("Apple");
            //     list.add("Banana");
            //     list.add("Orange");

            //     for(String item : list) {
            //         System.out.println(item);
            //     }
            // }
            // public static void main(String[] args) {
            //     enhancedForLoop();
            // }
        // }
    // }


