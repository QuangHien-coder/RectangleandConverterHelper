// if else 1-Bai 1
package ifelse;

import java.util.Scanner;
public class Allowance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap hang nhan vien: ");
        char grade = sc.next().charAt(0);
        System.out.println("Vui long nhap luong nhan vien: ");
        double salary = sc.nextDouble();
        if (salary <= 0) {
            System.out.println("Salary khong the nho hon hoac bang 0");
            return;
        }
        // muc ho tro mac dinh la 100
        int allowance = 0;
        switch (grade) {
            case 'A', 'a':
                allowance = 300;
                break;
            case 'B', 'b':
                allowance = 250;
                break;
            default:
                allowance = 100;
                break;
        }
        salary += allowance;
        System.out.println("Muc luong thuc nhan cuoi thang la: " + salary);
    }
}
