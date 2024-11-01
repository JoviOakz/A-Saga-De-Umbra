public class Inimigo {
    private String nome;
    private int vida;
    private int xpRecompensa;

    public Inimigo(String nome, int vida, int xpRecompensa) {
        this.nome = nome;
        this.vida = vida;
        this.xpRecompensa = xpRecompensa;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getXpRecompensa() {
        return xpRecompensa;
    }

    public void receberDano(int dano) {
        vida -= dano;
        System.out.println(nome + " recebeu " + dano + " de dano!");
    }
}