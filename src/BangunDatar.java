/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 * TANGGAL : 20 FEB 2021
 * NOMOR 8
 */

/**
 *
 * @author Fiona Avila
 */


public interface BangunDatar {
    public void hitungLuas();
    
    public static void main(String[] args) {
        Persegi p = new Persegi(6);
        p.hitungLuas();
        PersegiPanjang pp = new PersegiPanjang(5,7);
        pp.hitungLuas();
    }
}
