package bol2;

import java.util.Scanner;

public class Bol2 {

    public static void main(String[] args) {
        /* System.out.println("");
        //1-CALCULAR DESCONTO
            Scanner precio=new Scanner(System.in);
                System.out.println("Introduce o precio orixinal:");
                float orix=precio.nextFloat();
                System.out.println("Introduce o precio co desconto:");
                float desc=precio.nextFloat();
                precio.close();
            int porcent=(int)(((orix-desc)/orix)*100);
            System.out.println("A porcentaxe descontada é: "+porcent+"%"); */

        /* System.out.println("");
        //2-GRAOS CENTÍGRADOS A FAHRENHEIT E KELVIN
            Scanner graos=new Scanner(System.in);
                System.out.println("Introduce unha temperatura en graos centígrados:");
                float cent=graos.nextFloat();
                graos.close();
            float fahr=((cent*1.8f)+32f);
                System.out.println("A temperatura en graos Fahrenheit é: "+fahr+"℉");
            float kelv=(cent+273.15f);
                System.out.println("A temperatura en graos Kelvin é: "+kelv+"K"); */

        /* System.out.println("");
        //3-SUMAR BILLETES E MOEDAS
            Scanner euros=new Scanner(System.in);
                System.out.println("Cantos billetes de 100€?");
                int b100=euros.nextInt();
                System.out.println("Cantos billetes de 20€?");
                int b20=euros.nextInt();
                System.out.println("Cantos billetes de 5€?");
                int b5=euros.nextInt();
                System.out.println("Cantas moedas de 1€?");
                int m1=euros.nextInt();
                euros.close();
            System.out.println("A cantidade total é: "+((b100*100)+(b20*20)+(b5*5)+m1)+"€"); */

        /* System.out.println("");
        //4-SEPARAR EN BILLETES E MOEDAS
            Scanner euros2=new Scanner(System.in);
                System.out.println("Introduce unha cantidade en euros:");
                int total=euros2.nextInt();
                euros2.close();
            int b100=(total/100); int aux=(total-(b100*100));
                System.out.println(b100+" billetes de 100€");
            int b20=(aux/20); aux=(aux-(b20*20));
                System.out.println(b20+" billetes de 20€");
            int b5=(aux/5); aux=(aux-(b5*5));
                System.out.println(b5+" billetes de 5€");
            int m1=aux;
                System.out.println(m1+" moedas de 1€"); */

        System.out.println("");
        //5-CALCULAR SOLDO BRUTO E LÍQUIDO
            Scanner soldo=new Scanner(System.in);
                System.out.println("Introduce o soldo fixo:");
                    float sfixo=soldo.nextFloat();
                System.out.println("Introduce o importe total de vendas realizadas:");
                    float comision=soldo.nextFloat();
                System.out.println("Introduce o número total de quilómetros recorridos:");
                    float km=soldo.nextFloat();
                System.out.println("Introduce o número total de días de desprazamento:");
                    float dieta=soldo.nextFloat();
                soldo.close();
            float sbruto=(sfixo+(comision*0.05f)+(km*2f)+(dieta*30f));
                System.out.println("O soldo bruto é: "+sbruto+"€");
            float sliquid=((sbruto-(sbruto*0.18f))-36f);
                System.out.println("O soldo líquido é: "+sliquid+"€");
    }
}