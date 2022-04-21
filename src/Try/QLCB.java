package Try;

import java.util.ArrayList;

public class QLCB implements QuanLy <CanBo>{
    ArrayList<CanBo> NhomCanBo=new ArrayList<CanBo>();
//    public QLCB(){this.NhomCanBo =new ArrayList<CanBo>();}


    public QLCB() {
    }

    @Override
    public void addMember(CanBo canBo) {
        this.NhomCanBo.add(canBo );

    }

    @Override
    public void disPlay() {
        for (int i = 0; i< NhomCanBo.size(); i++){
            System.out.println(NhomCanBo.get(i));
        }

    }

    @Override
    public int search(String name) {
        for (int i=0;i<NhomCanBo.size();i++){
            if (NhomCanBo.get(i).getName().equals(name)){
                System.out.println(" Can bo o vi tri "+i);
            }

        }

        return -1;
    }

    @Override
    public void exit() {
        System.exit(0);

    }
}
