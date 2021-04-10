public class Main {
    public static void main(String[] args) {
        NhanVien [] nhanViens = new NhanVien[5];
        nhanViens[0] = new NVFullTime("de3","Lực",21,"0388657382","Baonam@gmail",20000,10000,10000000);
        nhanViens[1] = new NVFullTime("de31","Hiếu",27,"03886573382","Baonam@gmail",0,10000,12000000);
        nhanViens[2] = new NVFullTime("de33","abc",31,"0388657381","Baonam@gmail",20000,0,10023411);
        nhanViens[3] = new NVPartTime("fswfr","Hoa",20,"0933474342","sdfdsf@fasdf",10);
        nhanViens[4] = new NVPartTime("fswfr","Hoa",20,"0933474342","sdfdsf@fasdf",9);
        ManagerNV anh = new ManagerNV(nhanViens);
//       hiển thị nhân viên có mức lương thấp hơn mức lương trung bình
        for (NhanVien o: nhanViens) {
            if (o instanceof NVFullTime){
                NVFullTime a = (NVFullTime) o;
                if ( a.getTotalSalary() < anh.medianSalary()){
                    System.out.println(a.getName());
                }
            }
        }System.out.println("không có nhân viên nào có mức lương thấp hơn mức lương trung bình !");
//        Số tiền phải trả cho nhân viên part time
        System.out.println(anh.totalSalaryNVPartTime());


    }
}
