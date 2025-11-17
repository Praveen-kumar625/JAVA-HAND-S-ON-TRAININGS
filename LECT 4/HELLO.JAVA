// // Check vowels and consonants in a String
// class Main{
//     public static void main(String[] args) {
//         String str = "Hello";
//         int v=0;
//         for(char ch : str.toCharArray){
//             if("aeiouAEIOU".indexOf(ch) != -1){
//                 v++;
//             }
//         }
//         System.out.println(v);
        
// }
        
//     }
// }





// // count freq of each character in a string


// class Main{
//     public static void main(String[] args) {
//         String str = "hello";
//         int freq[] = new int[256];
//         for(char ch : str.toCharArray()){
//             freq[ch]++;
//         }
//         for(int i=0; i<freq.length; i++){
//             if(freq[i] > 0){
//                 System.out.println((char)(i) + " : " + freq[i]);
//             }
//         }
//     }
// }




// // find sky value of a string
// class Main{
//     public static void main(String[] args) {
//         String str = "hello";
//         int skyValue = 0;
//         for(char ch : str.toCharArray()){
//             skyValue += (ch - 'a' + 1);
//         }
//         System.out.println(skyValue);
//     }
// }



// check anagram
class Main{
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        int freq[] = new int[256];
        for(char ch : str1.toCharArray()){
            freq[ch]++;
        }
        for(char ch : str2.toCharArray()){
            freq[ch]--;
        }
        boolean isAnagram = true;
        for(int count : freq){
            if(count != 0){
                isAnagram = false;
                break;
            }
        }
        System.out.println(isAnagram ? "Anagram" : "Not Anagram");
    }
}