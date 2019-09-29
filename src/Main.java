public class Main {

    public static void main(String[] args) {

        BankAccount bank = new BankAccount();
        bank.deposit(10000);
        bank.getAmount();
        for (int i = 0; i < 3; i++) {

            try {
                bank.withDrow(6000);
            } catch (LimitExeption le) {
                System.out.println("У вас недостаточно средств " + le.getRemainingAmount());
                System.out.println(le.getMessage());
            }

        }


    }
}
