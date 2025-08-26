package javaontap.Lab6String;

public class ManegerStudent {
    private String name;
    private int id;
    public ManegerStudent(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    public void printInfo() {
        System.out.println("Họ và tên: " + name + " | id " + id);
    }

}
