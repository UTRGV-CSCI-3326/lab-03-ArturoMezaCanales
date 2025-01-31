public class BankAccount {
	public static void main(String[] args)
    {
        double balance = 2175.37;
        
        balance = ((((balance - 302.50 + 50.03) / 2) + 20.00 -1) * 2) + 1;
    
        System.out.printf("%.2f\n", balance);

    }

}

