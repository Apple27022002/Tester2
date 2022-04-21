package Try;

public class KySu extends  CanBo{
    private String Major;

    public KySu(String name, int age, String sex, String address, String major) {
        super(name, age, sex, address);
        Major = major;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        Major = major;
    }

    @Override
    public String toString() {
        return "KySu{" +super.toString()+
                "Major='" + Major + '\'' +
                '}';
    }
}
