package app;

import java.util.Scanner;
import modelo.Computador;
import servico.Cliente;
import servico.LimpaTela;
import servico.ProcessarPedido;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("Bem-vindo a nossa loja, PCmania!!!");
        System.out.println("===================================");
        System.out.println("Para darmos inicio ao atendimento, por favor informe seu nome: ");
        String C1nome = leitor.nextLine();
        System.out.println("Informe seu cpf: ");
        String C1cpf = leitor.nextLine();
        Cliente cliente1 = new Cliente(C1nome, C1cpf);

        LimpaTela.exec();

        System.out.println("Ola " + C1nome + ", aqui temos as nossas promoção: ");

        System.out.println("    ========== Promoção 01 ==========");
        Computador PC1 = Computador.criaPromocao1();
        PC1.mostraPCcfg();

        System.out.println("    ========== Promoção 02 ==========");
        Computador PC2 = Computador.criaPromocao2();
        PC2.mostraPCcfg();

        System.out.println("    ========== Promoção 03 ==========");
        Computador PC3 = Computador.criaPromocao3();
        PC3.mostraPCcfg();

        System.out.println("=======>Para escolher a promoção digite o numero referente a ela");
        System.out.println("=======>Digite 0 caso queira encerrar as compras");

        for(int i = leitor.nextInt(); i != 0; i = leitor.nextInt()) {
            if (i == 1) {
                cliente1.addComputadores(PC1);
            } else if (i == 2) {
                cliente1.addComputadores(PC2);
            } else if (i == 3) {
                cliente1.addComputadores(PC3);
            }
        }

        float total = cliente1.calculaTotalCompra();
        ProcessarPedido.helper(cliente1.getComputadores(), total, cliente1.getCpf(), cliente1.getNome());
    }
}
