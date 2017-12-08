
package uri_alberto;

import java.util.Scanner;

/**
 * Created by ${BunnyCoder} on 08.12.2017.
 * @author Alberto
 */
public class Ex1009 {
    public static void main(String[] args) {
        Scanner hp = new Scanner(System.in);
        Scanner epson = new Scanner(System.in);
        String nome = epson.nextLine();
        double salFix = hp.nextDouble();
        double totVend = hp.nextDouble();
        double sal = salFix + totVend*0.15;
        System.out.printf("TOTAL = R$ %.2f%n", sal);
    }
}
