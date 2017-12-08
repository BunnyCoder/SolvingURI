
package uri_alberto;

import java.util.Scanner;

/**
 * Created by ${BunnyCoder} on 08.12.2017.
 * @author Alberto
 */
public class Ex1012 {
    public static void main(String[] args) {
        Scanner hp = new Scanner(System.in);
        double A=hp.nextDouble(),
               B=hp.nextDouble(),
               C=hp.nextDouble();
        
        double PI = 3.14159;
        double areaTri,areaCirc,areaTrap,areaQuad,areaRet;
        
        areaTri = A*C/2;
        areaCirc = Math.pow(C,2)*PI;
        areaTrap = (A+B)*C/2;
        areaQuad = B*B;
        areaRet = A*B;
        
        System.out.printf("TRIANGULO: %.3f\n", areaTri);
        System.out.printf("CIRCULO: %.3f\n", areaCirc);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrap);
        System.out.printf("QUADRADO: %.3f\n", areaQuad);
        System.out.printf("RETANGULO: %.3f\n", areaRet);
    }
}
