package HocSinh;

public class HocSinhB extends HocSinh{
    public static final String Toan="Toan";
    public static final String Hoa ="Hoa";
    public static final String Sinh ="Sinh";

    public HocSinhB() {
    }

    public HocSinhB(String ID, String studentName, String studentAddress, int prioritizeNumber) {
        super(ID, studentName, studentAddress, prioritizeNumber);
    }

    @Override
    public String toString() {
        return " HocSinhB{} "+
                Toan+","+
                Hoa+","+
                Sinh;
    }
}
