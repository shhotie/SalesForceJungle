package onlinebanking;

public class BankTransactions {
    private double balance = 5000;

    // Method to transfer money
    public void transferMoney(String accNo, double amount) throws InvalidAccNoException, InsufficientBalanceException {
        // Validate acc no
        if(accNo.length() != 10){
            throw new InvalidAccNoException("Invalid Account No !! Please Enter 10 digit acc no");
        }
        // check for suffiecient balance
        if(amount > balance){
            throw new InsufficientBalanceException("Transcation failed!! Insufficient Balance");
        }

        //Deduct Amount
        balance -= amount;
        System.out.println("Transcation Successful!!  Rs. " + amount + "Transferred to the acc : " + accNo);
        System.out.println("Remaining Balance = " + balance);
    }

    public static void main(String[] args) {
        BankTransactions bankTransactions = new BankTransactions();
        try {
            bankTransactions.transferMoney("1234567890", 4000);
        } catch (InvalidAccNoException e) {
            System.out.println("Error : " + e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println("Error : " + e.getMessage());
        }catch (Exception e){
            System.out.println("Unexpected Error Occured !! Please try again");
        }
    }
}
