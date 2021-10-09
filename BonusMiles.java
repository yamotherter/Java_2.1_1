public class BonusMiles {
    public static void main(String[] args) {

        // Объявляем переменную стоимости билета и одной бонусной мили
        // Присваиваем им значения

        float ticket = 5765.8F;

        int mileCost = 20;

        // Рассчитываете количество бонусных миль
        // И выводим значение в терминал
        int bonusMiles = (int) ticket / mileCost;
        System.out.print("Bonus miles: " + bonusMiles);
    }
}
