import entities.CamaroteInferior;
import entities.CamaroteSuperior;
import entities.Ingresso;
import entities.Normal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Ingresso ingresso;

        int opcao=0;

        do {
            System.out.println("\nVenda de Ingressos, qual ingresso deseja comprar");
            System.out.println("1(Ingresso normal)\t2(VIP - Camarote inferior)\t " +
                    "3(VIP - Camarote superior)\t 0(Fechar o programa)");
            opcao = scan.nextInt();
            // Faça o objeto ingresso se comportar como os demais
            switch (opcao){
                case 1:
                    System.out.println("Deseja confirmar a compra?");
                    String resposta= scan.next();
                    if(resposta.equalsIgnoreCase("Sim")) {
                        System.out.println("Compra efetuada!");
                        ingresso = new Normal();
                        ingresso.imprimirNormal();
                        ingresso.imprimirValor();
                    }
                    break;
                case 2:
                    System.out.println("Deseja confirmar a compra?");
                    resposta= scan.next();
                    if(resposta.equalsIgnoreCase("Sim")) {
                        System.out.println("Compra efetuada!");
                        ingresso= new CamaroteInferior();
                        ingresso.imprimirValorAdicional();
                    }
                    break;
                case 3:
                    System.out.println("Deseja confirmar a compra?");
                    resposta= scan.next();
                    if(resposta.equalsIgnoreCase("Sim")) {
                        System.out.println("Compra efetuada!");
                        ingresso = new CamaroteSuperior();
                        ingresso.imprimirRelatorio();
                    }
                     break;
                default:
                    opcao=0;
                    break;
            }
        }while (opcao!=0);
    }
}