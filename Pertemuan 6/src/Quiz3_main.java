import java.util.Scanner;

public class Quiz3_main{
    static class Warnet {
        private int lamaInternet;
        private int lamaPengetikan;
        private int lamaGameOnline;

        private int banyakScan;
        private int banyakPrintWarna;
        private int banyakPrintHitamPutih;
        private int banyakTehBotol;


        public void inputData() {
            Scanner input = new Scanner(System.in);

            System.out.print("Masukan lama penggunaan internet (0 jika tidak menggunakan)\t: ");
            this.lamaInternet = input.nextInt();

            System.out.print("Masukan lama pengetikan (0 jika tidak menggunakan)\t: ");
            this.lamaPengetikan = input.nextInt();

            System.out.print("Masukan lama bermain game online (0 jika tidak menggunakan)\t: ");
            this.lamaGameOnline = input.nextInt();

            System.out.print("\n Masukan banyak file yang di scan (0 jika tidak ada)\t: ");
            this.banyakScan = input.nextInt();

            System.out.print("Masukan banyak print warna (0 jika tidak ada)\t: ");
            this.banyakPrintWarna = input.nextInt();

            System.out.print("Masukan banyak print hitam putih (0 jika tidak ada)\t: ");
            this.banyakPrintHitamPutih = input.nextInt();

            System.out.print("Masukan teh botol (0 jika tidak ada)\t: ");
            this.banyakTehBotol = input.nextInt();
        }

        public double getBiayaTotal() {
            double biayaKomputer = ((this.lamaInternet / 60) * (double) 4000) +
                    ((this.lamaPengetikan / 60) * (double) 2000) +
                    ((this.lamaGameOnline / 60) * (double) 5000);

            System.out.println(biayaKomputer);
            double biayaFasilitasLain = (this.banyakScan * 1000) +
                    (this.banyakPrintWarna * 500) +
                    (this.banyakPrintHitamPutih * 300) +
                    (this.banyakTehBotol * 3000);

            return biayaFasilitasLain + biayaKomputer;
        }
    }

    static class Main {
        public static void main(String[] args) {
            System.out.println("--- Quiz 3 Warnet ---");
            Warnet warnet = new Warnet();
            warnet.inputData();
            System.out.printf("\nTotal biaya keseluruhan: Rp %.2f", warnet.getBiayaTotal());
        }
    }
}