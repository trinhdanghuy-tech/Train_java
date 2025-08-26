package javaontap.Lab8;

import java.util.Scanner;

public class Person implements IPerson {
    Scanner sc = new Scanner(System.in);


    protected String id;
    protected String name;
    protected int age;
    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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

    @Override
    public void display() {
        System.out.println("ID: " + id + " Name: " + name + " Age: " + age);
    }

    @Override
    public void input() {
        System.out.print("Enter ID: ");
        setId(sc.nextLine());
        System.out.print("Enter Name: ");
        setName(sc.next());
        System.out.print("Enter Age: ");
        setAge(sc.nextInt());
    }
}
