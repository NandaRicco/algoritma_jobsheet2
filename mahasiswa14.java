import java.util.Scanner;

public class mahasiswa14 {

    String nama;
    String nim;
    String kelas;
    double ipk;
    
    public mahasiswa14 (){

    }

    public mahasiswa14 (String nm, String nim, double ipk, String kls){
        nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        kelas = kls;
    }
    
    void tampilkanInformasi(){
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK  : " + ipk);
    }

    void ubahKelas(String kelasBaru){
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru){
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    String nilaiKinerja(){
        if (ipk >= 3.5) {
            return "Kinerja Sangat Bagus";
        } else if (ipk >= 3.0) {
            return "Kinerja Bagus";
        } else if (ipk >= 2.5) {
            return "Kinerja Cukup";
        } else {
            return "Kinerja Kurang";
        }   
    }
}
