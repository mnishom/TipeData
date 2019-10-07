package contoh2;

import java.util.List;

/**
 *
 * @author nishom
 */
public class StronglyTypedLanguage {
    String alamat;
    Gaji gaji;
    CurriculumVitae riwayat;
    long gaji_perbulan;
    List<String> list;
    int usia;
        
    String fullname = "M. Nishom";
    String author = "M. Nishom", city = "Rembang";
    int height = '2';
    String[] shoes_number = {"39","40"};
    
    private void cetakInfo(CurriculumVitae cv, int usia, long gaji){        
        if(cv instanceof CurriculumVitae){
            //kode di sini
        }
    }    
    public void infoLengkap(){
        CurriculumVitae theCV = new CurriculumVitae();
        int u = 30;
        long g = 15000000;
        cetakInfo(theCV, u, g); 
    }    
}
