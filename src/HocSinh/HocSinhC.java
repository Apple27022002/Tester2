package HocSinh;

public class HocSinhC extends HocSinh{
    private static final String Van="Van";
    private static final String Su ="Su";
    private static final String Dia ="Dia";

    public HocSinhC() {
    }

    public HocSinhC(String ID, String studentName, String studentAddress, int prioritizeNumber) {
        super(ID, studentName, studentAddress, prioritizeNumber);
    }

    @Override
    public String toString() {
        return "HocSinhC{}"+
                Van+","+
                Su+","+
                Dia;
    }
}
