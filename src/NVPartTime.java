public class NVPartTime extends NhanVien{
    private double doTime;

    public NVPartTime() {
    }

    public NVPartTime(String codeNV, String name, int age, String telephone, String gmail, double doTime) {
        super(codeNV, name, age, telephone, gmail);
        this.doTime = doTime;
    }

    public double getDoTime() {
        return doTime;
    }

    public void setDoTime(double doTime) {
        this.doTime = doTime;
    }
    public double getToTalSalary(){
        return doTime *100000;
    }
}
