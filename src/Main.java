import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму прошлых покупок без учёта последней покупки: ");
        int previousPurchases = in.nextInt();
        System.out.println("Введите сумму последней покупки:");
        int currentPurchase = in.nextInt();
        int allPurchase = previousPurchases + currentPurchase;
        int bonusAccrual = 1000;
        int bonusWarning = 200;
        int minimumBonus = 50;
        int averageBonus = 70;
        int maximumBonus = 100;
        int difference = bonusAccrual - allPurchase % bonusAccrual;
        if (difference < bonusWarning) {
            System.out.println("Для получения большего количеста бонусов рекомендуем докупить товар на сумму: " + difference);
        }
        int startMinimumBonus = 1;
        int finishMinimumBonus = 15000;
        int startAverageBonus = 15001;
        int finishAverageBonus = 150000;
        int startMaximumBonus = 150000;
        if (allPurchase > startMinimumBonus && allPurchase <= finishMinimumBonus) {
            int bonus = allPurchase / bonusAccrual * minimumBonus;
            System.out.println("Вы получите бонусов: " + bonus);
        } else if (allPurchase >= startAverageBonus && allPurchase <= finishAverageBonus) {
            int bonus = allPurchase / bonusAccrual * averageBonus;
            System.out.println("Вы получите бонусов: " + bonus);
        } else if (allPurchase > startMaximumBonus) {
            int bonus = allPurchase / bonusAccrual * maximumBonus;
            System.out.println("Вы получите бонусов: " + bonus);
        }

    }
}