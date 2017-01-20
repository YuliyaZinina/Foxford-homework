import java.util.Scanner;

/**
 * На вход подается одно число. Найти сумму его простых делителей.
 */
public class PrimeDivisorsAmount {
    public void enterNum() {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("NaN");
            return;
        }
        int num = sc.nextInt();
        this.getPrimeDivisorsAmount(num);
    }

    private int getPrimeDivisorsAmount(int num) {
        int sum = 0;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                if (this.isPrimeDivisor(i)) {
                    sum += i;
                }
            }
        }
        return sum;
    }

    private boolean isPrimeDivisor(int num) {
        int divisorsCount = 0;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                divisorsCount++;
            }
        }
        if (divisorsCount > 1) {
            return false;
        } else {
            System.out.println(num);
        }
        return true;
    }
}
