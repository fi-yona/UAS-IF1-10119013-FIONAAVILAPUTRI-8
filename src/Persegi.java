/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */

/**
 *
 * @author Fiona Avila
 */


public class Persegi implements BangunDatar{
    private int luas;
    private final int sisi;
    
    public Persegi(int sisi){
        this.sisi = sisi;
    }
    
    @Override
    public void hitungLuas() {
        luas = sisi * sisi;
        System.out.println("Luas Persegi : " + luas);
    }
    
}
