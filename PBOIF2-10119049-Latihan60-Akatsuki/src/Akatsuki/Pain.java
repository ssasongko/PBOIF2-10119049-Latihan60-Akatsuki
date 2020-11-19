package Akatsuki;
public class Pain extends Akatsuki{
    
    @Override
    public void tampilMisi() {
        System.out.printf("Misi Akatsuki : Mendapatkan 9 ekor Tailed Beast\n");
    }
    
    @Override
    public void simpanNamaPersonil(){
        nama[0] = "Deidara";
        asalDesa[0] = "Iwagakure";
        statusTerakhir[0] = "Bunuh Diri ketika bertarung dengan Sasuke";
        
        nama[1] = "Hidan";
        asalDesa[1] = "Yugakure";
        statusTerakhir[1] = "Terbunuh ketika duel dengan Shikamaru";
        
        nama[2] = "Itachi Uchiha";
        asalDesa[2] = "Terbunuh ketika duel dengan Sasuke";
        statusTerakhir[2] = "Konohagakure";
        
        nama[3] = "Kakuzu";
        asalDesa[3] = "Terbunuh oleh Kakashi";
        statusTerakhir[3] = "Takigakure";
        
        nama[4] = "Kisame";
        asalDesa[4] = "Kirigakure";
        statusTerakhir[4] = "Bertahan Hidup";
        
        nama[5] = "Konan";
        asalDesa[5] = "Keluar dari Akatsuki";
        statusTerakhir[5] = "Amegakure";
        
        nama[6] = "Nagato Uzumaki (Pain)";
        asalDesa[6] = "Bunuh Diri untuk Menghidupkan Kembali Konoha";
        statusTerakhir[6] = "Amegakure";
                
        nama[7] = "Orochimaru";
        asalDesa[7] = "Keluar dari Akatsuki";
        statusTerakhir[7] = "Konohagakure";
        
        nama[8] = "Tobi";
        asalDesa[8] = "Konohagakure";
        statusTerakhir[8] = "Bertahan Hidup";        
        
        nama[9] = "Zetsu Hitam dan Putih";
        asalDesa[9] = "-";
        statusTerakhir[9] = "Bertahan Hidup";        
    }
    
    @Override
    public void tampilPersonil(){
        int i = 0;
        System.out.printf("Nama Personil\n");     
        while(i < 10){
            System.out.printf("%d. Nama : %s\n   Asal Desa : %s\n   Status Terakhir : %s \n\n",(i+1),nama[i], asalDesa[i],statusTerakhir[i]);
            i++;
        }
    }
}
