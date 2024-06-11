package Animais;

public class Cachorro extends Animal{

    static int numeroDeCachorros;//feito p/ contabilizar a qnt de cachorros na classe

    private int tamanhoDoRabo;

    public Cachorro() {

    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
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
