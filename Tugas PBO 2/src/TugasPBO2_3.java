import java.util.Scanner;
import java.util.Random;
public class TugasPBO2_3 {
    public static void main(String [] args){

        String[] jari = {"J","T","K"};
        Scanner main = new Scanner(System.in);
        String user;
        String komputermain;
        String pilihan;
        boolean lanjut;

        do{
            komputermain = jari[new Random().nextInt(jari.length)];
            while(true){
                System.out.print("Masukkan jari[J/T/K]: ");
                user = main.nextLine();

                if(user.equals("J") || user.equals("T") || user.equals("K")){
                    break;
                }else{
                    System.out.println("Kata yang anda masukkan salah");
                }
            }

            System.out.println("input Komputer: " + komputermain);
            if(komputermain.equals("J")){
                if(user.equals("T")){
                    System.out.println("Anda Kalah");
                }else if(user.equals("K")){
                    System.out.println("Anda Menang");

                }
            }else if(komputermain.equals("T")){
                if(user.equals("K")){
                    System.out.println("Anda Kalah");
                }else if(user.equals("J")){
                    System.out.println("Anda Menang");
                }
            }else if(komputermain.equals("K")){
                if(user.equals("J")){
                    System.out.println("Anda Kalah");
                }else if(user.equals("T")){
                    System.out.println("Anda Menang");
                }
            }
            else if(user.equals(komputermain)){
                System.out.println("Seri");
            }


            while (true) {
                System.out.print("Apakah inginJ lanjut[Y/T]?");
                pilihan = main.nextLine().toUpperCase();
                if(pilihan.equals("Y")){
                    lanjut = true;
                    break;
                }else if(pilihan.equals("T")){
                    lanjut = false;
                    break;
                }else{
                    System.out.println("Masukan tidak valid");
                }
            }


        } while(lanjut);

    }
}
