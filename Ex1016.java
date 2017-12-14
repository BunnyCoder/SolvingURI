package uri_alberto;

import java.util.Scanner;

/*
 * Created by ${BunnyCoder} on 14.12.2017
 * @author Alberto
 */
public class Ex1016 {
    // Distância entre dois carros (MRU)
    public static void main(String[] args) {
        // X = v(60).t
        // Y = v(90).t
        Scanner hp = new Scanner(System.in);
        int t,S;
        S = hp.nextInt();
        
        t = (int) (S / ((90 / 60.0) - (60 / 60.0)));
        
        System.out.println(t + " minutos");
    }
}
