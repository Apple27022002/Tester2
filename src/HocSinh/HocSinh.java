package HocSinh;

public class HocSinh {
    private String ID;
    private String studentName;
    private String studentAddress;
    private int prioritizeNumber;

    public HocSinh(){}

    public HocSinh(String ID, String studentName, String studentAddress, int prioritizeNumber) {
        this.ID = ID;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.prioritizeNumber = prioritizeNumber;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public int getPrioritizeNumber() {
        return prioritizeNumber;
    }

    public void setPrioritizeNumber(int prioritizeNumber) {
        this.prioritizeNumber = prioritizeNumber;
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "ID=" + ID +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", prioritizeNumber=" + prioritizeNumber +
                '}';
    }
}
