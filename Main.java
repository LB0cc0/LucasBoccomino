public class Main{
    public static void main(String[] args) {
        Criatura heroi = new Hero("Aragorn");
        Criatura orc = new Orc();

        System.out.println("#####################");
        heroi.apresentar();
        orc.apresentar();

        int cont = 1;
        while (true) { 
            System.out.println("--------");
            System.out.println("Rodada "+ cont);
            heroi.mostrarVida();
            orc.mostrarVida();

            heroi.atacar(orc);
            if(orc.estaVivo()) {
                orc.atacar(heroi);
            } 

            if(!heroi.estaVivo()) {
                heroi.fraseMorte();
                break;
            }

            if(!orc.estaVivo()) {
                orc.fraseMorte();
                break;
            }

        }}

    }
