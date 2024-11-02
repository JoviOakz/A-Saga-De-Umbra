public class Ferido implements Estado {
    public void acao(Personagem personagem) {
        System.out.println(personagem.getNome() + " Está ferido e luta com dificuldades.");
    }
}