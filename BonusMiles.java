public class BonusMiles {
  public static void main(String[] args) {
  
    // Объявляем переменную стоимости билета и одной бонусной мили
        // Присваиваем им значения
        
        float ticket = 5765.8F;
        
        int mile_cost = 20;
    
    // Рассчитываете количество бонусных миль
        // И выводим значение в терминал
        int bonus_miles = (int)ticket / mile_cost;
        System.out.print("Bonus miles: " + bonus_miles);
  }
}
