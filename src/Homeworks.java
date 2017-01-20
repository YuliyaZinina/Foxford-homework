/**
 * Точка входа для всех заданий
 */
public class Homeworks {
    public static void main(String[] args) {
        /*
        ToBinaryNum tbn = new ToBinaryNum();
        tbn.enterNum();

        PrimeDivisorsAmount pda = new PrimeDivisorsAmount();
        pda.enterNum();

        Day[] week = Day.values();
        for (Day day : week) {
            System.out.println(day + "... ..." + day.next());
        }
        */

        Barrel b1 = new Barrel(200);
        Barrel b2 = new Barrel(300);
        b1.fill();

        b1.pourTo(b2);
        System.out.println(b1.currentCapacity + " " + b2.currentCapacity);

        b2.fill();
        b1.pourFrom(b2);
        System.out.println(b1.currentCapacity + " " + b2.currentCapacity);
    }
}
