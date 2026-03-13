import java.util.Random;
import java.util.Scanner;

public class Hero extends Criatura {
    private int danoP = 40;
    private int danoL = 150;

    public Hero(String nome) {
        super(nome, 900);

    }

    @Override
    public void atacar(Criatura alvo) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Escolha sua arma:");
       System.out.println("1) Faca - Dano: " + danoP);
       System.out.println("2) Arco - Dano: " + danoL + " (chance de acerto de 70%)"); 

       int escolha = sc.nextInt();

       while (escolha < 1 || escolha > 2) {
           System.out.println("Escolha inválida. Por favor, escolha 1 ou 2.");
           escolha = sc.nextInt();
       }

       if(escolha == 1) {
           alvo.dano(this.danoP);
       } else {
          Random rand = new Random();
            int chance = rand.nextInt(100);
            if(chance >= 50){
                alvo.dano(this.danoL);
                System.out.println("Acertou o alvo com o arco! Causou " + this.danoL + " de dano!");
            } else {
                System.out.println("Errou o alvo com o arco! Não causou dano.");
            }
       }
    }

    public void apresentar(){
        System.out.println("O rei de Gondor precisa atravessar. Abra o caminho imediatamente!!");
    }

    public void fraseMorte(){
        System.out.println("Posso até partir, mas o reinado de Gondor será eterno!");
    }
    
}
