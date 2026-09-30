// for 2-Bai 1
package vonglap;

import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap ten: ");
        String name = sc.nextLine();
        System.out.println("Vui long nhap tuoi: ");
        int age = sc.nextInt();

        for (int i = 1; i <= age; i++) {
            System.out.println(i + ". " + name);
        }
    }
}
