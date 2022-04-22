package HocSinh;

public class HocSinhA extends HocSinh{
    public static final String Toan="Toan";
    public static final String Ly="Lý";
    public static final String Hoa ="Hóa";

    public HocSinhA() {
    }

    public HocSinhA(String ID, String studentName, String studentAddress, int prioritizeNumber) {
        super(ID, studentName, studentAddress, prioritizeNumber);
    }

    @Override
    public String toString() {
        return "HocSinhA{}" +super.toString()+Toan+","+
                Ly+","+
                Hoa
                ;
    }
}
