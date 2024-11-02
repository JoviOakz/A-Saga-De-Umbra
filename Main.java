import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Personagem heroi = new Personagem("Umbra");
        heroi.adicionarHabilidade(new Força(10));
        heroi.adicionarHabilidade(new Defesa(5));

        Inimigo goblin = new Inimigo("Goblin", 20, 200);
        Chefe dragao = new Chefe("Dragão", 100, 1000);

        System.out.println("Voce se encontra com um goblin.");
        boolean fugirgoblin = false;
        boolean fugir = false;
        while (!fugirgoblin) {
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
            
            System.out.println("Voce se encontra com um dragão.");
            
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
            System.out.println("kkkkkkkkkkkk Gayzão com medo de Goblin - Umbra corre agora para sempre de uma onça pintuda - ");
        }
        else{
            System.out.println("E após tanta matança ele sentou-se numa foqueira no por do sol, caindo em si e seus pensamentos que todo o Stress e as batalhas Sem fim eram desnecessárias e poderiam ser encerradas apenas ignorando-as, essa historia nao é somente sobre Umbra");
            heroi.setEstado(new Morto());
            heroi.realizarAcao();
        }
        scanner.close();
    }
}