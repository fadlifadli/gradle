package Variables;
import java.util.Scanner;

public class aritmatich {

    public static void main(String[] args) {
        // Membuat Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan dua bilangan bulat
        System.out.print("Masukkan bilangan bulat pertama: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Masukkan bilangan bulat kedua: ");
        int secondNumber = scanner.nextInt();

        // Melakukan perbandingan dan mencetak hasilnya
        System.out.println(firstNumber + " == " + secondNumber + ": " + (firstNumber == secondNumber) + " (Apakah kedua angka sama?)");
        System.out.println(firstNumber + " != " + secondNumber + ": " + (firstNumber != secondNumber) + " (Apakah kedua angka berbeda?)");
        System.out.println(firstNumber + " > " + secondNumber + ": " + (firstNumber > secondNumber) + " (Apakah angka pertama lebih besar dari angka kedua?)");
        System.out.println(firstNumber + " >= " + secondNumber + ": " + (firstNumber >= secondNumber) + " (Apakah angka pertama lebih besar atau sama dengan angka kedua?)");
        System.out.println(firstNumber + " < " + secondNumber + ": " + (firstNumber < secondNumber) + " (Apakah angka pertama lebih kecil dari angka kedua?)");
        System.out.println(firstNumber + " <= " + secondNumber + ": " + (firstNumber <= secondNumber) + " (Apakah angka pertama lebih kecil atau sama dengan angka kedua?)");

        // Menutup Scanner
        scanner.close();
    }
}
