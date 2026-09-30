// if else 2-Bai 1
package ifelse;

import java.util.Scanner;
public class Difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap so thu nhat: ");
        int a = sc.nextInt();
        System.out.println("Vui long nhap so thu hai: ");
        int b = sc.nextInt();

        int diff = a - b;
        System.out.println("Hieu = " + diff);

        if (diff == a) {
            System.out.println("Difference is equal to value 1");
        } else if (diff == b) {
            System.out.println("Difference is equal to value 2");
        } else {
            System.out.println("Difference is not equal to any of the values entered");
        }
    }
}
