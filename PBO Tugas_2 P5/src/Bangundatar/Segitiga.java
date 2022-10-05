package Bangundatar;

public class Segitiga {
    int alas;
    int tinggi;

    public void setAlas(int alas){
        this.alas = alas;
    }
    public void setTinggi(int tinggi){this.tinggi = tinggi; }

    public double hitungLuas(){
        double luas;
        luas = 0.5 * alas * tinggi;
        return luas;
    }
}
