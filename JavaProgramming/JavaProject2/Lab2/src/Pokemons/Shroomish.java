package Pokemons;

import Moves.DoubleTeam;
import Moves.StunSpore;
import Moves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Shroomish extends Pokemon {
    public Shroomish (String name, int level) {
        super(name, level);

        setType(Type.GRASS);
        setStats(60,40,60,40,60,35);

        StunSpore stunSpore = new StunSpore(0, 75);
        DoubleTeam doubleTeam = new DoubleTeam(0, 100);
        Swagger swagger = new Swagger(0, 85);

        setMove(stunSpore, doubleTeam, swagger);

    }
}
