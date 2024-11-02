import java.util.ArrayList;
import java.util.List;

public class Personagem {
    private String nome;
    private int nivel;
    private int xp;
    private int xpParaProximoNivel;
    private Estado estado;
    private List<Status> habilidades;

    public Personagem(String nome) {
        this.nome = nome;
        this.nivel = 1;
        this.xp = 0;
        this.xpParaProximoNivel = 100;
        this.estado = new Vivo();
        this.habilidades = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void adicionarHabilidade(Status habilidade) {
        habilidades.add(habilidade);
    }

    public int getXp() {
        return xp;
    }
    
    public void atacar(Inimigo inimigo) {
        if (estado instanceof Morto) {
            System.out.println(nome + " está morto e não pode atacar.");
            return;
        }

        System.out.println(nome + " ataca " + inimigo.getNome() + "!");
        inimigo.receberDano(calcularPoderDeAtaque());

        if (inimigo.getVida() <= 0) {
            System.out.println(inimigo.getNome() + " foi derrotado!");
            ganharXP(inimigo.getXpRecompensa());
        }
    }

    public void defender() {
        System.out.println(nome + " está se defendendo.");
    }

    private int calcularPoderDeAtaque() {
        int poderTotal = 0;
        for (Status habilidade : habilidades) {
            poderTotal += habilidade.getStatus();
        }

        return poderTotal;
    }

    public void ganharXP(int xp) {
        this.xp += xp;
        System.out.println(nome + " ganhou " + xp + " XP!");

        if (this.xp >= xpParaProximoNivel) {
            subirNivel();
        }
    }

    private void subirNivel() {
        nivel++;
        xp -= xpParaProximoNivel;
        xpParaProximoNivel *= 1.5;
        habilidades.get(0).setStatus(habilidades.get(0).getStatus() + 5);
        System.out.println(nome + " subiu para o nível " + nivel + "!");
    }

    public void realizarAcao() {
        estado.acao(this);
    }

    public void receberDano(){
        setEstado(new Ferido());
    }
}