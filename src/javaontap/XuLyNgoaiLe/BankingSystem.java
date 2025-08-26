package javaontap.XuLyNgoaiLe;

public class BankingSystem {
    public void withdraw(double balance, double amount) throws InsufficientBalanceException{
        if( amount > balance ){
            throw new InsufficientBalanceException("So du khong du " + balance);
        }
        System.out.println("Rut tien thanh con");
    }
    public static void main(String[] args) {
        BankingSystem bs = new BankingSystem();
        try{
            bs.withdraw(1000,2000);
        }catch (InsufficientBalanceException e){
            System.out.println("Loi: " + e.getMessage());
        }
    }
}
