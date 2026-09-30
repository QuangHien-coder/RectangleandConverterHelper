// for 1-Bai 1
package vonglap;


public class Series {
    public static void main(String[] args) {
        for (int i = 100; i >= 5; i -= 5) {
            System.out.print(i);
            if (i > 5) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
