public class Chefe extends Inimigo {
    public Chefe(String nome, int vida, int xpRecompensa) {
        super(nome, vida, xpRecompensa);
    }

    public void habilidadeEspecial() {
        System.out.println(getNome() + " usou uma habilidade especial!");
    }
}