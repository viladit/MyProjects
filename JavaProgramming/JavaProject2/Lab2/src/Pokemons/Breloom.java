package Pokemons;

import Moves.DoubleTeam;
import Moves.FocusBlast;
import Moves.StunSpore;
import Moves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Breloom extends Pokemon {
    public Breloom (String name, int level) {
        super(name, level);

        setType(Type.GRASS, Type.FIGHTING);
        setStats(60, 130, 80, 60, 60, 70);

        StunSpore stunSpore = new StunSpore(0, 75);
        DoubleTeam doubleTeam = new DoubleTeam(0, 100);
        Swagger swagger = new Swagger(0, 85);
        FocusBlast focusBlast = new FocusBlast(120, 70);

        setMove(stunSpore, doubleTeam, swagger, focusBlast);

    }

}
