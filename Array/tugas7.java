public class tugas7 {
    public static void main(String[] args) {
        String handphone[][] = {
                { "Xiaomi", "Poco M3", "1850000" },
                { "Oppo", "Reno 6", "4299000" },
                { "Vivo", "Y2", "1635000" },
                { "Oppo", "A15", "1618500" },
                { "Samsung", "Galaxy A12", "1990000" },
        };

        System.out.println("Berikut data stok handphone di HUMMACELL: ");
        for (int i = 0; i < handphone.length; i++) {
            System.out.println("\nData Handphone Ke-" + (i + 1));
            System.out.println("Merk: " + handphone[i][0]);
            System.out.println("Tipe: " + handphone[i][1]);
            System.out.println("Harga: " + handphone[i][2]);
        }
    }
}