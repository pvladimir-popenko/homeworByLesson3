public class BankAccount {
    private double amount;

    public double getAmount() {
        System.out.println("Остаток составляет " + amount);
        return amount;
    }

    public double deposit(double summ){
        return amount += summ;
    }

    public double withDrow(double summ) throws LimitExeption{
        if (summ > amount){
            throw new LimitExeption(
                    "Извините изымаемая сумма превышает остаток на вашем счете",
                    amount);
        }

        amount -= summ;
        return amount;
    }
}
