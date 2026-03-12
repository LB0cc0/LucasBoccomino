public abstract class Orc extends Enemy {
    public Orc(String nome, int vida, int dano) {
        super("Orlock", 1000, 50);
    }

    @Override
    public void apresentar() {
        System.out.println("Alto lá, humano! Para passar pela ponte, deve enfrentar o guardião da ponte. SAQUE A SUA ARMA!!!");
    }

    @Override
    public void fraseMorte() {
        System.out.println(" *O Orc grunhe em agonia e cai ao chão...* ");
    }
    
}
