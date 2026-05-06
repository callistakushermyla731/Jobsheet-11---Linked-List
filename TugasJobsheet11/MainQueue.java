package TugasJobsheet11;

import java.util.Scanner;
public class MainQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue antrian = new Queue();

        int pilih;

        do {
            System.out.println("\n=== ANTRIAN KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Lihat Depan & Belakang");
            System.out.println("5. Jumlah Antrian");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("7. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();

                    System.out.print("Nama: ");
                    String nama = sc.nextLine();

                    System.out.print("Keperluan: ");
                    String kep = sc.nextLine();

                    Mahasiswa mhs = new Mahasiswa(nim, nama, kep);
                    antrian.enqueue(mhs);
                    break;

                case 2:
                    antrian.dequeue();
                    break;

                case 3:
                    antrian.printQueue();
                    break;

                case 4:
                    antrian.peekFront();
                    antrian.peekRear();
                    break;

                case 5:
                    antrian.jumlah();
                    break;

                case 6:
                    antrian.clear();
                    break;
            }

        } while (pilih != 7);
    }
}
