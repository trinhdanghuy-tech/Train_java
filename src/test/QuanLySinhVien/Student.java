package test.QuanLySinhVien;

public class Student {
    private int id;
    private String name;
    private int age;
    private double gpa;
    private String major;

    public Student(int id, String name, int age, double gpa, String major) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.major = major;
    }

    // Getter & Setter
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getGpa() { return gpa; }
    public String getMajor() { return major; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setGpa(double gpa) { this.gpa = gpa; }
    public void setMajor(String major) { this.major = major; }

    @Override
    public String toString() {
        return id + " - " + name + " - Tuổi: " + age +
                " - GPA: " + gpa + " - Ngành: " + major;
    }
}
