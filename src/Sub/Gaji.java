package Sub;

import Master.Pembayaran;

/**
 * Created by bllyanos on 8/7/2017.
 */
public class Gaji extends Pembayaran {

    public Gaji(){
        setPekerjaan("");
        setJumlah(0);
        setBonus(0);
        setNilai(0);
    }

    public Gaji(char k, int jumlah){
        cariJenis(k);
        setJumlah(jumlah);
    }

    @Override
    public void cariJenis(char k) {
        switch (k){
            case 's' : setPekerjaan("Supervisor"); setNilai(4000000); setBonus(30000); break;
            case 'k' : setPekerjaan("Karyawan"); setNilai(2000000); setBonus(10000); break;
            case 'm' : setPekerjaan("Manajer"); setNilai(5000000); setBonus(50000); break;
        }
    }

    @Override
    public int getTotalBonus() {
        return getBonus() * getJumlah();
    }

    @Override
    public int getPajak() {
        int totalGaji;
        totalGaji = getNilai() + getTotalBonus();
        if(totalGaji > 2500000){
            return (totalGaji-2500000) / 10;
        }else{
            return 0;
        }
    }

    @Override
    public int getSubtotal() {
        return getNilai() + getTotalBonus() - getPajak();
    }
}
