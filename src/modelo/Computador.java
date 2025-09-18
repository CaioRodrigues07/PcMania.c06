package modelo;


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
            if (basico.getNome().contains("Pentium Core")){
                System.out.println("Processador: " + basico.getNome() + " (" + basico.getMemoria() + " Mhz)");
            } else if (basico.getNome().contains("Memória RAM")) {
                System.out.println(basico.getMemoria() + "Gb de " + basico.getNome());
            } else if (basico.getNome().contains("HD")) {
                if (basico.getMemoria() >= 1000) {
                    System.out.println((int)(basico.getMemoria()/1000) + "Tb de " + basico.getNome());;
                } else {
                    System.out.println((int)basico.getMemoria() + "Gb de " + basico.getNome());
                }
            }
        }

        System.out.println("Sistema Operacional: " + this.sistemaOperacional.getNome() + " (" + this.sistemaOperacional.getTipo() + " bits)");


        //verifica e mostra e tem memoria extra
        if (this.memEXT != null) {
            System.out.println("Acompanha: " + this.memEXT.getNome() + " de " + this.memEXT.getGigas() + "Gb");
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
