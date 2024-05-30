package Variables;
import java.util.Arrays;

public class anagramchecker {
    // Metode untuk memeriksa apakah dua string adalah anagram
    public static boolean isAnagram(String strA, String strB) {
        // Konversi kedua string ke huruf kecil
        strA = strA.toLowerCase();
        strB = strB.toLowerCase();

        // Jika panjang kedua string berbeda, maka bukan anagram
        if (strA.length() != strB.length()) {
            return false;
        }

        // Konversi string menjadi array karakter
        char[] charArrayA = strA.toCharArray();
        char[] charArrayB = strB.toCharArray();

        // Mengurutkan array karakter
        Arrays.sort(charArrayA);
        Arrays.sort(charArrayB);

        // Membandingkan array yang sudah diurutkan
        return Arrays.equals(charArrayA, charArrayB);
    }

    public static void main(String[] args) {
        // Contoh penggunaan metode isAnagram
        String A = "CAT";
        String B = "tac";

        boolean result = isAnagram(A, B);
        System.out.println("Apakah \"" + A + "\" dan \"" + B + "\" adalah anagram? " + result);
    }
}
