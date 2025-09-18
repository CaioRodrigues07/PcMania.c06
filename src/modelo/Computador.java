package modelo;

import java.io.PrintStream;

public class Computador {
    private String marca;
    private float preco;
    private HardWareBasico[] hardwares = new HardWareBasico[3];
    private SistemaOperacional sistemaOperacional;
    private MemoriaExtra memEXT;

    public Computador(String marca, float preco, HardWareBasico[] hardwares, SistemaOperacional SO) {
        this.marca = marca;
        this.preco = preco;
        this.hardwares = hardwares;
        this.sistemaOperacional = SO;
    }

    public void mostraPCcfg() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Preço: R$ " + this.preco);

        for(HardWareBasico basico : this.hardwares) {
            if (basico.getNome().contains("Pentium Core")) {
                PrintStream var10000 = System.out;
                String var10001 = basico.getNome();
                var10000.println("Processador: " + var10001 + " (" + basico.getMemoria() + " Mhz)");
            } else if (basico.getNome().contains("Memória RAM")) {
                PrintStream var5 = System.out;
                int var10 = basico.getMemoria();
                var5.println(var10 + "Gb de " + basico.getNome());
            } else if (basico.getNome().contains("HD")) {
                if (basico.getMemoria() >= 1000) {
                    PrintStream var6 = System.out;
                    int var11 = basico.getMemoria() / 1000;
                    var6.println(var11 + "Tb de " + basico.getNome());
                } else {
                    PrintStream var7 = System.out;
                    int var12 = basico.getMemoria();
                    var7.println(var12 + "Gb de " + basico.getNome());
                }
            }
        }

        PrintStream var8 = System.out;
        String var13 = this.sistemaOperacional.getNome();
        var8.println("Sistema Operacional: " + var13 + " (" + this.sistemaOperacional.getTipo() + " bits)");
        if (this.memEXT != null) {
            var8 = System.out;
            var13 = this.memEXT.getNome();
            var8.println("Acompanha: " + var13 + " de " + this.memEXT.getGigas() + "Gb");
        }

    }

    public void AddMemoria(MemoriaExtra memEXT) {
        this.memEXT = memEXT;
    }

    public float getPreco() {
        return this.preco;
    }

    public static Computador criaPromocao1() {
        int matricula = 447;
        SistemaOperacional SO = new SistemaOperacional("macOS Sequoia", 64);
        HardWareBasico[] HB = new HardWareBasico[3];
        HB[0] = new HardWareBasico("Pentium Core i3", 2200);
        HB[1] = new HardWareBasico("Memória RAM", 8);
        HB[2] = new HardWareBasico("HD", 500);
        Computador pc = new Computador("Apple", (float)matricula, HB, SO);
        MemoriaExtra memEXT = new MemoriaExtra("Pen-drive", 16);
        pc.AddMemoria(memEXT);
        return pc;
    }

    public static Computador criaPromocao2() {
        int matricula = 447;
        int preco = matricula + 1234;
        SistemaOperacional SO = new SistemaOperacional("Windows 8", 64);
        HardWareBasico[] HB = new HardWareBasico[3];
        HB[0] = new HardWareBasico("Pentium Core i5", 3370);
        HB[1] = new HardWareBasico("Memória RAM", 16);
        HB[2] = new HardWareBasico("HD", 1000);
        Computador pc = new Computador("Samsung", (float)preco, HB, SO);
        MemoriaExtra memEXT = new MemoriaExtra("Pen-drive", 32);
        pc.AddMemoria(memEXT);
        return pc;
    }

    public static Computador criaPromocao3() {
        int matricula = 447;
        int preco = matricula + 5678;
        SistemaOperacional SO = new SistemaOperacional("Windows 10", 64);
        HardWareBasico[] HB = new HardWareBasico[3];
        HB[0] = new HardWareBasico("Pentium Core i7", 4500);
        HB[1] = new HardWareBasico("Memória RAM", 32);
        HB[2] = new HardWareBasico("HD", 2000);
        Computador pc = new Computador("Dell", (float)preco, HB, SO);
        MemoriaExtra memEXT = new MemoriaExtra("HD Externo", 1000);
        pc.AddMemoria(memEXT);
        return pc;
    }
}
