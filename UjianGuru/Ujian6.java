import java.util.Scanner;

public class Ujian6 {

    public static int deret1248(int x) {
        if (x == 1) {
            return 1;
        } else {
            return 2 * deret1248(x - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Berapa banyak deret: ");
        int deret = input.nextInt();
        for (int i = 1; i <= deret; i++) {
            System.out.print(deret1248(i) + " ");
        }
        System.out.println("");
    }
}
