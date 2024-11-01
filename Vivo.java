public class Vivo implements Estado {
    public void acao(Personagem personagem) {
        System.out.println(personagem.getNome() + " está vivo e pode agir normalmente.");
    }
}