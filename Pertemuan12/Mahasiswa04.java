package Pertemuan12;

public class Mahasiswa04 {
    String nim, nama, kelas;
    double ipk;
    
    public Mahasiswa04() {
    }

    public Mahasiswa04(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.printf("\n%-10s %-12s %-5s %-3.1f\n", 
            nama, nim, kelas, ipk);
    }
}
