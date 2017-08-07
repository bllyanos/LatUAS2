package Sub;

import Master.InOut;

import java.util.Scanner;

public class DataTransaksi implements InOut {

    Scanner sc = new Scanner(System.in);
    private String[] nama = new String[10];
    private int[] kode = new int[10];
    private int[] jumlah = new int[10];
    private int[] omzet = new int[10];
    private Transaksi[] trans = new Transaksi[10];

    private int i,j;

    @Override
    public String inputStr(String s) {
        System.out.printf(s);
        return sc.next();
    }

    @Override
    public char inputChr(String s) {
        System.out.printf(s);
        return sc.next().charAt(0);
    }

    @Override
    public double inputDouble(String s) {
        System.out.printf(s);
        return sc.nextDouble();
    }

    @Override
    public int inputInt(String s) {
        System.out.printf(s);
        return sc.nextInt();
    }

    @Override
    public void cetakJudul() {
        System.out.printf("%3s %10s %10s %10s %10s %10s %10s %10s %10s \n","No","Nama","Pekerjaan","Jumlah","Upah/Gaji","Omzet","Bonus","Pajak","Total");
    }

    @Override
    public void cetakGaris() {
        System.out.printf("---------------------------------------------------------------------------------------------\n");
    }

    @Override
    public void cetakData(int no, String pgw, String pkj, int jml, int upah, int omzet, int bonus, int pajak, int sub) {
        System.out.printf("%3d %10s %10s %10d %10d %10d %10d %10d %10d \n",no,pgw,pkj,jml,upah,omzet,bonus,pajak,sub);
    }

    @Override
    public void inputData() {
        i = 0;
        nama[i] = inputStr("Nama : ");
        while(!nama[i].equalsIgnoreCase("x")){
            kode[i] = inputInt("Pilih Pekerjaan \n" +
                    "1. Operator \n" +
                    "2. Sales \n" +
                    "3. Marketing \n" +
                    "4. Supervisor \n" +
                    "5. Karyawan \n" +
                    "6. Manajer")-1;

            if(kode[i] > 2){
                jumlah[i] = inputInt("Jumlah Hari : ");
                omzet[i] = 0;
            }else{
                jumlah[i] = inputInt("Jumlah Jam : ");
                omzet[i] = inputInt("Omzet : ");
            }
            trans[i] = new Transaksi(nama[i],jumlah[i],omzet[i],kode[i]);
            i++;
            nama[i] = inputStr("Nama : ");
        }

    }

    @Override
    public void outputData() {
        j = i;
        cetakGaris();
        cetakJudul();
        cetakGaris();
        for(i = 0; i < j ; i++){
            cetakData(i+1, trans[i].getNama(), trans[i].getPembayaran().getPekerjaan(),trans[i].getJumlah(), trans[i].getPembayaran().getNilai(), trans[i].getOmzet(),
                    trans[i].getPembayaran().getTotalBonus(), trans[i].getPembayaran().getPajak(),trans[i].getPembayaran().getSubtotal());
        }
        cetakGaris();
        cetakGaris();
    }


}
