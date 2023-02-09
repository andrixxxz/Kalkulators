import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (true) {


            System.out.println("izvēlies nepieciešamo darbību + - *  /");
            System.out.println("Ja vēlies beigt darbu, izvēlies ~ ");
            char usr_op = scan.next().charAt(0);
            if (usr_op =='~')
                break;
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
        System.out.println("Good Job, Bye-Bye");





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
