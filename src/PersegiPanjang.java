/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */

/**
 *
 * @author Fiona Avila
 */


public class PersegiPanjang implements BangunDatar{
    
    private int luas;
    private final int panjang;
    private final int lebar;
    
    public PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public void hitungLuas(){
        luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang : " + luas);
    }
}
