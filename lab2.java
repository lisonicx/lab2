import java.util.Scanner;
public class lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int f = 1;
        System.out.println("введите число n:");
        while (!sc.hasNext("quit")) {
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n >= 0 & n < 15) {
                    break;
                } else {
                    System.out.println("ошибка ввода данных. введите неотрицательное число < 15.");
                    sc.next();
                }
            } else {
                System.out.println("ошибка ввода данных. введите целое число.");
                sc.next();
            }
        }
        sc.close();
        if (n == 0) {
            n = 1;
        }
        else {
            for (int i = 1; i <= n; i++) {
                f = f * i;
            }
        }
        System.out.println("факториал числа n = "+f);
    }
}
