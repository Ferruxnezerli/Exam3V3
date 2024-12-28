import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your age(18-51)");
        int age = scanner.nextInt();
        System.out.println("Please Enter your E-mail)");
        String eMail = scanner.nextLine();

        try {
            if (age < 18 || age > 51) {
                throw new WrongAge("Your exception is wrong");
            }

            for (int i = 0; i < eMail.length(); i++) {
                if (eMail.charAt(i) == '.') {
                    throw new WrongEmailException("Your Email is wrong");
                }
            }
        }
        catch (WrongAge e) {
            System.out.println(e.getMessage());
        }
        catch (WrongEmailException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}