package Variables;
import java.util.Scanner;


public class CetakAngka {
    public CetakAngka() {
    }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan sebuah angka antara 1 dan 10: ");
            int number = scanner.nextInt();

            if (number < 1 || number > 10) {
                System.out.println("angka di luar jangkauan");
            } else {
                if (number % 2 == 0) {
                    System.out.println("genap");
                } else {
                    System.out.println("ganjil");
                }
            }

            scanner.close();
        }
}
