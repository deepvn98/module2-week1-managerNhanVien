public class ManagerNV {
    private NhanVien[] nhanViens;

    public NhanVien[] getNhanViens() {
        return nhanViens;
    }

    public void setNhanViens(NhanVien[] nhanViens) {
        this.nhanViens = nhanViens;
    }

    public ManagerNV(NhanVien[] nhanViens) {
        this.nhanViens = nhanViens;
    }
    public double totalSalaryNV(){
        double count1= 0;
        double count2= 0;
        for (NhanVien o:nhanViens) {
            if ( o instanceof NVFullTime){
                NVFullTime a = (NVFullTime) o;
                count1 += a.getGrossSalary();
            }else {
                NVPartTime b = (NVPartTime) o;
                count2 += b.getToTalSalary();
            }

        }return count1+count2;

    }
    public double medianSalary(){
        int a = nhanViens.length;
        return totalSalaryNV()/a;
    }
    public double totalSalaryNVPartTime(){
        double count = 0;
        for (NhanVien o:nhanViens){
            if (o instanceof NVPartTime){
                NVPartTime b = (NVPartTime) o;
                count += b.getToTalSalary();
            }
        }return count;


    }

}
