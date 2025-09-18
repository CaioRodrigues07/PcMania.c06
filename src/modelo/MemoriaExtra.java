package modelo;

public class MemoriaExtra {
    private String nome;
    private int gigas;

    public MemoriaExtra(String nome, int gigas) {
        this.gigas = gigas;
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public int getGigas() {
        return this.gigas;
    }
}
