import java.util.Scanner;

public class TugasPBO2_1 {
    public static void main(String args[]){
        do{
            String Nomor;
            Nomor =("1, 2, 3, 4, 5, 6, 7, 8, 9, 10");
            System.out.println("");
            String huruf;
            Scanner input = new Scanner(System.in);
            System.out.println("Masukan Input Nilai: ");
            huruf = input.nextLine();
            if(Nomor.contains(huruf)){
                System.out.println("Input benar");
                break;
            } else{
                System.out.println("input ulang");
            }

        }while(true);
    }
}

