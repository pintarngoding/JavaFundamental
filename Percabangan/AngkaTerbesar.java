import java.util.Scanner;

public class AngkaTerbesar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan Angka Pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Inputkan Angka Kedua: ");
        int angka2 = input.nextInt();

        if (angka1 > angka2) {
            System.out.println("Angka pertama: " + angka1 + " lebih besar dari angka kedua: " + angka2);
        } else {
            System.out.println("Angka kedua: " + angka2 + " lebih besar dari angka pertama: " + angka1);
        }
    }
}
