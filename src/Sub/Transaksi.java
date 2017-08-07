package Sub;

import Master.Pembayaran;

/**
 * Created by bllyanos on 8/7/2017.
 */
public class Transaksi {
    private String nama;
    private int jumlah;
    private Pembayaran pembayaran;
    private int omzet = 0;

    public Transaksi(String nama, int jumlah, int omzet, int k){
        setNama(nama);
        setJumlah(jumlah);
        setOmzet(omzet);
        switch (k){
            case 0 : pembayaran = new Upah('o',jumlah,omzet); break;
            case 1 : pembayaran = new Upah('s',jumlah,omzet); break;
            case 2 : pembayaran = new Upah('m',jumlah,omzet); break;
            case 3 : pembayaran = new Gaji('s',jumlah); break;
            case 4 : pembayaran = new Gaji('k',jumlah); break;
            case 5 : pembayaran = new Gaji('m',jumlah); break;
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public Pembayaran getPembayaran() {
        return pembayaran;
    }

    public void setPembayaran(Pembayaran pembayaran) {
        this.pembayaran = pembayaran;
    }

    public int getOmzet() {
        return omzet;
    }

    public void setOmzet(int omzet) {
        this.omzet = omzet;
    }
}
