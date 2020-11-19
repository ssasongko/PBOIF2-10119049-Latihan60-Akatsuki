package Akatsuki;

public class Tobi extends Akatsuki {
    @Override
    public void tampilMisi() {
        System.out.printf("Misi Akatsuki : Mendapatkan Eye of the Moon Plan\n");
    }
    
    @Override
    public void simpanNamaPersonil(){
        nama[0] = "Obito Uchiha";
        asalDesa[0] = "Konoha Gakure";
        statusTerakhir[0] = "Dibunuh oleh Kaguya Otsutsuki";
        
        nama[1] = "Kisame Hoshigaki";
        asalDesa[1] = "Kirigakure";
        statusTerakhir[1] = "Bunuh Diri";
        
        nama[2] = "Zetsu Putih";
        asalDesa[2] = "-";
        statusTerakhir[2] = "Dibunuh oleh Sasuke Uchiha";
        
        nama[3] = "Zetsu Hitam";
        asalDesa[3] = "-";
        statusTerakhir[3] = "Disegel oleh Naruto Uzumaki";
    }
    
    @Override
    public void tampilPersonil(){
        int i = 0;
        System.out.printf("Nama Personil\n");
        while(i < 4){
            System.out.printf("%d. Nama : %s\n   Asal Desa : %s\n   Status Terakhir : %s \n\n",(i+1),nama[i], asalDesa[i],statusTerakhir[i]);
            i++;
        }
    }
}
