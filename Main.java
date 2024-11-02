import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Personagem heroi = new Personagem("Umbra");
        heroi.adicionarHabilidade(new Força(10));
        heroi.adicionarHabilidade(new Defesa(5));

        Inimigo goblin = new Inimigo("Goblin", 20, 200);
        Chefe dragao = new Chefe("Dragão", 100, 1000);

        boolean fugirgoblin = false;
        boolean fugir = false;
        while (!fugirgoblin) {
            System.out.println("\n\nVocê se encontra com um Goblin.");
            while (!fugirgoblin) {
                System.out.println("O que deseja fazer?");
                System.out.println("1 - Atacar");
                System.out.println("2 - Fugir");
                System.out.println("3 - Defender");
        
                switch (scanner.nextInt()) {
                    case 1:
                        heroi.atacar(goblin);
                        break;
        
                    case 2:
                        fugirgoblin = true;
                        break;
        
                    case 3:
                        heroi.defender();
                        break;
                
                    default:
                        break;
                }
                if (fugirgoblin) {
                    System.out.println("Umbra fugiu do goblin");
                    break;
                }
                heroi.realizarAcao();
                if (goblin.getVida() <= 0) {
                    break;
                }

                goblin.atacar(heroi);
                heroi.realizarAcao();
            }
            if (fugirgoblin) {
                break;
            }
            
            System.out.println("\n\nVoce se encontra com um dragão.");
            fugir = false;
            
            while (!fugir) {

                System.out.println("O que deseja fazer?");
                System.out.println("1 - Atacar");
                System.out.println("2 - Fugir");
                System.out.println("3 - Defender");
        
                switch (scanner.nextInt()) {
                    case 1:
                        heroi.atacar(dragao);
                        break;
        
                    case 2:
                        fugir = true;
                        break;
        
                    case 3:
                        heroi.defender();
                        break;
                
                    default:
                        break;
                }
                heroi.realizarAcao();
                if (dragao.getVida() <= 0) {
                    break;
                }

                dragao.atacar(heroi);
                heroi.realizarAcao();
            }
        }
        if (heroi.getXp() == 0) {
            System.out.println("E evitou batalhas desnecessárias, e agora descança numa foqueira ao por do sol");
        }
        else{
            System.out.println("E após tanta matança ele sentou-se numa foqueira no por do sol, caindo em si exausto percebendo que todo o batalhas sem fim eram desnecessarias e poderiam ser encerradas apenas ignorando-as. \n\n E Morreu...\n\n Essa historia nao eh somente sobre Umbra mas sim voce \n\n");
            heroi.setEstado(new Morto());
            heroi.realizarAcao();
        }
        scanner.close();
    }
}