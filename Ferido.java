public class Ferido implements Estado {
    public void acao(Personagem personagem) {
        System.out.println(personagem.getNome() + " está ferido e age com dificuldade.");
    }
}