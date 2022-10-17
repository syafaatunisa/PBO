import java.util.Scanner;

public class Soal1 {
    //Membuat variabel dengan tipe data integer
    private int jamawal, menitawal, detikawal;
    private int jamakhir, menitakhir, detikakhir;
    private int lamapercakapan;

    public void inputSmartphone() {
        //menggunakan library scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jam Awal : ");
        jamawal = input.nextInt();
        System.out.print("Masukan Menit Awal : ");
        menitawal = input.nextInt();
        System.out.print("Masukan Detik Awal : ");
        detikawal = input.nextInt();
        System.out.print("Masukan Jam Akhir : ");
        jamakhir = input.nextInt();
        System.out.print("Masukan Menit Akhir : ");
        menitakhir = input.nextInt();
        System.out.print("Masukan Detik Akhir : ");
        detikakhir = input.nextInt();
    }

    //Membuat Fungsi percakapan dengan tipe data void
    public void Percakapan() {
        //Melakukan perhitungan lamapercakapan
        lamapercakapan = (jamakhir - jamawal) * 3600 + (menitakhir - menitawal) * 60 + (detikakhir - detikawal);
        int jumlah_jam = lamapercakapan / 3600;
        int jumlah_menit = (lamapercakapan % 3600) / 60;
        int jumlah_detik = lamapercakapan % 3600 % 60;
        //Menampilkan output lama percakapan
        System.out.println("Lama Percakapan: " + jumlah_jam + " Jam " + jumlah_menit + " Menit " + jumlah_detik + " Detik");

    }

    // membuat methood biayapercakapan
    public void BiayaPercakapan() {
        //melakukan perhitungan biaya_percakapan
        double biaya_percakapan = (lamapercakapan / 5) * 150;
        //menampilkan output hasil perhitungan biaya percakapan
        System.out.println("Biaya Percakapan : " + biaya_percakapan);
    }

    public static void main(String[] args) {
        //membuat objek dengan nama objek
        Soal1 smartphone = new Soal1();
        //memanggil objek dan fungsi inputSmartphone
        smartphone.inputSmartphone();
        //memanggil objek dan fungsi percakapan
        smartphone.Percakapan();
        //memanggil objek dan fungsi biayapercakapan
        smartphone.BiayaPercakapan();
    }
}