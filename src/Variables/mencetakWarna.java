package Variables;

public class mencetakWarna {
    public static void main(String[] args) {
    // Array string bernama "warna"
    String[] warna = {"hitam", "biru", "putih", "merah", "kuning"};

    // Menggunakan for-each loop untuk mencetak setiap warna kecuali "putih"
    for (String w : warna) {
        if (w.equals("putih")) {
            continue; // Melanjutkan ke iterasi berikutnya jika warnanya "putih"
        }
        System.out.println("Warnanya adalah " + w);
    }
}
}
