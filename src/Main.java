public class Main {
    public static void main(String[] args) {

        //переменные
        int score = 100; //счет
        int replenishment = 1500; //пополнение
        int stock = 100; //размер акции за который начисляются бонусы
        int bonus = 0; //сумма бонусов

        //расчет
        if (replenishment <= 1000) {
            score = score + replenishment;
            System.out.println("Сумма бонусов равна: " + bonus + " , счет составит: " + score);
        } else {
            bonus = replenishment / stock;
            score = score + replenishment + bonus;
            System.out.println("Сумма бонусов равна: " + bonus + " , счет составит: " + score);
        }
    }
}