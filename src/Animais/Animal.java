package Animais;
    //ClASSE Pai que tornara possivel a Herança para demais classes FILHA de Animais;
public class Animal {
    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoDeEspirito;

        public Animal(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
            this.nome = nome;
            this.cor = cor;
            this.altura = altura;
            this.peso = peso;
            this.estadoDeEspirito = estadoDeEspirito;
        }

        public Animal(String nome, String cor, double peso, String estadoDeEspirito) {
        }

        public void comer(){}
        public void dormir(){}
        public void soar () {
        System.out.println("Cri Cri Cri");

    }

}