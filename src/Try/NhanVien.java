package Try;

public class NhanVien extends CanBo{
    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public NhanVien(String name, int age, String sex, String address, String job) {
        super(name, age, sex, address);
        this.job = job;
    }

    @Override
    public String toString() {
        return "NhanVien{" +super.toString()+
                "job='" + job + '\'' +
                '}';
    }
}
