package DemSoLan;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class SoLanXuatHien {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap chuoi can kiem tra");
        String scr =sc.nextLine().toLowerCase().trim();//toLowerCase là chuyển chữ hoa về chữ thường và trim là cắt đi các khoảng trống//
        Map<String,Integer> map =new HashMap<String,Integer>();
        String[]arr=scr.split("");
        for (int i=0 ;i<arr.length;i++){
            if (!arr[i].equals("")){
                sum +=1;
                boolean flag =false;
                for (String a: map.keySet()){
                    if (arr[i].equals(a)){
                        map.replace(arr[i],map.get(arr[i])+1);
                        flag =true;
                        break;
                    }
                }
                if (!flag){//!flag = false
                    map.put(arr[i],1);
                }
            }
        }
        for (String key : map.keySet()){
            int value =map.get(key);
            System.out.println(key+"="+value);

        }
        sum/=2;
        String s ="Cac tu xuat hien nhieu la ";
        for (String key : map.keySet()){
            if(map.get(key)>=sum){
                s+=key+"";
            }
        }
    }
}
