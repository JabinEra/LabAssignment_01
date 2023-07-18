package problem_E14;

public class BankInterest {
    private double balance;
    public BankInterest(){
        balance = 0;

    }
    public double printBalancce(double year){
        for(int i = 0; i < year; i++){
            balance = balance + (balance * 0.05);
        }
        return balance;
    }
}
