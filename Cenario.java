public class Cenario {
    String[] cenario;

    public Cenario(String[] cenario){
        this.cenario = cenario;
    }

    String[] cenarioAtual;

    public String[] getCenarioAtual() {
        return cenarioAtual;
    }

    public void setCenarioAtual(String[] cenarioAtual) {
        this.cenarioAtual = cenarioAtual;
    }

    public void resetCenario(){
        cenarioAtual = cenario;
    }

    public void desenharNoCenario(String desenho, int x, int y, int xTamanho, int yTamanho){
        for (int i = x; i < x + xTamanho; i++) {
            for (int j = y; j < y + yTamanho; j++) {
                
            }
        }
    }


}