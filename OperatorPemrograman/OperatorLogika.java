import java.util.Scanner;

public class OperatorLogika {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan NIS: ");
        int nis = input.nextInt();

        boolean luluskah = (nis == 1001) || (nis == 1002) || (nis == 1003) || (nis == 1004);
        System.out.println("Luluskah: " + luluskah);

    }
}
