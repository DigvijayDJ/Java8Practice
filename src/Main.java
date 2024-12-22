public class Main {
    public static void main(String[] args) {
       String s1 = "abcba";
       String s2 = "Hello";
       char[] arr1 = s2.toCharArray();
       int l = arr1.length;
       for(int i = 0; i<l/2; i++){
           if(arr1[i] == arr1[l-i-1]){
               continue;
           }
           else {
               System.out.println("Not Palindrome");
               return;
           }
       }
    }
}