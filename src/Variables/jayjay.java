package Variables;

public class jayjay {

    public static void main(String[] args) {
        // Deklarasi dan inisialisasi array yang terdiri dari beberapa merek mobil
        String[] carBrands = {"Mitsubishi", "Tesla", "Honda", "Nissan", "Kia", "Hyundai"};

        // Loop melalui array dan cetak setiap merek mobil
        System.out.println("Car Brands:");
        for (String brand : carBrands) {
            System.out.println(brand);
        }
    }
}