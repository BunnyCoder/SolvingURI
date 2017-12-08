
package uri_alberto;

import java.util.Scanner;

/**
 * Created by ${BunnyCoder} on 08.12.2017.
 * @author Alberto
 */
public class Ex1005 {
    public static void main(String[] args) {
        Scanner hp = new Scanner(System.in);
        double A = hp.nextDouble();
        double B = hp.nextDouble();
        double MEDIA = (A*3.5+B*7.5)/11;
        System.out.printf("MEDIA = %.5f%n", MEDIA);
    }
}
