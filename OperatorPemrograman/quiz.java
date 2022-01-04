public class quiz {
    public static void main(String[] args) {
        int a = 5;
        int b, c;

        b = a < 20 ? a + 3 : a - 1; // 8
        c = b == 10 ? b * 3 : b * 2; // 16

        System.out.println(b + c); // 24
    }
}