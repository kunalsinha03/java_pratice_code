import java.util.Scanner;
public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close();
    }
}

//mport java.util.Scanner;
//unlic class NumberCheck {
//   public static void main(String[] args) {
//       Scanner scanner = new Scanner(System.in);
//       System.out.print("Enter a number: ");
//       int number = scanner.nextInt();
//
//       if (number > 0) {
//           System.out.println(number + " is a positive number.");
//       } else if (number < 0) {
//           System.out.println(number + " is a negative number.");
//       } else {
//           System.out.println("The number is zero.");
//       }
//
//       scanner.close();
//   }
//

//port java.util.Scanner;
//nlic class NumberCheck {
//  public static void main(String[] args) {
//      Scanner scanner = new Scanner(System.in);
//      System.out.print("Enter a number: ");
//      int number = scanner.nextInt();
//
//      if (number > 0) {
//          System.out.println(number + " is a positive number.");
//      } else if (number < 0) {
//          System.out.println(number + " is a negative number.");
//      } else {
//          System.out.println("The number is zero.");
//      }
//
//      scanner.close();
//  }
//