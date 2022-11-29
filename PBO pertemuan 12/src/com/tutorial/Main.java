// membuat package dengan nama com.tutorial
package com.tutorial;
// kemudian menggunakan library BufferReader, FileReader, StringTokenizer, IoException, dan Scanner
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // Scanner digunakan untuk menginput data atau nilai
        Scanner terminalinp = new Scanner(System.in);
        String pilihanUser;
        // membuat variabel memilih
        boolean lanjut = true;
        // lalu membuat variabel degan tipe data boolean untuk benar atau salah

        // while perulangan dengan variabel lanjut digunakan sebagai parameter
        while(lanjut) {
            clearScreen(); // digunakan untuk membersihkan tampilan sebelumnya
            // membuat sebuah pilihan database
            System.out.println("Database Perpustakaan\n");
            System.out.println("1.\tLihat seluruh buku");
            System.out.println("2.\tCari data buku");
            System.out.println("3.\tTambah data buku");
            System.out.println("4.\tUbah data buku");
            System.out.println("5.\tHapus data buku");

            // menggunakan perulangan dengan inputan yang diberikan
            System.out.print("\n\nPilihan anda: ");
            pilihanUser = terminalinp.next();

            //kemudian membuat pilihan dengan keluaran sesuai dengan yang diinput
            if (pilihanUser.equals("1")) {
                System.out.println("\n==================");
                System.out.println("LIST SELURUH BUKU");
                System.out.println("=================");
                tampilkanData();
                //Tampilkan data
            } else if (pilihanUser.equals("2")) {
                System.out.println("\n=========");
                System.out.println("CARI BUKU");
                System.out.println("=========");
                //Cari data
            } else if (pilihanUser.equals("3")) {
                System.out.println("\n================");
                System.out.println("TAMBAH DATA BUKU");
                System.out.println("================");
                //Tambah data
            } else if (pilihanUser.equals("4")) {
                System.out.println("\n==============");
                System.out.println("UBAH DATA BUKU");
                System.out.println("==============");
                //Ubah data
            } else if (pilihanUser.equals("5")) {
                System.out.println("\n===============");
                System.out.println("HAPUS DATA BUKU");
                System.out.println("===============");
                //Hapus data
            } else {
                // err digunakan agar tampilan berwarna merah
                System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih [1-5]");
            }

            // melakukan perulangan dengan fungsi yang dipanggil yaitu getUlang
            lanjut = getUlang("Apakah anda ingin melanjutkan(y/n)? ");
        }
    }


    // membuat method menampilkan data dengan IOException untuk menafsirkan input dan output yang salah
    private static void tampilkanData() throws IOException{
        FileReader fileInput;
        BufferedReader bufferInput;

        // membuat try and catch untuk data yang tidak ditemukan
        try{
            fileInput = new FileReader("database.txt");
            bufferInput = new BufferedReader(fileInput);
        }catch(Exception e){
            System.err.println("Database tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
            // jika error maka akan keluar dari tampilkan data
            return;
        }

        System.out.println("\n| No |\tTahun |\tPenulis              |\tPenerbit              |\tJudul Buku");
        System.out.println("===============================================================================");

        // membuat variabel data dengan bufferinput untuk menampilkan data
        String data = bufferInput.readLine();
        // kemudian memberi nilai 0 pada noData
        int noData = 0;
        // lalu melakukan perulangan agar tidak menulis ulang kembali kode yang sama
        while(data != null) {
            noData++;
            // stringtokenizer digunakan untuk mengambil bagian dari satu baris per koma
            StringTokenizer stringToken = new StringTokenizer(data, ",");

            // mamanggil data dari database
            stringToken.nextToken();
            System.out.printf("| %2d ", noData);
            System.out.printf("|\t%4s  ", stringToken.nextToken());
            System.out.printf("|\t%-20s ", stringToken.nextToken());
            System.out.printf("|\t%-20s  ", stringToken.nextToken());
            System.out.printf("|\t%s  ", stringToken.nextToken());
            System.out.print("\n");

            // digunakan untuk menampilkan data dari database selanjutnya
            data = bufferInput.readLine();
        }
        System.out.println("===============================================================================");

    }

    // membuat fungsi getUlang untuk mengulang tampilan ketika pilih y
    private static boolean getUlang(String ulang){
        Scanner terminalinp = new Scanner(System.in);
        String pilihanUser;
        System.out.print("\n" + ulang );
        pilihanUser = terminalinp.next();

        // ketika pilihannya bukan y dan n maka pilihan salah
        while(!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")){
            System.err.println("Silahkan pilih (y/n)");
            System.out.print("\n" + ulang );
            pilihanUser = terminalinp.next();
        }

        // return untuk memanggil fungsi main
        return pilihanUser.equalsIgnoreCase("y");

    }

    // membuat fungsi membersihkan tampilan sebelumnya dengan try and catch
    private static void clearScreen(){
        try{
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }else{
                System.out.print("\033\143");
            }
        }catch(Exception ex){
            System.err.println("tidak bisa clear screen");
        }
    }

}
