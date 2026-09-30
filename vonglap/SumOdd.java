// for 1-Bai 2
package vonglap;

import java.util.Scanner;

public class SumOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap num1: ");
        int num1 = sc.nextInt();
        System.out.println("Vui long nhap num2: ");
        int num2 = sc.nextInt();

        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);

        int sum = 0;
        for (int i = min + 1; i < max; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Tong cac so le nam giua " + min + " va " + max + " la: " + sum);
    }
}
