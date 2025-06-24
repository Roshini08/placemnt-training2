import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        String user = "admin", pass = "1234";
        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        String inputUser = sc.nextLine();
        System.out.print("Password: ");
        String inputPass = sc.nextLine();

        if (inputUser.equals(user) && inputPass.equals(pass)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid Credentials.");
        }
        sc.close();
    }
}
