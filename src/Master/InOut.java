package Master;

public interface InOut {
    public String inputStr(String s);
    public char inputChr(String s);
    public double inputDouble(String s);
    public int inputInt(String s);

    public void cetakJudul();
    public void cetakGaris();
    public void cetakData(int no,String pgw,String pkj,int jml,int upah,int omzet,int bonus,int pajak,int sub);
    public void inputData();
    public void outputData();
}
