package Pokemons;

import Moves.AncientPower;
import Moves.DoubleTeam;
import Moves.Moonblast;
import Moves.PowerGem;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Diancie extends Pokemon {

    public Diancie (String name, int level) {
        super(name, level);

        super.setType(Type.ROCK, Type.FAIRY);
        super.setStats(50, 100, 150, 100, 150, 50);

        AncientPower ancientPower = new AncientPower(60, 100);
        PowerGem powergem = new PowerGem(80,100);
        DoubleTeam doubleTeam = new DoubleTeam(0, 100);
        Moonblast moonblast = new Moonblast(95, 100);

        super.setMove(ancientPower, powergem, doubleTeam, moonblast);
    }

}
