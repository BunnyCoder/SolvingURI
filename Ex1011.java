
package uri_alberto;

import java.util.Scanner;

/**
 * Created by ${BunnyCoder} on 08.12.2017.
 * @author Aluno
 */
public class Ex1011 {
    public static void main(String[] args) {
        Scanner hp = new Scanner(System.in);
        double PI = 3.14159;
        double raio = hp.nextDouble();
        
        double volume = (4*PI*Math.pow(raio,3))/3;
        System.out.printf("VOLUME = %.3f\n", volume);
    }
}