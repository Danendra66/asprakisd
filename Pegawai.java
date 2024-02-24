public class Pegawai {
    String nip;
    String nama;
    String divisi;

    Pegawai(String nip, String nama, String divisi) {
        this.nip = nip;
        this.nama = nama;
        this.divisi = divisi;
    }

    @Override
    public String toString() {
        return "Pegawai [nip=" + nip + ", nama=" + nama + ", divisi=" + divisi + "]";
    }
}
