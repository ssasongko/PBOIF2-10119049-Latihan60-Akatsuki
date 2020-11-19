package Akatsuki;
public class Akatsuki {
    protected String namaPemimpin;
    protected String[] nama = new String[255];
    protected String[] asalDesa = new String[255];
    protected String[] statusTerakhir = new String[255];
    
    public void setNamaPemimpin(String namaPemimpin) {
        this.namaPemimpin = namaPemimpin;
    }
    
    public void tampilMasaKepemimpinan() {
        System.out.printf("====Akatsuki di Masa Kepemimpinan %s=====\n", namaPemimpin);
    }
    
    public void tampilMisi() {
        System.out.printf("menampilkan misi\n");
    }
      
    public  void simpanNamaPersonil(){
        System.out.printf("Simpan nama personil\n");
    }
     
    
    public void tampilPersonil(){
        System.out.printf("menampilkan nama, asal daerah dan status terakhir\n");
    }
}
