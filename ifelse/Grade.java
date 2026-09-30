//if else 2-Bai 2
ackage ifelse;

import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap diem: ");
        double marks = sc.nextDouble();

        if (marks > 75) {
            System.out.println("Grade A");
        } else if (marks > 60) {
            System.out.println("Grade B");
        } else if (marks > 45) {
            System.out.println("Grade C");
        } else if (marks > 35) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade E");
        }
    }
}
