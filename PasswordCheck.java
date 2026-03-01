import java.util.Scanner; 
 
public class PasswordCheck { 
   public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in); 
 
       System.out.print("Enter password: "); 
       String pass = sc.nextLine(); 
 
       if(pass.equals("admin123")) 
              System.out.println("Access Granted"); 
         else 
              System.out.println("Access Denied");
        }
    }

  //port java.util.Scanner;

// class PasswordCheck {
// static void main(String[] args) { 
  // Scanner sc = new Scanner(System.in); 
 
  // System.out.print("Enter password: "); 
  // String pass = sc.nextLine(); 
 
  // if(pass.equals("admin123"))
  //          System.out.println("Access Granted"); 
  //       else 
  //          System.out.println("Access Denied");
  //      }
  //  }

  //  import java.util.Scanner;

// class PasswordCheck {
  //blic static void main(String[] args) { 
  // Scanner sc = new Scanner(System.in); 
 
  // System.out.print("Enter password: "); 
  // String pass = sc.nextLine(); 
 
  // if(pass.equals("admin123"))
  //          System.out.println("Access Granted"); 
  //       else 
  //          System.out.println("Access Denied");
  //      }
  //  }