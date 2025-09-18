package modelo;

public class MemoriaExtra {//memorias extras que acompanham cada pedido, seja memUSB ou HD externo
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
