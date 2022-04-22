package HocSinh;

import java.util.ArrayList;

public class QLHS implements TuyenSinh<HocSinh>{
    ArrayList<HocSinh> nhomHocSinh=new ArrayList<>();
    public QLHS(){}

    @Override
    public void addStudent(HocSinh hocSinh) {
        this.nhomHocSinh.add(hocSinh);

    }

    @Override
    public void displayStudent() {
        for (int i =0;i<nhomHocSinh.size();i++){
            System.out.println(nhomHocSinh.get(i));
        }

    }

    @Override
    public int searchbyID(String ID) {
        for (int i=0;i<nhomHocSinh.size();i++){
            if (nhomHocSinh.get(i).getID().equals(ID)){
                System.out.println("Vi Tri nguoi ban tim la "+i);
            }
        }
        return -1;
    }

    @Override
    public void exit() {
        System.exit(0);

    }
//
//    @Override
//    public void addStudent(HocSinh hocSinh) {
//        this.NhomHocSinh.add(hocSinh);
//
//    }
//
//    @Override
//    public void displayStudent() {
//        for  (int i = 0; i< NhomHocSinh.size(); i++){
//            System.out.println(NhomHocSinh.get(i));
//        }
//
//
//    }
//
//    @Override
//    public int searchbyID(int ID) {
//        return 0;
//    }
//
//    @Override
//    public void exit() {
//        System.exit(0);
//
//
//    }
//
//    @Override
//    public void addStudent(HocSinh hocSinh) {
//        this.NhomHocSinh.add(new HocSinh());
//
//
//    @Override
//    public void displayStudent(HocSinh) {
//        for  (int i = 0; i< NhomHocSinh.size(); i++){
//                System.out.println(NhomHocSinh.get(i));
//        }
//
//    }
//
//    @Override
//    public void searchbyID(int iD) {
//            for (int i=0;i<NhomHocSinh.size();i++){
//                if (NhomHocSinh.get(i).getID().{
//        }
//
//    }
//
//    @Override
//    public void exit() {
//                System.exit(0);
//            }
//
//    }
//}
}
