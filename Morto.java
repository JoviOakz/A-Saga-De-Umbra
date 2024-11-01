public class Morto implements Estado {
    public void acao(Personagem personagem) {
        System.out.println(personagem.getNome() + " está morto e não pode agir.");
    }
}