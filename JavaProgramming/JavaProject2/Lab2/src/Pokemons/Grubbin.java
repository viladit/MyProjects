package Pokemons;

import Moves.Swagger;
import Moves.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Grubbin extends Pokemon {
    public Grubbin (String name, int level) {
        super(name, level);

        setType(Type.BUG);
        setStats(47, 62, 45, 55, 45, 46);

        ThunderWave thunderWave = new ThunderWave(0, 90);
        Swagger swagger = new Swagger(0, 85);

        setMove(thunderWave, swagger);

    }
}
