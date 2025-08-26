package test.qlynhanvien;

public abstract class Employee {
    private String name;
    private double baseSalary;
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public String getName() {return name;}

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;}

    public double getBaseSalary() {return baseSalary;}

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0){
            throw new IllegalArgumentException("Base Salary cannot be negative");
        }
        this.baseSalary = baseSalary;}

    public abstract void work();
}
