import java.util.Scanner;

public class tugas3Fibonacci {
    public static int fibonacci(int x) {
        if (x == 1 || x == 2) {
            return 1;
        } else {
            return fibonacci(x - 1) + fibonacci(x - 2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan jumlah deret: ");
        int x = input.nextInt();

        for (int i = 1; i <= x; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
