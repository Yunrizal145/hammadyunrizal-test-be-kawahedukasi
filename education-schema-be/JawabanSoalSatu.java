package ProgramKawahEdukasi;

//Nama : Hammad Yunrizal Aushaf
//Alamat Email : hamad.yunrizal@gmail.com
//Waktu Mulai : 
//Waktu Selesai : 

public class JawabanSoalSatu {
    
    public static void main(String[] args) {
        int[] data = {1, 2, 4, 3, 10, 11, 20, 5, 100, 200};
    
        for (int angka = 0; angka < data.length; angka++) {
            
            if (data[angka] % 5 == 0 && data[angka] % 11 == 0) {
                System.out.println("FizzBuzz");
            }else if (data[angka] % 5 == 0) {
                System.out.println("Fizz");
            }else if (data[angka] % 11 == 0) {
                System.out.println("Buzz");
            }else{
                System.out.println(data[angka]);
            }
        }
    }
}
