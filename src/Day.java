/**
 * Реализуйте enum Day, который может принимать значение дней недели.
 * Каждый объект такого класса должен иметь метод next(), возвращающий объект того же типа со значением следующего дня
 */
public enum Day {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday;

    public Day next() {
        Day[] week = Day.values();
        if (this.ordinal() <= 5) {
            return week[this.ordinal() + 1];
        }
        return week[0];
    }
}
