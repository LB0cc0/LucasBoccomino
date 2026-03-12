public abstract class Hero extends Criatura {
    private int danoP = 40;
    private int danoL = 150;

    public Hero(String nome) {
        super(nome, 900);

    }

    @Override
    public void atacar(Criatura alvo) {
        
    }

    public void apresentar(){
        System.out.println("O rei de Gondor precisa atravessar. Abra o caminho imediatamente!!");
    }

    public void fraseMorte(){
        System.out.println("Posso até partir, mas o reinado de Gondor será eterno!");
    }
    
}
