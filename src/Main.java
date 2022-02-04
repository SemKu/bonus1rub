public class Main {
    public static void main(String[] args) {
        int initialBalance = 100;
        int replenishmentAmount = 1100;
        int percent = replenishmentAmount / 100;
        int bonus;
        if (replenishmentAmount > 1000) {
            bonus = percent;
        } else {
            bonus = 0;
        }
        int balans = initialBalance + replenishmentAmount + bonus;
        System.out.println(balans);
    }
}