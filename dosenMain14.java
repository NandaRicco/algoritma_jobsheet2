public class dosenMain14 {
    
    public static void main(String[] args) {
        
        dosen14 dosen1 = new dosen14();
        dosen1.idDosen = "01";
        dosen1.nama = "Pak Joko";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 1998;
        dosen1.bidangKeahlian = "Mtk";
        
        dosen1.tampilkanInformasi();
        dosen1.setStatusAktif(false);
        System.out.println(dosen1.nama + " Sudah mengajar selama " + dosen1.hitungMasaKerja(2025) + " tahun");
        dosen1.ubahKeahlian("Olahraga");
        dosen1.tampilkanInformasi();

        dosen14 dosen2 = new dosen14("02", "Pak Budi", true, 2000, "Kimia");
        System.out.println(dosen2.nama + " Sudah mengajar selama " + dosen2.hitungMasaKerja(2025) + " tahun");
        dosen2.tampilkanInformasi();
    }
}
