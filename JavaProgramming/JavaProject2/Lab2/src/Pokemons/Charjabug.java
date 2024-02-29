package Pokemons;

import Moves.IronDefense;
import Moves.Swagger;
import Moves.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Charjabug extends Pokemon {
    public Charjabug(String name, int level) {
        super(name, level);

        setType(Type.BUG, Type.ELECTRIC);
        setStats(57, 82, 95, 55, 75, 36);

        ThunderWave thunderWave = new ThunderWave(0, 90);
        Swagger swagger = new Swagger(0, 85);
        IronDefense ironDefense = new IronDefense(0, 100);

        setMove(thunderWave, swagger, ironDefense);

    }
}
