import java.sql.SQLOutput;
import java.util.Scanner;

public class NhanVien {
    private String codeNV;
    private String name;
    private int age;
    private String telephone;
    private String gmail;

    public NhanVien() {
    }

    public NhanVien(String codeNV, String name, int age, String telephone, String gmail) {
        this.codeNV = codeNV;
        this.name = name;
        this.age = age;
        this.telephone = telephone;
        this.gmail = gmail;
    }

    public String getCodeNV() {
        return codeNV;
    }

    public void setCodeNV(String codeNV) {
        this.codeNV = codeNV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public NhanVien[] addNV(NhanVien[] nhanViens, NhanVien nhanVien){
        NhanVien [] arr = new NhanVien[nhanViens.length+1];
        for (int i = 0; i < nhanViens.length; i++ ) {
            arr[i] = nhanViens[i];

        }
        arr[arr.length - 1] = nhanVien;
        return arr;



    }
}
