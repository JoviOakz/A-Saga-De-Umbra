public class Cenário {
    private String nome;

    public Cenário(String nome) {
        this.nome = nome;
    }

    public void entrar(Personagem personagem) {
        System.out.println(personagem.getNome() + " entrou no cenário: " + nome);
    }
}