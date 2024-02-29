package Moves;

import ru.ifmo.se.pokemon.*;

public class StunSpore extends StatusMove {

    public StunSpore(double power, double acc) {
        super(Type.GRASS, power, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.paralyze(p);
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length-1];
    }

}


