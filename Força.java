public class Força implements Status {
    private int poder;

    public Força(int poder) {
        this.poder = poder;
    }

    @Override
    public int getStatus() {
        return poder;
    }

    @Override
    public void setStatus(int poder) {
        this.poder = poder;
    }
}