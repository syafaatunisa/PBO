import java.util.Scanner;

public class Soal2 {
    private double tinggibadan ;
    private double beratbadan;

    public void setTinggibadan(double tinggibadan){
        this.tinggibadan = tinggibadan;
    }

    public void setBeratbadan(double beratbadan){
        this.beratbadan = beratbadan;
    }

    double HitungBMI(){
        double BMI;
        BMI = this.beratbadan/(this.tinggibadan*this.tinggibadan);


        if(BMI >= 18.5 && BMI <= 22.9){
            System.out.println("Berat Badan Ideal");
        } else if (BMI >= 22.9) {
            System.out.println("Berat badan Overwegiht");
        }else{
            System.out.println("Berat badan Underwegiht");
        }
        return BMI;
    }

    public static void main(String[] args) {
        Soal2 data = new Soal2();
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Tinggi Badan : ");
        data.setTinggibadan(sc.nextDouble());
        System.out.print("Masukan Berat Badan :  ");
        data.setBeratbadan(sc.nextDouble());

        data.HitungBMI();

    }
}