package one.digitalinnovation.gof;

import one.digitalinnovation.gof.exemplostrategy.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Strategy
        Humor normal = new HumorNormal();
        Humor irritado = new HumorIrritado();
        Humor extremamenteIrritado = new HumorExtremamenteIrritado();
        Humor extremamenteAlegre = new HumorExtremamenteAlegre();
        Humor alegre = new HumorAlegre();


        Chefe chefe = new Chefe();

        Scanner scan = new Scanner(System.in);
        System.out.println("Selecione como o chefe está se sentindo em relação a você: ");
        System.out.println("1 - Normal");
        System.out.println("2 - Alegre");
        System.out.println("3 - Extremamente alegre");
        System.out.println("4 - Irritado");
        System.out.println("5 - Extremamente irritado");
        System.out.print("Digite apenas um número: ");

        switch(scan.nextInt()){
            case 1:
                chefe.setHumor(normal);
                break;
            case 2:
                chefe.setHumor(alegre);
                break;
            case 3:
                chefe.setHumor(extremamenteAlegre);
                break;
            case 4:
                chefe.setHumor(irritado);
                break;
            case 5:
                chefe.setHumor(extremamenteIrritado);
                break;
        }

        System.out.print("Deseja interagir com o chefe? S/N: ");
        String resposta = scan.next();
        if(resposta.equalsIgnoreCase("s"))
            chefe.interagir();
        else if (resposta.equalsIgnoreCase("n"))
            System.out.println("O chefe passou por você e nenhuma interação foi feita.");

    }
}
