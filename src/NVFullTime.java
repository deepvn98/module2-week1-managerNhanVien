public class NVFullTime extends NhanVien{
    private double bonus;
    private double fine;
    private double grossSalary;

    public NVFullTime() {
    }

    public NVFullTime(String codeNV, String name, int age, String telephone, String gmail, double bonus, double fine, double grossSalary) {
        super(codeNV, name, age, telephone, gmail);
        this.bonus = bonus;
        this.fine = fine;
        this.grossSalary = grossSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }
//    Tính lương thực nhận
    public double getTotalSalary(){
        return grossSalary + ( bonus - fine);
    }
}
