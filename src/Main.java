import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1;
        cachorro1 = new Cachorro();
        cachorro1.nome="Marley";
        cachorro1.cor="Marrom";
        cachorro1.altura=2;
        cachorro1.peso=5.5;
        cachorro1.tamanhoDoRabo=3;
        System.out.println("O cachorro pegou uma "+cachorro1.pegar());
        System.out.println("O cachorro latiu.. "+cachorro1.latir());
        System.out.println(cachorro1.interagir("Gritar com o cachorro"));
    }
    }
