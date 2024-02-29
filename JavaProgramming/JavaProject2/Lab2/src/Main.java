import Pokemons.*;
import ru.ifmo.se.pokemon.*;


public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();

        Diancie diancie = new Diancie("Феечка-терминатор", 1);
        Shroomish shroomish = new Shroomish("Гриб", 1);
        Breloom breloom = new Breloom("Динозаврик", 1);
        Grubbin grubbin = new Grubbin("Жук-Двурог", 1);
        Charjabug charjabug = new Charjabug("Жук-коробка", 1);
        Vikavolt vikavolt = new Vikavolt("Жук-Электричка", 1);

        b.addAlly(diancie);
        b.addAlly(shroomish);
        b.addAlly(breloom);
        b.addFoe(grubbin);
        b.addFoe(charjabug);
        b.addFoe(vikavolt);
        b.go();


    }
}
