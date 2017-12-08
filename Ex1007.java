
package uri_alberto;

import java.util.Scanner;

/**
 * Created by ${BunnyCoder} on 08.12.2017.
 * @author Alberto
 */
public class Ex1007 {
    public static void main(String[] args) {
        Scanner hp = new Scanner(System.in);
        int A,B,C,D,DIFERENCA;
        A = hp.nextInt();
        B = hp.nextInt();
        C = hp.nextInt();
        D = hp.nextInt();
        DIFERENCA = (A*B - C*D);
        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}
