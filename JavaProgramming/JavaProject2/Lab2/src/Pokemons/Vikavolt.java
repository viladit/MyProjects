package Pokemons;

import Moves.BugBuzz;
import Moves.IronDefense;
import Moves.Swagger;
import Moves.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Vikavolt extends Pokemon {
    public Vikavolt(String name, int level) {
        super(name, level);

        setType(Type.BUG, Type.ELECTRIC);
        setStats(77, 70, 90, 145, 75, 43);

        ThunderWave thunderWave = new ThunderWave(0, 90);
        Swagger swagger = new Swagger(0, 85);
        IronDefense ironDefense = new IronDefense(0, 100);
        BugBuzz bugBuzz = new BugBuzz(90, 100);

        setMove(thunderWave, swagger, ironDefense, bugBuzz);
    }
}
