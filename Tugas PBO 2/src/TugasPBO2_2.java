import java.util.Scanner;

public class TugasPBO2_2 {
    public static void main(String args[]){
        do{
            String Kata;
            Kata = ("Kalau dilakukan dengan sepenuh hati maka besi batangan pun kalau di gosok terus menerus akan menjadi jarum");
            System.out.println("");
            String huruf;
            Scanner input = new Scanner(System.in);
            System.out.println("Masukan kata yang sesuai: ");
            huruf = input.nextLine();
            if(Kata.contains(huruf)){
                System.out.println("Input benar");
                break;
            } else{
                System.out.println("input ulang");
            }

        }while(true);
    }
}
