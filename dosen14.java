public class dosen14 {
   
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public dosen14(){

    }

    public dosen14(String id, String namaDsn, boolean status, int thnBrgbung, String bidangKeahlianDsn) {
        idDosen = id;
        this.nama = namaDsn;
        this.statusAktif = status;
        this.tahunBergabung = thnBrgbung;
        this.bidangKeahlian = bidangKeahlianDsn;
    }

    void tampilkanInformasi(){
        System.out.println("ID Dosen       : " + idDosen);
        System.out.println("Nama Dosen     : " + nama);
        System.out.println("Status Aktif   : " + (statusAktif ? "Dosen Aktif Mengajar" : "Dosen Tidak Aktif Mengajar"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status){
        statusAktif = status;
    }

    int hitungMasaKerja(int thnSkrg){
        return thnSkrg - tahunBergabung;
    }

    void ubahKeahlian (String bidang){
        bidangKeahlian = bidang;
    }
}
