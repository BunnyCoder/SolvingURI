
package uri_alberto;

import java.util.Scanner;

/** 
 * Created by ${BunnyCoder} on 14.12.2017
 * @author Alberto
 */
public class Ex1014 {
    // Consumo de combustível km/l
    public static void main(String[] args) {
        Scanner hp = new Scanner(System.in);
        int X = hp.nextInt();
        double Y = hp.nextDouble();
        System.out.printf("%.3f km/l\n", (X/Y));
    }
    
}
