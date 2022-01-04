import java.util.Scanner;

public class tugas14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tinggi piramida: ");
        int tinggi = input.nextInt();

        System.out.println("Output:");
        for (int i = 1; i <= tinggi; i++) {
            for (int j = i; j <= tinggi - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
