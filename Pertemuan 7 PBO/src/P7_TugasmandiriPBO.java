import java.util.Scanner;
public class P7_TugasmandiriPBO {
    // membuat variabel dari besaran gajipokok, tunjangan pengabdian dan jam
    private int Gajipokok;
    private int Tunjangan;
    private int Jam;

    // public int get dan public void set jam ini digunakan untuk menginput lamanya bekerja dan menampilkan lamanya bekerja
    public int getJam() {
        return Jam;
    }

    public void setJam(int jam) {
        this.Jam = jam;
    }

    public static void main(String[] args) {
        // mengunakan object baru untuk memanggil class dari P7_TugasmandiriPBO
        P7_TugasmandiriPBO gaji = new P7_TugasmandiriPBO();
        //scanner digunakan untuk menginput nilai
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jam kerja: ");
        gaji.setJam(input.nextInt());
        // getjam digunakan untuk menampilkan inputan
        System.out.println("\n\nJam Kerja Karyawan = "+ gaji.getJam());

        // membuat object baru untuk setiap golongan-golongan yang telah dibuat
        int lembur = gaji.getJam();
        Golongan1 gol1 = new Golongan1();
        Golongan2 gol2 = new Golongan2();
        Golongan3 gol3 = new Golongan3();
        Golongan4 gol4 = new Golongan4();

        // if digunakan untuk membedakan mana yang lebih dari jam kerja, mana yang sama dengan jam kerja, dan mana yang beda dengan jam kerja.
        if(lembur>173){
            int Jamlembur = lembur - 173;
            System.out.println("Jamlembur = "+ Jamlembur);
            // membuat variabel untuk menghitung bayaran dari lemburnya
            int harga = Jamlembur * 20000;
            int Totaljam = Jamlembur+lembur;
            System.out.println("Total jam kerja = "+ Totaljam);
            // memanggil perhitungan dari class yang telah dibuat dengan menggunakan object saat memanggil
            System.out.println("Total gaji golongan 1 = Rp. " + (gol1.golongan1(gaji.Gajipokok, gaji.Tunjangan)+harga));
            System.out.println("Total gaji golongan 2 = Rp. " + (gol2.golongan2(gaji.Gajipokok, gaji.Tunjangan)+harga));
            System.out.println("Total gaji golongan 3 = Rp. " + (gol3.golongan3(gaji.Gajipokok, gaji.Tunjangan)+harga));
            System.out.println("Total gaji golongan 4 = Rp. " + (gol4.golongan4(gaji.Gajipokok, gaji.Tunjangan)+harga));

        // else digunakan untuk membedakan mana yang lebih dari jam kerja, mana yang sama dengan jam kerja, dan mana yang beda dengan jam kerja.
        }else if(lembur == 173){
            int jamlembur =0;
            System.out.println("Jamlembur = "+jamlembur);
            // memanggil perhitungan dari class yang telah dibuat
            System.out.println("Total jam kerja = "+ lembur);
            System.out.println("Total gaji golongan 1 = Rp. " + gol1.golongan1(gaji.Gajipokok, gaji.Tunjangan));
            System.out.println("Total gaji golongan 2 = Rp. " + gol2.golongan2(gaji.Gajipokok, gaji.Tunjangan));
            System.out.println("Total gaji golongan 3 = Rp. " + gol3.golongan3(gaji.Gajipokok, gaji.Tunjangan));
            System.out.println("Total gaji golongan 4 = Rp. " + gol4.golongan4(gaji.Gajipokok, gaji.Tunjangan));
        }else{
            // membuat mines ketika karyawan tidak bekerja sesuai dengan waktu yang telah diberikan
            int jamlembur = 173-lembur;
            System.out.println("Mines jam kerja = "+ jamlembur);
            System.out.println("Total jam Kerja = "+ lembur);
            int mines = jamlembur*10000;
            // memanggil class yang telah dibuat
            System.out.println("Total gaji golongan 1 = Rp. " + (gol1.golongan1(gaji.Gajipokok, gaji.Tunjangan)-mines));
            System.out.println("Total gaji golongan 2 = Rp. " + (gol2.golongan2(gaji.Gajipokok, gaji.Tunjangan)-mines));
            System.out.println("Total gaji golongan 3 = Rp. " + (gol3.golongan3(gaji.Gajipokok, gaji.Tunjangan)-mines));
            System.out.println("Total gaji golongan 4 = Rp. " + (gol4.golongan4(gaji.Gajipokok, gaji.Tunjangan)-mines));
        }
    }
}


class Golongan1 extends P7_TugasmandiriPBO{
    // membuat setiap method untuk dipanggil dalam fungsi main
    public double golongan1(int Gajipokok, int Tunjangan) {
        Gajipokok = 1486500;
        Tunjangan = 250000;

        // menghitung gaji dengan menggunakan double karena agar mendapatkan koma dalam perkaliannya
        int Gajikotor = Gajipokok+Tunjangan;
        double Totalgaji = (double)(Gajikotor) * (double) 0.005;
        double Gaji = Gajikotor - Totalgaji;
        return Gaji;
    }
}
class Golongan2 extends P7_TugasmandiriPBO{
    public double golongan2(int Gajipokok, int Tunjangan){
        Gajipokok = 1926000;
        Tunjangan = 300000;

        int Gajikotor = Gajipokok+Tunjangan;
        double Totalgaji = (double)(Gajikotor) * (double) 0.005;
        double Gaji = Gajikotor - Totalgaji;

        return Gaji;
    }

}
class Golongan3 extends P7_TugasmandiriPBO{
    public double golongan3(int Gajipokok, int Tunjangan){
        Gajipokok = 2456700;
        Tunjangan = 350000;

        int Gajikotor = Gajipokok+Tunjangan;
        double Totalgaji = (double)(Gajikotor) * (double) 0.005;
        double Gaji = Gajikotor - Totalgaji;

        return Gaji;
    }

}
class Golongan4 extends P7_TugasmandiriPBO{
    public double golongan4(int Gajipokok, int Tunjangan){
        Gajipokok = 2899500;
        Tunjangan = 400000;

        int Gajikotor = Gajipokok+Tunjangan;
        double Totalgaji = (double)(Gajikotor) * (double) 0.005;
        double Gaji = Gajikotor - Totalgaji;

        return Gaji;

    }

}

