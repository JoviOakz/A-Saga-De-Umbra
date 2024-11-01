public class Defesa implements Status {
    private int defesa;

    public Defesa(int defesa) {
        this.defesa = defesa;
    }

    @Override
    public int getStatus() {
        return defesa;
    }

    @Override
    public void setStatus(int defesa) {
        this.defesa = defesa;
    }
}