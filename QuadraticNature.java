import java.util.Scanner;

public class QuadraticNature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coefficients a, b and c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0)
            System.out.println("Real and Distinct roots");
        else if (discriminant == 0)
            System.out.println("Real and Equal roots");
        else
            System.out.println("Complex roots");
    }
}

//mport java.util.Scanner;
//
//ublic class QuadraticNature {
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//
//       System.out.print("Enter coefficients a, b and c: ");
//       double a = sc.nextDouble();
//       double b = sc.nextDouble();
//       double c = sc.nextDouble();
//
//       double discriminant = b * b - 4 * a * c;
//
//       if (discriminant > 0)
//           System.out.println("Real and Distinct roots");
//       else if (discriminant == 0)
//           System.out.println("Real and Equal roots");
//       else
//           System.out.println("Complex roots");
//   }
//
//
//mport java.util.Scanner;
//
//ublic class QuadraticNature {
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//
//       System.out.print("Enter coefficients a, b and c: ");
//       double a = sc.nextDouble();
//       double b = sc.nextDouble();
//       double c = sc.nextDouble();
//
//       double discriminant = b * b - 4 * a * c;
//
//       if (discriminant > 0)
//           System.out.println("Real and Distinct roots");
//       else if (discriminant == 0)
//           System.out.println("Real and Equal roots");
//       else
//           System.out.println("Complex roots");
//   }
//