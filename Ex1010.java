/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri_alberto;

import java.util.Scanner;

/**
 * Created by ${BunnyCoder} on 08.12.2017.
 * @author Alberto
 */
public class Ex1010 {
    public static void main(String[] args) {
        Scanner hp = new Scanner(System.in);
        int codProd,numProd;
        double valorProd,total;
        
        codProd = hp.nextInt();
        numProd = hp.nextInt();
        valorProd = hp.nextDouble();
        total = numProd*valorProd;
        
        codProd = hp.nextInt();
        numProd = hp.nextInt();
        valorProd = hp.nextDouble();
        total += valorProd*numProd;
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);
    }
}
