public class studikasus1 {
    public static void main(String[] args) {
        int bil1 = 20, bil2 = 25, bil3 = 15;

        int max, min;

        if (bil1 > bil2) {
            max = bil1;
            min = bil2;
        } else {
            max = bil2;
            min = bil1;
        }

        if (bil3 > max) {
            max = bil3;
        }

        if (bil3 < min) {
            min = bil3;
        }

        System.out.println("Nilai Max = " + max);
        System.out.println("Nilai Min = " + min);
    }
}
