public class cachorro {
    private String nome;
    private String cor;
    private int altura;
    private int tamanhoDoRabo;

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public int getAltura() {
        return altura;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    @Override
    public String toString() {
        return "cachorro{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", altura=" + altura +
                ", tamanhoDoRabo=" + tamanhoDoRabo +
                '}';
    }
}
