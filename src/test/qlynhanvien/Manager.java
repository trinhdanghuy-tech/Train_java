package test.qlynhanvien;

public class Manager extends Employee implements Payable{
    private int teamSize;
    public Manager(String name, double baseSalary, int teamSize) {
        super(name, baseSalary );
        this.teamSize = teamSize;
    }
    public int getTeamSize() {
        return teamSize;
    }
    public void setTeamSize(int teamSize) {
        if(teamSize < 0){
            throw new IllegalArgumentException("Team size cannot be negative");
        }

        this.teamSize = teamSize;
    }

    @Override
    public void work() {
        System.out.println(getName() +" is managing a team of " + getTeamSize());
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + 1000 * getTeamSize();
    }
    public class Team{
        private String teamName;
        public Team(String teamName) {
            if (teamName == null || teamName.trim().isEmpty()) {
                throw new IllegalArgumentException("Team name cannot be null or empty");
            }
            this.teamName = teamName;
        }
        public void display(){
            System.out.println("Team " + teamName + "is managed by " + getName());
        }
    }
}
