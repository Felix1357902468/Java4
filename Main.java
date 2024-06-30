
public class Main {
    public static void main(String[] args) {
        // Объявляем переменные для начальной суммы на счету и суммы пополнения
        int initialBalance = 233; // начальная сумма на счету клиента
        int topUpAmount = 1398; // сумма пополнения

        // Объявляем переменные для бонусного порога и расчета бонуса
        int bonusThreshold = 1000; // порог для начисления бонуса
        int bonusPerHundred = 1; // бонус за каждые полные 100 рублей пополнения

        // Переменная для хранения количества бонусных рублей
        int bonus = 0;

        // Проверяем, превысила ли сумма пополнения порог
        if (topUpAmount > bonusThreshold) {
            // Рассчитываем бонус как количество полных сотен сверх порога
            bonus = ((initialBalance + topUpAmount) / 100) * bonusPerHundred;
        }

        // Рассчитываем итоговую сумму на счету клиента
        int finalBalance = initialBalance + topUpAmount + bonus;

        // Выводим информацию о бонусе и итоговой сумме
        System.out.println("Бонус: " + bonus + " руб.");
        System.out.println("Итоговая сумма на счету клиента: " + finalBalance + " руб.");
    }
}
