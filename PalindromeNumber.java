
public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 12321; // Example number
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int num) {
        String str = Integer.toString(num);
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }
}

//ublic class PalindromeNumber {
//   public static void main(String[] args) {
//       int number = 12321; // Example number
//       if (isPalindrome(number)) {
//           System.out.println(number + " is a palindrome.");
//       } else {
//           System.out.println(number + " is not a palindrome.");
//       }
//   }
//
//   public static boolean isPalindrome(int num) {
//       String str = Integer.toString(num);
//       String reversedStr = new StringBuilder(str).reverse().toString();
//       return str.equals(reversedStr);
//   }
//
//
//
//ublic class PalindromeNumber {
//   public static void main(String[] args) {
//       int number = 12321; // Example number
//       if (isPalindrome(number)) {
//           System.out.println(number + " is a palindrome.");
//       } else {
//           System.out.println(number + " is not a palindrome.");
//       }
//   }
//
//   public static boolean isPalindrome(int num) {
//       String str = Integer.toString(num);
//       String reversedStr = new StringBuilder(str).reverse().toString();
//       return str.equals(reversedStr);
//   }
//
//

