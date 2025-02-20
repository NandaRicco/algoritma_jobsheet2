public class mataKuliah14 {

    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public mataKuliah14(){
        
    }

    public mataKuliah14 (String kd, String nm, int sks, int jmlhJam) {
        kodeMK = kd;
        this.nama = nm;
        this.sks = sks;
        this.jumlahJam = jmlhJam;
    }

    void tampilkanInformasi(){
        System.out.println("Kode Mata Kuliah       : " + kodeMK);
        System.out.println("Nama Mata Kuliah       : " + nama);
        System.out.println("SKS Mata Kuliah        : " + sks);
        System.out.println("Jumlah Jam Mata Kuliah : " + jumlahJam);
    }
    
    void ubahSks (int sksBaru){
        sks = sksBaru;
        System.out.println("SKS mata kuliah telah diubah menjadi " + sksBaru);
    }

    void tambahJam (int jam){
        jumlahJam += jam;
    }

    void kurangiJam (int jam){
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Pengurangan jam berhasil. Jumlah jam baru: " + jumlahJam);
        } else {
            System.out.println("Pengurangan jam gagal. Jumlah jam tidak mencukupi.");
        }
    }
}