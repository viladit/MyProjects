public class Christopher extends Character {
    public Christopher (String name, String place) {
        super(name, place);

    }

    @Override
    public void setCondition(String condition) {

    }

    public String getPlace() {
        return place;
    }


    @Override
    public void isWaiting(String what) {
        System.out.println(name + " ждёт " + what);
    }

    @Override
    public void isTalking(String message) {
        System.out.println(name + " говорит " + message);
    }


}
