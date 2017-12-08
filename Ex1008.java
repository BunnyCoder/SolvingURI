
package uri_alberto;

import java.util.Scanner;

/**
 * Created by ${BunnyCoder} on 08.12.2017.
 * @author Alberto
 */
public class Ex1008 {
    public static void main(String[] args) {
        Scanner hp = new Scanner(System.in);
        int numFunc, horasTrab;
        numFunc = hp.nextInt();
        horasTrab = hp.nextInt();
        double recHora = hp.nextDouble();
        double salario = horasTrab*recHora;
        System.out.println("NUMBER = " + numFunc);
        System.out.printf("SALARY = U$ %.2f%n", salario);
        
    }
}
