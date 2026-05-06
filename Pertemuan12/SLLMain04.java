package Pertemuan12;

public class SLLMain04 {
    public static void main(String[] args) {
        SingleLinkedList04 sll = new SingleLinkedList04();

        sll.print();
        
        Mahasiswa04 m1 = new Mahasiswa04("001", "Ayu", "TI-1A", 3.5);
        Mahasiswa04 m2 = new Mahasiswa04("002", "Budi", "TI-1B", 3.7);
        Mahasiswa04 m3 = new Mahasiswa04("003", "Citra", "TI-1C", 3.8);
        Mahasiswa04 m4 = new Mahasiswa04("004", "Doni", "TI-1D", 3.6);

        System.out.println("Tambah First:");
        sll.addFirst(m1);
        sll.print();

        System.out.println("Tambah Last:");
        sll.addLast(m2);
        sll.print();

        System.out.println("Insert After:");
        sll.insertAfter("001", m3);
        sll.print();

        System.out.println("Tambah Index:");
        sll.insertArt(1, m4);
        sll.print();
    }
}
