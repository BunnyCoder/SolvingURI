
package uri_alberto;

import java.util.Scanner;

/**
 * Created by ${BunnyCoder} on 14.12.2017
 * @author Alberto
 */
public class Ex1015 {
    // Distância entre dois pontos
    public static void main(String[] args) {
        Scanner hp = new Scanner(System.in);
        double x1 = hp.nextDouble(),
               y1 = hp.nextDouble(),
               x2 = hp.nextDouble(),
               y2 = hp.nextDouble();
        System.out.printf("%.4f\n", Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
    }
    
}
