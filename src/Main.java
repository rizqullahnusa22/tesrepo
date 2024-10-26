import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<Siswa> daftarSiswa = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah siswa yang ingin didaftarkan:");
        int jumlahSiswa = input.nextInt();
        input.nextLine();

        inputdatasiswa(jumlahSiswa, input, daftarSiswa);

        System.out.println("Daftar Siswa:");
        for (Siswa siswa : daftarSiswa) {
            siswa.tampilkanInfo();
            System.out.println();
        }
        input.close();
    }

    /**
     *
     * @param jumlahSiswa
     * @param input
     * @param daftarSiswa
     */
    private static void inputdatasiswa(int jumlahSiswa, Scanner input, ArrayList<Siswa> daftarSiswa) {
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Masukkan nama siswa:");
            String nama = input.nextLine();

            int umur = getUmur(input);

            System.out.println("Masukkan kelas siswa:");
            String kelas = input.nextLine();

            Siswa siswa = new Siswa(nama, umur, kelas);
            daftarSiswa.add(siswa);
        }
    }

    /**
     *
     * @param input
     * @return
     */


    private static int getUmur(Scanner input) {
        int umur = -1;
        while (umur < 0) { // Loop hingga umur valid
            System.out.println("Masukkan umur siswa (angka positif):");
            if (input.hasNextInt()) {
                umur = input.nextInt();
                if (umur < 0) {
                    System.out.println("Umur tidak boleh negatif. Silakan coba lagi.");
                }
            } else {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                input.next();
            }
        }

        input.nextLine();
        return umur;
    }
}

