public class OperatorBitwise {
    public static void main(String[] args) {
        // penulisan tipe data dan variabel
        int a = 10;
        int b = 12;
        int hasil;

        // operator bitwise
        hasil = a & b; // hasil = 8
        System.out.println("Hasil dari a & b = " + hasil);

        hasil = a | b; // hasil = 14
        System.out.println("Hasil dari a | b = " + hasil);

        hasil = a ^ b; // hasil = 6
        System.out.println("Hasil dari a ^ b = " + hasil);

        hasil = ~a; // hasil = -11
        System.out.println("Hasil dari ~a = " + hasil);

        hasil = a << 1; // hasil = 20
        System.out.println("Hasil dari a << 1 = " + hasil);

        hasil = a >> 1; // hasil = 5
        System.out.println("Hasil dari a >> 1 = " + hasil);
    }
}
