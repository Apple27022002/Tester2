package HocSinh;

public interface TuyenSinh<T> {
    public void addStudent(T t);
    public void displayStudent();
    int searchbyID(String ID);
    public void exit();
}
