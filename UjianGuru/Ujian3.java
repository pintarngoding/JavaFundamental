import java.util.Scanner;

public class Ujian3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int increment = 1;
        int nilai = 2;

        System.out.print("Inputkan jumlah deret: ");
        int jumlahderet = input.nextInt();

        for (int i = 1; i <= jumlahderet; i++) {
            System.out.print(nilai + "\t");
            nilai += increment;
            increment++;
        }
    }
}
