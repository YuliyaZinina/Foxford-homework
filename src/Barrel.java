/**
 * Реализовать класс Barel, каждый объект которого характеризует состояние бочки.
 * Каждый объект класса должен иметь следующие методы:
 *  - getCurrent() - получить текущее количество литров воды в бочке
 *  - clear() - опустошить бочку
 *  - fill() - наполнить бочку
 *  - pourTo(Barrel) - перелить воду из бочку в бочку-параметр
 *  - pourFrom(Barrel) - перелить воду в бочку из бочки-параметра
 */
public class Barrel {
    int totalCapacity = 100;
    int currentCapacity = 0;
    boolean isEmpty = true;

    Barrel(int capacity) {
        this.totalCapacity = capacity;
    }

    public int getCurrent() {
        return this.currentCapacity;
    }

    public void clear() {
        this.currentCapacity = 0;
    }

    public void fill() {
        this.currentCapacity = this.totalCapacity;
    }

    public void pourTo(Barrel barrel) {
        int buf = this.currentCapacity;
        this.currentCapacity = this.currentCapacity - (barrel.totalCapacity - barrel.currentCapacity) >= 0 ?
                this.currentCapacity - (barrel.totalCapacity - barrel.currentCapacity) : 0;
        barrel.currentCapacity = buf + barrel.currentCapacity <= barrel.totalCapacity ?
                (buf + barrel.currentCapacity) : barrel.totalCapacity;
    }

    public void pourFrom(Barrel barrel) {
        int buf = this.currentCapacity;
        this.currentCapacity = this.currentCapacity + barrel.currentCapacity <= this.totalCapacity ?
                this.currentCapacity + barrel.currentCapacity : this.totalCapacity;
        barrel.currentCapacity = barrel.currentCapacity + buf <= this.totalCapacity ? 0
                : barrel.currentCapacity + buf - this.totalCapacity;
    }
}
