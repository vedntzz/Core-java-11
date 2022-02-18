import java.util.ArrayList;


public class Main {

        public int totalCashInBank(ArrayList<Integer> cash) {
            System.out.print(cash);
            return 0;
        }

        public int getCash() {


            return 0;
        }



        static class SavingsAccount extends Main {
            ArrayList<Integer> sav = new ArrayList<>();
            int totalDeposits = 10000;
            int fixedDepositAmount = 5000;

            @Override
            public int getCash() {
                int cash = totalDeposits + fixedDepositAmount;
                sav.add(cash);
                return cash;
            }

        }

        static class CurrentAccount extends Main {
            ArrayList<Integer> cur = new ArrayList<>();
            int totalDeposits = 10000;
            int creditLimit = 2000;

            @Override
            public int getCash() {
                int cash = totalDeposits + creditLimit;
                cur.add(cash);


                return cash;
            }
        }

    public static void main(String[] args) {
        SavingsAccount obj=new SavingsAccount();
        CurrentAccount obj2=new CurrentAccount();
        Main obj3=new Main();
        obj.getCash();
        obj2.getCash();
        ArrayList<Integer> current=obj2.cur;
        ArrayList<Integer> saving=obj.sav;
        obj3.totalCashInBank(saving);
        obj3.totalCashInBank(current);
    }
}
