public class Main {
    public static void main(String[] args) {
        int currentBalance = 100;
        int refillAmount = 200;
        int newBalance;

        if (refillAmount > 1000) {
            int bonusBalance = refillAmount / 100;
            newBalance = currentBalance + refillAmount + bonusBalance;
        }else{
            newBalance = currentBalance + refillAmount;
        }
        System.out.println(newBalance);
    }
}
