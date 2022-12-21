public class Main {
    public static void main(String[] args) {
        int balance = 200; //  сумма на счету в рублях
        int addBalance = 1500; // сумма пополнения в рублях
        int bonus = 100; // стоимость одного бонуса в рублях

        int addBonus;
        if (addBalance >= 1000) {
            addBonus = addBalance / bonus;
        } else {
            addBonus = 0;
        }

        int total;
        if (addBalance >= 1000) {
            total = balance + addBalance + addBonus;
        } else {
            total = balance + addBalance;
        }

        System.out.println("Итоговый счет: " + total + " рублей");
        System.out.println("Сумма бонусов: " + addBonus + " рублей");
    }
}
