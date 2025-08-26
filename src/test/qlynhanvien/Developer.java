package test.qlynhanvien;

public class Developer extends Employee implements Payable{
    private String programmingLanguage;
    private int yearsOfExperience;
    public Developer(String name, double baseSalary, String programmingLanguage, int yearsOfExperience) {
        super(name, baseSalary);
        this.programmingLanguage = programmingLanguage;
        this.yearsOfExperience = yearsOfExperience;
    }
    public String getProgrammingLanguage() {return programmingLanguage;}

    public void setProgrammingLanguage(String programmingLanguage) {
        if(programmingLanguage == null || programmingLanguage.trim().isEmpty()){
            throw new IllegalArgumentException("Programming Language cannot be null or empty");
        }
        this.programmingLanguage = programmingLanguage;}

    public int getYearsOfExperience() {return yearsOfExperience;}

    public void setYearsOfExperience(int yearsOfExperience) {
        if(yearsOfExperience < 0){
            throw new IllegalArgumentException("Years of Experience cannot be negative");
        }
        this.yearsOfExperience = yearsOfExperience;}

    @Override
    public void work() {
        System.out.println(getName() + " is coding " + programmingLanguage + ".");
    }
    @Override
    public double calculateSalary(){
        return getBaseSalary() + 500 * getYearsOfExperience();
    }


}
