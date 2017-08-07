package Master;

/**
 * Created by bllyanos on 8/7/2017.
 */
public abstract class Pembayaran {
    private String pekerjaan;
    private int jumlah;
    private int nilai;
    private int bonus;

    public abstract void cariJenis(char k);
    public abstract int getTotalBonus();
    public abstract int getPajak();
    public abstract int getSubtotal();

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
}
