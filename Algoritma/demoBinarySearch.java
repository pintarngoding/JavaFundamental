public class demoBinarySearch {
    public static void main(String[] args) {
        int data[] = { 1, 2, 5, 7, 8, 9, 12 };
        int key = 5;
        boolean ketemu = false;

        int indexTengah = data.length / 2;
        int index = indexTengah; // karena index dimulai dari tengah, maka diset index = indexTengah

        // karena jumlah perulangan itu kondisional, maka menggunakan perulangan while

        // pengecekannya nilai index berdasarkan range 0 sampai data.length-1
        while (index >= 0 && index < data.length && ketemu == false) {
            if (key == data[index]) { // jika key sama dengan data[index]
                System.out.println("Angka " + key + " ditemukan pada index ke-" + index);
                ketemu = true;
                break;
            } else if (key < data[indexTengah]) { // dibandingkan dengan data[indexTengah] krn titik awal
                index--; // nilai index dikurangi untuk mencari nilai index sebelumnya dimulai dari
                         // indexTengah
            } else {
                index++; // jika lebih besar dari data[indexTengah] maka nilai index ditambah
            }
        }

        if (!ketemu) {
            System.out.println("Angka " + key + " tidak ditemukan di dalam data array");
        }
    }
}
