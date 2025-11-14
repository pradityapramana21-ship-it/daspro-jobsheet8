import java.util.Scanner;

public class kopisenja23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah cabang: ");
        int jumlahCabang = input.nextInt();

        int totalPelanggan = 0;
        int totalItemTerjual = 0;

        System.out.println("\n=== Input Penjualan Per Cabang ===");

        for (int cabang = 1; cabang <= jumlahCabang; cabang++) {
            System.out.println("\n--- Cabang " + cabang + " ---");
            System.out.print("Jumlah pelanggan: ");
            int jumlahPelanggan = input.nextInt();
            int totalItemCabang = 0;

            for (int pelanggan = 1; pelanggan <= jumlahPelanggan; pelanggan++) {
                System.out.print("- Pelanggan " + pelanggan + " memesan berapa item? ");
                int item = input.nextInt();
                totalItemCabang += item;
            }

            System.out.println("Ringkasan Cabang " + cabang + ":");
            System.out.println("- Total pelanggan : " + jumlahPelanggan + " orang");
            System.out.println("- Item terjual    : " + totalItemCabang + " item");

            totalPelanggan += jumlahPelanggan;
            totalItemTerjual += totalItemCabang;
        }

        System.out.println("\n=== Total Seluruh Cabang ===");
        System.out.println("Total pelanggan : " + totalPelanggan + " orang");
        System.out.println("Total item terjual : " + totalItemTerjual + " item");

        input.close();
    }
}
