public class Orc extends Enemy {
    public Orc() {
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
