package servico;

import modelo.Computador;
import servico.LimpaTela;

public class ProcessarPedido {
    public static void helper(Computador[] computadores, float total, String cpf, String nome) {
        LimpaTela.exec();
        System.out.println("Finalizando pedido.... ");

        for(Computador pc : computadores) {
            if (pc != null) {
                System.out.println("====================================================================================");
                pc.mostraPCcfg();
                System.out.println("====================================================================================");
            }
        }

        System.out.println("Pedido finaliado!!");
        System.out.println("O total da compra é: R$ " + total);
        System.out.println("compra efetuada no CPF: " + cpf);
        System.out.println("Agradecemos a preferencia Sr(a)" + nome + " ,volte sempre!");
    }
}
