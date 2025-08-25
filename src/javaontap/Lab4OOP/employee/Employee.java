package javaontap.Lab4OOP.employee;

public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private int timework;
    public Employee() {

    }
    public Employee(String firstName, String lastName, int age, double salary, int timework) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.timework = timework;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getTimework() {
        return timework;
    }
    public void setTimework(int timework) {
        this.timework = timework;
    }
    public Double luong(double salary, int timework) {
        if (timework <= 2){
            return salary * 1.5;
        } else if (timework > 2 || timework <= 5) {
            return salary * 2;
        }
        else{
            return salary * 2.5;
        }
    }
    public Employee nhapThongTin(String firstName, String lastName, int age, double salary, int timework) {
        Employee emp = new Employee(firstName, lastName, age, salary, timework);
        return emp;
    }
    public void xuatThongTin(Employee emp) {
        System.out.println("Tên: " + emp.getFirstName() + " " + emp.getLastName());
        System.out.println("Tuổi: " + emp.getAge());
        System.out.println("Lương cơ bản: " + emp.getSalary());
        System.out.println("Kinh nghiệm: " + emp.getTimework());
        System.out.println("Mức lương của bạn: " + luong(emp.getSalary(), emp.getTimework()));
    }
}
