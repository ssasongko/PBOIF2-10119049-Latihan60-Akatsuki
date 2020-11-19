package pboif2.pkg10119049.latihan60.akatsuki;
/**
 * @author
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : Fandom Akatsuki
 * 
**/
import Akatsuki.Akatsuki;
import Akatsuki.Yahiko;
import Akatsuki.Pain;
import Akatsuki.Tobi;

public class PBOIF210119049Latihan60Akatsuki {
    public static void main(String[] args) {
        
        // Menggunakan Polymorph Subtyping
        Akatsuki yahiko,pain,tobi;
        yahiko = new Yahiko();
        pain = new Pain();
        tobi = new Tobi();
        
        // Zaman Yahiko
        yahiko.setNamaPemimpin("Yahiko");
        yahiko.tampilMasaKepemimpinan();
        yahiko.tampilMisi();
        yahiko.simpanNamaPersonil();
        yahiko.tampilPersonil();
        
        // Zaman Pain
        pain.setNamaPemimpin("Pain / Nagato");
        pain.tampilMasaKepemimpinan();
        pain.tampilMisi();
        pain.simpanNamaPersonil();
        pain.tampilPersonil();
        
        // Zaman Obito
        tobi.setNamaPemimpin("Tobi / Obito");
        tobi.tampilMasaKepemimpinan();
        tobi.tampilMisi();
        tobi.simpanNamaPersonil();
        tobi.tampilPersonil();        
        
    }
    
}
