public abstract class Criatura {
    private String nome;
    private int vida;

    public Criatura(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public abstract void atacar(Criatura alvo);
    public abstract void apresentar();
    public abstract void fraseMorte();

    public void dano(int dano) {
        System.out.println(this.nome + " recebeu " + dano + " de dano!");
        this.vida -= dano;
        if(!estaVivo()) {
            this.vida = 0;
            fraseMorte();
        }
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }

    public void mostrarVida() {
        System.out.println(this.nome + " tem " + this.vida + " pontos de vida.");
    }
    
}
