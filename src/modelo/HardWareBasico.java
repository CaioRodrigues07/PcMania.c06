package modelo;

public class HardWareBasico {
    private String nome;
    private int memoria;

    public HardWareBasico(String nome, int memoria) {
        this.nome = nome;
        this.memoria = memoria;
    }

    public String getNome() {
        return this.nome;
    }

    public int getMemoria() {
        return this.memoria;
    }
}
