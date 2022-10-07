import java.util.Scanner;

public class Tugas_soal_1 {
public static class Mahasiswa {
    //atribut
    private double nilai;
    private String grade;


    public void setNilai(double nilai) {
        this.nilai = nilai;
        if (nilai >= 90){
            grade = "A";
        } else if (nilai >=80) {
            grade = "A-";
        } else if (nilai >= 75) {
            grade = "B+";
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 65) {
            grade = "B-";
        }else if (nilai >= 60) {
            grade = "C+";
        }else if (nilai >= 55) {
            grade = "C";
        }else if (nilai >= 50) {
            grade = "C-";
        }else if (nilai >= 40) {
            grade = "D";
        }else {
            grade = "E";
        }
    }



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa nilai = new Mahasiswa();

        System.out.print("Masukan Total Nilai : ");
        nilai.setNilai(input.nextDouble());

        System.out.println("Hasil :");
        System.out.println("Nilai Angka = " +nilai.nilai);
        System.out.println("Nilai Huruf = " +nilai.grade);

    }



}
}
