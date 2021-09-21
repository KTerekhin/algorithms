package lesson5;

public class Main {
    public static void main(String[] args) {
        runPowApp();
        runBackpackApp();
    }

    public static void runPowApp() {
        System.out.print("pow(2,8) = ");
        System.out.println(pow(2,8));
        System.out.println();
    }

    public static void runBackpackApp() {
        Backpack backpack = new Backpack();
        backpack.add("Книга Философия Java", 0.75F, 760F);
        backpack.add("Консервированный тунец", 0.200F, 300F);
        backpack.add("Пятикилограмовая гантеля", 5.0F, 2300F);
        backpack.add("Снежный краб", 1.0F, 12000F);
        backpack.add("Макароны", 9.0F, 2000F);
        backpack.add("Видеокарта", 0.7F, 13000F);
        backpack.add("Машинка для стрижки волос", 0.4F, 900F);
        backpack.add("Перчатки", 0.150F, 600F);
        backpack.add("Пакет мусора", 2.0F, 10F);
        backpack.add("Диски от старой приставки", 2.0F, 300F);
        backpack.add("Маленький набор инструментов", 2.0F, 3200F);
        backpack.add("Монитор", 6.0F, 13900F);
        backpack.add("Мультитул", 0.250F, 5680F);
        backpack.add("Бутылка виски", 0.70F, 4250F);
        backpack.add("Мраморная говядина", 2.0F, 1900F);
        backpack.add("Пачка сторублевых купюр", 0.03F, 10000F);
        backpack.add("Сломанный принтер", 3.700F, 2500F);

        backpack.calcAndPrint(10F);
    }

    public static long pow(long num, int pow){
        return recPow(num, pow);
    }

    private static long recPow(long num, int pow){
        //Базовый случай
        if (pow == 0) return 1;
        //рекурентный случай
        return recPow(num, pow - 1) * num;
    }
}
