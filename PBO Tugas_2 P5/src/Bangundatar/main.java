package Bangundatar;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Bangundatar Bangundatar = new Bangundatar();
        Segitiga segitiga = new Segitiga();
        Lingkaran lingkaran = new Lingkaran();
        Scanner input = new Scanner(System.in);

        Bangundatar.luas();
        System.out.print("Alas Segitiga: ");
        segitiga.setAlas(input.nextInt());
        System.out.print("Tinggi segitiga: ");
        segitiga.setTinggi(input.nextInt());
        System.out.println("Luas Segitiga: "+ segitiga.hitungLuas());

        System.out.print("Jari-Jari Lingkaran: ");
        lingkaran.Lingkaran(input.nextInt());
        System.out.print("Luas lingkaran: "+ lingkaran.luas());
    }
}
