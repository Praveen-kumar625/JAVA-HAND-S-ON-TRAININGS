// dATA INSERTION IN ARRAY LIST
/* 

import java.util.ArrayList;
import java.util.Collections;
import java.util.ArrayList;
class hello {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(1, 9);
        System.out.println(list);
    }
}

*/
/* 

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class student implements Comparable<student> 
{
    String name;
    int roll;
    int marks;
  public  student(String name, int roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }
    public int compareTo(student o) {
        return this.marks - o.marks;
    }
    public String toString() {
        return "student [name=" + name + ", roll=" + roll + ", marks=" + marks + "]";
    }

    class hello {
        public static void main(String[] args) {
            ArrayList<student> list = new ArrayList<>();
            list.add(new student("ram", 1, 90));
            list.add(new student("shyam", 2, 80));
            list.add(new student("mohan", 3, 70));
            System.out.println(list);
            Collections.sort(list);
            System.out.println(list.toString());
        }
    }

}
