import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean continueCalculation  = true;
        Scanner scan = new Scanner(System.in);
        while (continueCalculation  == true) {


            System.out.println("izvēlies nepieciešamo darbību + - *  /");
            char usr_op = scan.next().charAt(0);
            System.out.println("ievadi skaitli x:");
            int usr_x = scan.nextInt();
            System.out.println("ievadi skaitli y:");
            int usr_y = scan.nextInt();


            if (usr_op == '+') {
                sum(usr_x, usr_y);
            } else if (usr_op == '-') {
                subtraction(usr_x, usr_y);
            } else if (usr_op == '*') {
                multiplication(usr_x, usr_y);
            } else if (usr_op == '/') {
                division(usr_x, usr_y);
            }
        }

            System.out.println("Vai vēlies turpinat? ? Atbildēt ar y(jā) vai n(nē)");
            String turpināt = scan.nextLine();
            if (turpināt.equals("n")) {
                continueCalculation = false;
            }

        }


    public static void sum(int x, int y) {
        System.out.println(x+y);
    }
    public static void subtraction(int x, int y) {
        System.out.println(x - y);
    }
    public static void multiplication(int x, int y) {
        System.out.println(x * y);
    }
    public static void division(int x, int y) {
        System.out.println(x / y);
    }

}