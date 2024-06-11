import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1;
        Cachorro cachorro2;
        cachorro1 = new Cachorro("Rex", "branco",30,5.5,23,"bravo");
        Gato gato1 = new Gato("Felix","Manchado",5,2,"Manhoso");
        Passaro passaro1 = new Passaro("Vem vem","Colorido",1,1.5,"Cantador");
        cachorro1.Soar();
        gato1.soar();
        passaro1.soar();

    }
    }
