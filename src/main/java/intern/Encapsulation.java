package intern;

public class Encapsulation {
    private long Accountnumber;
    private double Balance;

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public long getAccountnumber() {
        return Accountnumber;
    }

    public void setAccountnumber(long accountnumber) {
        Accountnumber = accountnumber;
    }
    public static void main (String[] args){
        Encapsulation obj = new Encapsulation();

        obj.setAccountnumber(545644654l);
        obj.setBalance(76543);
        System.out.println("enter the acountnumber :"+obj.getAccountnumber());
        System.out.println("enter the account balance:"+ obj.getBalance());

    }
}



