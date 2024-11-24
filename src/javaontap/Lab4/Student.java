package javaontap.Lab4;

public class Student {
   private  String name;
   private  int age;
   private double point;
   public Student(){

   }
   public Student(String name, int age, double point) {
       this.name = name;
       this.age = age;
       this.point = point;
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
   public double getPoint() {
       return point;
   }
   public void setPoint(double point) {
       this.point = point;
   }
   public Student nhapThongTin(String name, int age, double point) {
       Student s = new Student(name, age, point);
       System.out.println("vui long nhap thong tin: ");
       return s;
   }
   void xuatThongTin(Student st) {
       System.out.println("Ten la: " + st.getName() + " Tuoi " + st.getAge() + " Diem " + st.getPoint());
   }
}
