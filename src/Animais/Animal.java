package Animais;
    //ClASSE Pai que tornara possivel a Herança para demais classes FILHA de Animais;
public class Animal {
    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoDeEspirito;

    void comer(){}
    void dormir(){}
    void soar () {
        System.out.println("Cri Cri Cri");
    }}