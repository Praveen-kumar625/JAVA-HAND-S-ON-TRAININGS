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

*/
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class student {
    String name;
    int roll;
    

    public student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
    class NameSorted implements Comparator<student> {
        public int compare(student s1, student s2) {
            return s1.name.compareTo(s2.name);
        }
    }
        class hello {
            public static void main(String[] args) {
                ArrayList<student> list = new ArrayList<>();
                list.add(new student("ram", 1));
                list.add(new student("shyam", 2));
                list.add(new student("mohan", 3));
                System.out.println(list);
                Collections.sort(list, new student().new NameSorted());
               for(student s:list)
                {
                  System.out.println(s.name+" "+s.roll);
                }
            }
        }
        class RollSorted implements Comparator<student> {
            public int compare(student s1, student s2) {
                return s1.roll - s2.roll;
            }
        }
        class hello {
            public static void main(String[] args) {
                ArrayList<student> list = new ArrayList<>();
                list.add(new student("ram", 1));
                list.add(new student("shyam", 2));
                list.add(new student("mohan", 3));
                System.out.println(list);
                Collections.sort(list, new student().new RollSorted());
               for(student s:list)
                {
                  System.out.println(s.name+" "+s.roll);
                }
            }
        }
    }
}