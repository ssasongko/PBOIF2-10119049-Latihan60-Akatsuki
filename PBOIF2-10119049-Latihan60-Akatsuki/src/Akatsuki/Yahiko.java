package Akatsuki;
public class Yahiko extends Akatsuki{
   
    @Override
    public void tampilMisi() {
        System.out.printf("Misi Akatsuki : Menciptakan Kedamaian di Desa Amegakure\n");
    }
    
    @Override
    public void simpanNamaPersonil(){
        nama[0] = "Konan";
        asalDesa[0] = "Amegakure";
        statusTerakhir[0] = "Bertahan Hidup";
        
        nama[1] = "Nagato";
        asalDesa[1] = "Amegakure";
        statusTerakhir[1] = "Bertahan Hidup";
        
        nama[2] = "Yahiko";
        asalDesa[2] = "Amegakure";
        statusTerakhir[2] = "Menusukan diri kunai yang dipegang Nagatoi";        
    }
    
    @Override
    public void tampilPersonil(){
        int i = 0;
        System.out.printf("Nama Personil\n");
        while(i < 3){
            System.out.printf("%d. Nama : %s\n   Asal Desa : %s\n   Status Terakhir : %s \n\n",(i+1),nama[i], asalDesa[i],statusTerakhir[i]);
            i++;
        }
    }
}
