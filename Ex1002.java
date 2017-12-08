
package uri_alberto;

import java.util.Scanner;

/**
 * Created by ${BunnyCoder} on 08.12.2017.
 * @author Alberto
 */
public class Ex1002 {
    public static void main(String[] args) {
        Scanner hp = new Scanner(System.in);
        double raio = hp.nextDouble();
        double area = Math.pow(raio,2)*3.14159;
        System.out.printf("A=%.4f%n", area);
        
    }
}
