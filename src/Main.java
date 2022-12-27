import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void Calcul(Stack<Integer> st, String choice) {
        int b = st.pop();
        int a = st.peek();

        double result = 0;

        switch (choice) {
            case "+" -> result = a + b;
            case "-" -> result = a - b;
            case "*" -> result = a * b;
            case "/" -> result = (double) a / b;
            default -> System.out.println("Такого действия нет, выберите из списка!");
        }
        System.out.println(a + " " + choice + " " + b + " = " + result);
    }

    public static String UserChoiseOperation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите +, -, * или /");
        System.out.print(": ");
        String choice = sc.next();
        return choice;
    }


    public static void main(String[] args) {

        while (true) {
        Scanner scan = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.printf("Введите первое число: ");
        st.push(scan.nextInt());
        System.out.printf("Введите второе число: ");
        st.push(scan.nextInt());
        String choice = UserChoiseOperation();
        Calcul(st, choice);


            System.out.println("Хотите отменить операцию?\nВведите 'y' для отмены\nВведите 'n' для продолжение\nВведите 'q' для выхода");
            System.out.print(": ");
            choice = scan.next();
            if (choice.equals("y")) {
                System.out.println("Первое число: " + st.peek());
                System.out.printf("Введите второе число: ");
                st.push(scan.nextInt());
                choice = UserChoiseOperation();
                Calcul(st, choice);
            }
            if (choice.equals("n")) {
                continue;
            }
            if (choice.equals("q")) {
                break;
            }
        }
    }
}
