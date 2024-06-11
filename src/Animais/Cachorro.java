package Animais;

public class Cachorro {

    static int numeroDeCachorros;//feito p/ contabilizar a qnt de cachorros na classe
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;
    private String estadoDeEspirito;

    public Cachorro() {

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    //OVERRIDE sobscreve o ToString fazendo com que seja impresso em tela o nome do Objeto e nao seu end de memoria
    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", tamanhoDoRabo=" + tamanhoDoRabo +
                '}';
    }

    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    //CONSTRUCTOR da classe, que defini os atributos como parametro padrao do OBJETO "Cachorro"
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;
        numeroDeCachorros ++; //Incrementa a qnt de Cachorros existentes na classe, essa declaraçao de "numeroDeCachorros" feita la em cima em atributos.

    }

    public void comer(){}

    public String Soar(){
        return "Au Au";
    }
    public String pegar (){
       return "Bolinha";
    }
    public String interagir (String acao){
        switch (acao){
            case "Carinho": this.estadoDeEspirito="O cachorro esta feliz";
            break;
            case "Gritar com o cachorro": this.estadoDeEspirito="Cachorro esta bravo";
            break;
            default: this.estadoDeEspirito="O cachorro esta Neutro";
            break;
     }
     return estadoDeEspirito;

    }
}
