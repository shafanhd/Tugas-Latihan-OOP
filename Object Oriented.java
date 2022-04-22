
package latihanoop;

class Mahasiswa{
    String Nama;
    String Jurusan;
    Byte Semester;
}

public class LatihanOOP{

    
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa student1 = new Mahasiswa();
        student1.Nama = "ShafaNabilaHada";
        student1.Jurusan = "TIES";   
        student1.Semester = 2;   
                
        System.out.println("Nama : "+ student1.Nama);
        System.out.println("Jurusan : "+ student1.Jurusan);
        System.out.println("Semester : "+ student1.Semester);
              
    }
    
}
