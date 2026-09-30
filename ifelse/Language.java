// if else 1-Bai 2
package ifelse;

import java.util.Scanner;

public class Language {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap mot chu cai: ");
        char c = sc.next().charAt(0);

        switch (c) {
            case 'A':
            case 'a':
                System.out.println("Ada");
                break;
            case 'B':
            case 'b':
                System.out.println("Basic");
                break;
            case 'C':
            case 'c':
                System.out.println("Cobol");
                break;
            case 'D':
            case 'd':
                System.out.println("dBase III");
                break;
            case 'F':
            case 'f':
                System.out.println("Fortran");
                break;
            case 'P':
            case 'p':
                System.out.println("Pascal");
                break;
            case 'V':
            case 'v':
                System.out.println("Visual C++");
                break;
            default:
                System.out.println("Khong co ngon ngu tuong ung voi chu cai nay");
        }
    }
}
