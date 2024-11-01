public class Main {
    public static void main(String[] args) {
        Personagem heroi = new Personagem("Umbra");
        heroi.adicionarHabilidade(new Força(10));
        heroi.adicionarHabilidade(new Defesa(5));

        Inimigo goblin = new Inimigo("Goblin", 20, 30);
        Chefe dragao = new Chefe("Dragão", 100, 200);

        heroi.realizarAcao();
        
        heroi.atacar(goblin);
        heroi.atacar(dragao);

        heroi.setEstado(new Ferido());
        heroi.realizarAcao();
        
        heroi.setEstado(new Morto());
        heroi.realizarAcao();
    }
}