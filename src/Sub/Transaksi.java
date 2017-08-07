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

    public Transaksi(String nama, int jumlah, Pembayaran pembayaran, int omzet){
        setNama(nama);
        setJumlah(jumlah);
        setPembayaran(pembayaran);
        setOmzet(omzet);
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
