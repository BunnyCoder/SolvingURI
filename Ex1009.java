
package uri_alberto;

import java.util.Scanner;

/**
 * Created by ${BunnyCoder} on 08.12.2017.
 * @author Alberto
 */
public class Ex1009 {
    public static void main(String[] args) {
        Scanner hp = new Scanner(System.in);
        
        String nome = epson.nextLine();
        double salFix = hp.nextDouble();
        double totVend = hp.nextDouble();
        
        double totSal = salFix + totVend*0.15;
        //No URI, se não tiver esse \n no final do código tem chance de dar errado
        System.out.printf("TOTAL = R$ %.2f\n", totSal);
    }
}
