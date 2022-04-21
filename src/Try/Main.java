package Try;

import javax.naming.Name;

public class Main {
    public static void main(String[] args) {
        QLCB qlcb =new QLCB();
        CanBo canBo1 =new CanBo("Nam",27,"Male","So 2 ngo 15");
        CanBo canBo2 =new CanBo("Linh",22,"Female","So 4 ngo 75");
        CanBo canBo3 =new CanBo("Tam",21,"Female","So 5 ngo 31");
        CanBo canBo4 =new CanBo("Kien",19,"Female","So 2 ngo 19");
        CanBo canBo5 =new CanBo("Ngoc",20,"Female","So 87 ngo 85");
        qlcb.addMember(new KySu("Abc", 23,"Male","hn", "j"));
        qlcb.addMember(new CongNhan("Asd",34,"Male","QN",2));
        qlcb.addMember(canBo2);
        qlcb.addMember(canBo3);
        qlcb.addMember(canBo4);
        qlcb.addMember(canBo5);
        qlcb.disPlay();
        qlcb.search("Ngoc");
        qlcb.exit();





    }
}
