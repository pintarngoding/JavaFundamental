import java.util.Scanner;

public class konversinilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan score angka: ");
        int score = input.nextInt();
        String nilaihuruf;

        if (score >= 80 && score <= 100) {
            nilaihuruf = "A";
        } else if (score >= 71 && score <= 80) {
            nilaihuruf = "B";
        } else if (score >= 51 && score <= 70) {
            nilaihuruf = "C";
        } else if (score >= 21 && score <= 50) {
            nilaihuruf = "D";
        } else {
            nilaihuruf = "E";
        }

        System.out.println("Nilainya adalah " + nilaihuruf);
        input.close();
    }
}
