import java.util.Scanner;
public class NilaiKelompok23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i = 1, nilai;
    int totalNilai, rataNilai;

    int maxRata = -1; 
    int kelompokMax = -1;  

    while (i <= 6) {
    System.out.println("Kelompok " + i);
        totalNilai = 0;
        for (int j = 1; j <= 5; j++) {
            System.out.print(" Nilai dari kelompok Penilai " + j + ": ");
            nilai = sc.nextInt();
            totalNilai = totalNilai + nilai;
        }
        rataNilai = totalNilai / 5;
        System.out.println("Rata-rata nilai = " + rataNilai + "\n");
        if (rataNilai > maxRata) {
            maxRata = rataNilai;
            kelompokMax = i;
        }
        i++;
    }
    System.out.println("Kelompok dengan rata-rata tertinggi adalah Kelompok "
                        + kelompokMax + " dengan rata-rata " + maxRata);
  }
}
