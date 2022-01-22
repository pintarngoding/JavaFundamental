import java.util.Scanner;

public class tugas4Pola358 {
    public static int deret358(int x) {
        if (x == 1) {
            return 3;
        } else {
            return deret358(x - 1) + x;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan jumlah deret: ");
        int x = input.nextInt();

        for (int i = 1; i <= x; i++) {
            System.out.print(deret358(i) + " ");
        }
    }
}