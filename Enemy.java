public abstract class Enemy extends Criatura {
    private int dano;

    public Enemy(String nome, int vida, int dano) {
        super(nome, vida);
        this.dano = dano;
    }

    public void atacar(Criatura alvo){
        alvo.dano(dano);
    }


    
}
