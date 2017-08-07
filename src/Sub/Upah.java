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
        setJumlah(0);
        setBonus(0);
        setNilai(0);
        setOmzet(0);
        setTargetOmzet(0);
    }

    public Upah(char k, int jumlah, int omzet){
        cariJenis(k);
        setJumlah(jumlah);
        setOmzet(0);
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
        if(!getPekerjaan().equalsIgnoreCase("Operator") && omzet >= targetOmzet){
            return getBonus();
        }else{
            return 0;
        }
    }

    @Override
    public int getPajak() {
        return 0;
    }

    @Override
    public int getSubtotal() {
        return 0;
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
