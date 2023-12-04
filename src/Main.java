import entities.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Ingresso ingresso;
        Vip vipIngresso;
        int opcao=0;
        String localAssento="";
        do {
            System.out.println("\nVenda de Ingressos, qual ingresso deseja comprar");
            System.out.println("1(Ingresso normal)\t2(VIP - Camarote inferior)\t " +
                    "3(VIP - Camarote superior)\t 0(Fechar o programa)");
            opcao = scan.nextInt();
            // Faça o objeto ingresso se comportar como os demais
            switch (opcao){
                case 1:
                    ingresso = new Normal();
                    ingresso.imprimirNormal();
                    ingresso.imprimirValor();
                    System.out.println("Deseja confirmar a compra?");
                    String resposta= scan.next();
                    if(resposta.equalsIgnoreCase("Sim")) {
                        System.out.println("Compra efetuada!");
                        ingresso.imprimirNormal();
                        ingresso.imprimirValor();
                    }
                    break;
                case 2:
                    vipIngresso= new CamaroteInferior();
                    vipIngresso.imprimirValorAdicional();
                    System.out.println("Digite o Local do assento do ingresso:");
                    localAssento= scan.next();
                    vipIngresso.setLocalizacao(localAssento);
                    System.out.println("Deseja confirmar a compra?");
                    resposta= scan.next();
                    if(resposta.equalsIgnoreCase("Sim")) {
                        System.out.println("Compra efetuada!");
                        vipIngresso.imprimirValorAdicional();
                        vipIngresso.imprimirLocal();
                    }
                    break;
                case 3:
                    vipIngresso = new CamaroteSuperior();
                    vipIngresso.imprimirRelatorio();
                    System.out.println("Digite o Local do assento do ingresso:");
                    localAssento= scan.next();
                    vipIngresso.setLocalizacao(localAssento);
                    System.out.println("Deseja confirmar a compra?");
                    resposta= scan.next();
                    if(resposta.equalsIgnoreCase("Sim")) {
                        System.out.println("Compra efetuada!");
                        vipIngresso.imprimirRelatorio();
                        vipIngresso.imprimirLocal();
                    }
                     break;
                default:
                    opcao=0;
                    break;
            }
        }while (opcao!=0);
    }
}