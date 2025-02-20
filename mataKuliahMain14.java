public class mataKuliahMain14 {

    public static void main(String[] args) {

        mataKuliah14 matkul1 = new mataKuliah14();
        matkul1.kodeMK = "Mk001";
        matkul1.nama = "Pemrograman Dasar";
        matkul1.sks = 2;
        matkul1.jumlahJam = 4;

        matkul1.tampilkanInformasi();
        System.out.println();

        mataKuliah14 matkul2 = new mataKuliah14("mk002", "Pemograman Web", 3, 6);
        matkul2.tampilkanInformasi();
        matkul2.ubahSks(2);
        matkul2.tambahJam(2);
        matkul2.tampilkanInformasi();
        matkul2.kurangiJam(9);
        matkul2.tampilkanInformasi();
    }
}
