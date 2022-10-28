public class Caractere implements Comparable<Caractere>{
    private char c;
    private int qtd;

    public Caractere(char c, int qtd) {
        super();
        this.c = c;
        this.qtd = qtd;
    }

    public char getC() {
        return c;
    }

    public int getQtd() {
        return qtd;
    }

    public void setC(char c) {
        this.c = c;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return "Caractere{" +
                "c=" + c +
                ", qtd=" + qtd +
                '}';
    }


    @Override
    public int compareTo(Caractere o) {
        if (this.qtd > o.qtd)
            return -1;
        else if (this.qtd < o.qtd) {
            return 1;
        }
        return 0;
    }
}
