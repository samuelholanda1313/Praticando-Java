import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1;
        Cachorro cachorro2;
        cachorro1 = new Cachorro("Rex", "branco",30,5.5,23,"bravo");

        cachorro2 = new Cachorro("Topper", "Preto", 25, 2.5, 3, "Carinho");

        System.out.println("O cachorro pegou uma "+cachorro1.pegar());
        System.out.println("O cachorro latiu.. "+cachorro2.Soar());
        System.out.println(cachorro1.interagir("Carinho"));
        System.out.println(cachorro1.getNumeroDeCachorros());
    }
    }
