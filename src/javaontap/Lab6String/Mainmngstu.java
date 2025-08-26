package javaontap.Lab6String;

public class Mainmngstu {
    public static void main(String[] args) {
        ManegerStudent stu1 = new ManegerStudent("Trịnh Đăng Huy", 1);
        ManegerStudent stu2 = new ManegerStudent("Nguyễn Trọng Bảo Anh", 2);
        ManegerStudent stu3 = new ManegerStudent("Nguyễn Việt Anh", 3);
        ManegerStudent stu4 = new ManegerStudent("Đỗ Quang Hợp", 4);
        ManegerStudent stu5 = new ManegerStudent("Đỗ Hải Đăng", 5);
        ManegerStudent[] mng = {stu1, stu2, stu3, stu4, stu5};
        System.out.println("Sinh viên bắt đầu với họ \"Nguyễn\" là :");
        for (ManegerStudent stu : mng) {

            if (stu.getName().startsWith("Nguyễn")){
                stu.printInfo();
            }
        }
    }
}
