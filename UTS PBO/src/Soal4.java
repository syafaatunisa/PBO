import java.util.Scanner;

class Lingkaran{
    private int r;
    private double phi = 3.14;

    public void setR(int r){
        this.r = r;
    }

    public int getR(){
        return r;
    }

    public double getPhi(){
        return phi;
    }
}
class KelilingLingkaran extends Lingkaran{
    public double keliling(int r, double phi){
        double Kel = 2*phi*r;
        return Kel;
    }
}

class LuasLingkaran extends Lingkaran{
    public double Luas(int r, double phi){
        double luas = phi*r*r;
        return luas;
    }
}

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Lingkaran lingkaran = new Lingkaran();

        System.out.println("Masukan nilai r : ");
        lingkaran.setR(input.nextInt());

        KelilingLingkaran keliling = new KelilingLingkaran();
        System.out.println("Keliling : " +keliling.keliling(lingkaran.getR(), lingkaran.getPhi()));

        LuasLingkaran luas = new LuasLingkaran();
        System.out.println("Luas :" +luas.Luas(lingkaran.getR(), lingkaran.getPhi()));


    }
}