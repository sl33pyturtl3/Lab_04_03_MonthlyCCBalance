public class Main {
    public static void main(String[] args)

    {
       double cardBalance = 5000.00;
       double interestRate = 0.17;
       double oneMonthBal =0;
       double twoMonthBal = 0;

       oneMonthBal = cardBalance * interestRate;
       twoMonthBal = oneMonthBal * 2;

        System.out.println("Your interest after one month is: " + oneMonthBal + " And your intrest after two months is: " + twoMonthBal);








    }
}