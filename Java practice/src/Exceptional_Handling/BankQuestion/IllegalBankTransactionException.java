package Exceptional_Handling.BankQuestion;

public class IllegalBankTransactionException extends Exception {
    public IllegalBankTransactionException(String message){
        super(message);
    }
}
