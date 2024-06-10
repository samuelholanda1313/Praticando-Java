package Animais;

public class Cachorro {
    public String nome;
    public String cor;
    public int altura;
    public double peso;
    public int tamanhoDoRabo;
    public String estadoDeEspirito;

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

    public void comer(){};
    public String latir(){
        return "Au Au";
    }
    public String pegar (){
       return "Bolinha";
    }
    public String interagir (String acao){
        if (acao.equals("Carinho")) {
            this.estadoDeEspirito="O cachorro esta feliz";
        } else if (acao.equals("Gritar com o cachorro")) {
            this.estadoDeEspirito="Cachorro esta bravo";
        } else {
            this.estadoDeEspirito="O cachorro esta Neutro";
        } return this.estadoDeEspirito;
    }
}
