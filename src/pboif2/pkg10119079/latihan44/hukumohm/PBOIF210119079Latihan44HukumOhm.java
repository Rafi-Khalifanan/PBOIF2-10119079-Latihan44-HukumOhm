package pboif2.pkg10119079.latihan44.hukumohm;

/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class PBOIF210119079Latihan44HukumOhm {
    public static void main(String[] args) {
        Baterai baterai1 = new Baterai();
        Baterai baterai2 = new Baterai(3,12);
        System.out.println("Kuat Arus : " + baterai2.getKuatArus()+ " ampere");
        System.out.println("Hambatan : " +baterai2.getHambatan()+ " ohm ");
        System.out.println("Hasil tegangan: " + baterai2.hitungTegangan()+ "volt");
    }
    
}