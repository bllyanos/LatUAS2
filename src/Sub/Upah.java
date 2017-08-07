package Sub;

import Master.Pembayaran;

/**
 * Created by bllyanos on 8/7/2017.
 */
public class Upah extends Pembayaran {

    private int omzet;
    private int targetOmzet;

    public Upah(){
        setPekerjaan("");
        setJenis("Upah");
        setJumlah(0);
        setBonus(0);
        setNilai(0);
        setOmzet(0);
        setTargetOmzet(0);
    }

    public Upah(char k, int jumlah, int omzet){
        cariJenis(k);
        setJenis("Upah");
        setJumlah(jumlah);
        setOmzet(omzet);
        setBonus(3000000);
    }

    @Override
    public void cariJenis(char k) {
        switch (k){
            case 'o' : setPekerjaan("Operator"); setNilai(10000); setTargetOmzet(0); break;
            case 's' : setPekerjaan("Sales"); setNilai(15000); setTargetOmzet(20000000); break;
            case 'm' : setPekerjaan("Marketing"); setNilai(20000); setTargetOmzet(30000000);break;
        }
    }

    @Override
    public int getTotalBonus() {
        if(omzet >= targetOmzet){
            return getBonus();
        }else{
            return 0;
        }
    }

    @Override
    public int getPajak() {
        int totalGaji;
        totalGaji = getNilai()*getJumlah() + getTotalBonus();
        if(totalGaji > 2500000){
            return(totalGaji-2500000) / 10;
        }else{
            return 0;
        }
    }

    @Override
    public int getSubtotal() {
        return getNilai()*getJumlah() + getTotalBonus() - getPajak();
    }

    public int getTargetOmzet() {
        return targetOmzet;
    }

    public void setTargetOmzet(int targetOmzet) {
        this.targetOmzet = targetOmzet;
    }

    public int getOmzet() {
        return omzet;
    }

    public void setOmzet(int omzet) {
        this.omzet = omzet;
    }
}
