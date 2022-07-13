package ProgramKawahEdukasi;

//Nama : Hammad Yunrizal Aushaf

import java.util.Arrays;

//Alamat Email : hamad.yunrizal@gmail.com
//Waktu Mulai : 
//Waktu Selesai : 

public class JawabanSoalDua {
    
    public static void main(String[] args) {
        Object[] data = {1, "ka", 67, "wah", "1772", "edukasi", 7, 98, -1};
        
        
        for (int i = 0; i < data.length; i++) {
            
            if (Arrays.hashCode(data)<=0) {
                System.out.println("Nilai index ke-" + i + " adalah " + data[i].getClass().getSimpleName() + " dengan datanya yang berisi : " + data[i]);                        
            }else{
                System.out.println("Nilai index ke-" + i + "Tidak bida di Validasi oleh Sistem");    
            }                        
        }
    }
}
