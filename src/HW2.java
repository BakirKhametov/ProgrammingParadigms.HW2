import java.util.Scanner;

public class HW2 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите число n: ");
            int inputN = scanner.nextInt();
            System.out.println("Введите констату const: ");
            int inputC = scanner.nextInt();
            if (inputC <= 0 || inputN <= 0) {
                System.out.println("Некорректный ввод");
                return;
            }
            printList(inputC, inputN);
        }

    }

    public static void printList(int inputC, int inputN) {
        for (int i = inputC; i <= inputN; i++) {
            System.out.printf("%d x %d = %d\n", i, inputN, i * inputN);
        }
        System.out.println();
    }
}
