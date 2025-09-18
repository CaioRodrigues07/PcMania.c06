package servico;

import modelo.Computador;

public class Cliente {
    private String nome;
    private String cpf;
    private Computador[] computadores;
    private int qtdComputadores = 0;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.computadores = new Computador[10];
    }

    public void addComputadores(Computador computador) {
        if (this.qtdComputadores < this.computadores.length) {
            this.computadores[this.qtdComputadores] = computador;
            ++this.qtdComputadores;
        } else {
            System.out.println("Computadores esgotados");
        }

    }

    public float calculaTotalCompra() {
        float total = 0.0F;

        for(int i = 0; i < this.qtdComputadores; ++i) {
            total += this.computadores[i].getPreco();
        }

        return total;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public Computador[] getComputadores() {
        return this.computadores;
    }
}
