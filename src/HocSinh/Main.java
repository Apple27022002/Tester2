package HocSinh;

public class Main {
    public static void main(String[] args) {
        QLHS qlhs=new QLHS();
        qlhs.addStudent(new HocSinhA("5266","Nam","Hn",8));
        qlhs.addStudent(new HocSinhB("9j9j9","Ngu","ssss",6));
        qlhs.displayStudent();
        qlhs.searchbyID("9j9j9");
        qlhs.exit();

    }
}
