
package uri_alberto;

import java.util.Scanner;

/**
 * Created by ${BunnyCoder} on 08.12.2017.
 * @author Aluno
 */
public class Ex1006 {
    public static void main(String[] args) {
        Scanner hp = new Scanner(System.in);
        double A,B,C,MEDIA;
        A = hp.nextDouble();
        B = hp.nextDouble();
        C = hp.nextDouble();
        MEDIA = (A*2+B*3+C*5)/10;
        System.out.printf("MEDIA = %.1f%n", MEDIA);
    }
}
