import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму прошлых покупок без учёта последней покупки: ");
        double previousPurchases = in.nextDouble();
        System.out.println("Введите сумму последней покупки:");
        double currentPurchase = in.nextDouble();
        double allPurchase = previousPurchases + currentPurchase;
        double difference = 1000 - allPurchase % 1000;
        if (difference < 200) {
            DecimalFormat df = new DecimalFormat("#.00");
            System.out.println("Для получения большего количеста бонусов рекомендуем докупить товар на сумму: " + (df.format(difference)));
        }

        if (allPurchase > 1 && allPurchase <= 15000) {
            double bonus = Math.floor(allPurchase / 1000) * 50;
            System.out.println("Вы получите бонусов: " + bonus);
        } else if (allPurchase >= 15001 && allPurchase <= 150000) {
            double bonus = Math.floor(allPurchase / 1000) * 70;
            System.out.println("Вы получите бонусов: " + bonus);
        } else if (allPurchase > 150000) {
            double bonus = Math.floor(allPurchase / 1000) * 100;
            System.out.println("Вы получите бонусов: " + bonus);
        }

    }
}