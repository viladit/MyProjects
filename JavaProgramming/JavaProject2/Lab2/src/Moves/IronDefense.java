package Moves;

import ru.ifmo.se.pokemon.*;

public class IronDefense extends StatusMove {

    public IronDefense(double power, double acc) {
        super(Type.STEEL, power, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect effect = new Effect().stat(Stat.DEFENSE, 2);
        p.addEffect(effect);
        System.out.println(p.toString()+": защита +2!");

    }


    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length-1];
    }

}


