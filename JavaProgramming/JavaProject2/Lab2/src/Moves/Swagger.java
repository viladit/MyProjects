package Moves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {

    public Swagger(double power, double acc) {
        super(Type.NORMAL, power, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect.confuse(p);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect effect = new Effect().stat(Stat.ATTACK, 2);
        p.addEffect(effect);
        System.out.println(p.toString()+": урон +2!");

    }


    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length-1];
    }

}

