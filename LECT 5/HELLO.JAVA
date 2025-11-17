// // String
// class Main {
//     public static void main(String[] args) {
//         String s1 = "Hello";
//         String s2 = " ";
//         for(char ch : s1.toCharArray()) {
//             s2 += ch;
//         }
//         System.out.println(s2);
//     }
// }



// class Main {
//     public static void main(String[] args) {
//         StringBuilder str=new StringBuilder("Hello");    //  StringBuilder == mutable

//         System.out.println(str.length();
//         str.append(" j ");
//         System.out.println(str);
//         str.insert(0,"Hi ");
//         System.out.println(str);
//     }
// }

//             // 1 apppend()
//             val.append(" World");
//             System.out.println(val); 
//             // 2 insert()
//             val.insert(5, ",");
//             System.out.println(val); 
//             // 3 replace()
//             val.replace(0, 5, "Hi");
//             System.out.println("replace()" + val);
//             // 4 delete()
//             val.delete(0, 3);
//             System.out.println("delete()" + val);
//             // 5 reverse()
//             val.reverse();
//             System.out.println("reverse()" + val);
//             // 6 length()
//             System.out.println("length()" + val.length());
//             // 7 capacity()
//             System.out.println("capacity()" + val.capacity());
//             // 8 deleteCharAt()
//             val.deleteCharAt(2);
//             System.out.println("deleteCharAt()" + val);
//             // 9 setCharAt()
//             val.setCharAt(0, 'H');
//             System.out.println("setCharAt()" + val);
//             // 












// // reverse the string using split() and StringBuilder
// class Main {
//     public static void main(String[] args) {
//         String str = "i love java";
//         String a[] = str.split(" ");                    
//         StringBuilder result = new StringBuilder();

//         for (String ele : a) {
//             StringBuilder val = new StringBuilder(ele);
//             val.reverse();
//             result.append(val).append(" ");
//         }
//         System.out.println(result.toString());
//     }
// }




// compression of string
class Main {
    public static void main(String[] args) {
        String str = "aaabbccdee";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            result.append(str.charAt(i));
            if (count > 1) {
                result.append(count.toString());
            }
        }
        System.out.println(result.toString());
    }
}

