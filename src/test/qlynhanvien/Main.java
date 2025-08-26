package test.qlynhanvien;

// File: Main.java
public class Main {
    public static void main(String[] args) {
        // Tạo Developer
        Developer dev = new Developer("Alice", 3000, "Java", 5);
        System.out.println("Developer: ");
        dev.work(); // Alice is coding in Java.
        System.out.println("Lương: $" + dev.calculateSalary()); // Lương: $5500.0

        // Tạo Manager
        Manager manager = new Manager("Bob", 4000, 3);
        System.out.println("\nManager: ");
        manager.work(); // Bob is managing a team of 3.
        System.out.println("Lương: $" + manager.calculateSalary()); // Lương: $7000.0

        // Tạo Team (Inner Class)
        Manager.Team team = manager.new Team("Alpha");
        team.display(); // Team Alpha is managed by Bob.
    }
}
