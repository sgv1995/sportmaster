import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму прошлых покупок без учёта последней покупки: ");
        int previousPurchases = in.nextInt();
        System.out.println("Введите сумму последней покупки:");
        int currentPurchase = in.nextInt();
        int allPurchase = previousPurchases + currentPurchase;
        int difference = 1000 - allPurchase % 1000;
        if (difference < 200) {
            System.out.println("Для получения большего количеста бонусов рекомендуем докупить товар на сумму: " + difference);
        }
        int totalAmount = 1000;
        if (allPurchase > 1 && allPurchase <= 15000) {
            int bonus = allPurchase / totalAmount * 50;
            System.out.println("Вы получите бонусов: " + bonus);
        } else if (allPurchase >= 15001 && allPurchase <= 150000) {
            int bonus = allPurchase / totalAmount * 70;
            System.out.println("Вы получите бонусов: " + bonus);
        } else if (allPurchase > 150000) {
            int bonus = allPurchase / totalAmount * 100;
            System.out.println("Вы получите бонусов: " + bonus);
        }

    }
}