import java.util.Scanner;

/**
 * Посчитайте количество единиц в двоичной записи числа, поданного на вход
 */
public class ToBinaryNum {
    public void enterNum() {
        Scanner s = new Scanner(System.in);
        if (!s.hasNextInt()) {
            System.out.println("NaN");
            return;
        }
        int num = s.nextInt();
        this.getCountOfOnes(num);
    }

    protected int getCountOfOnes(int num) {
        int count = 0;

        // стандартный перевод числа в двоичную СС
        String binaryNum = Integer.toBinaryString(num);

        // вызов самописной функции
        //this.toBinary(num);

        for (int i = 0; i < binaryNum.length(); i++) {
            if (binaryNum.charAt(i) == '1') {
                count++;
            }
        }

        System.out.println("count: " + count + " binary: " + binaryNum);
        return count;
    }

    protected String toBinary(int number) {
        String binaryNumber = "";
        do {
            binaryNumber += number % 2;
            number /= 2;
        } while (number > 0);

        return new StringBuffer(binaryNumber).reverse().toString();
    }
}
