public class Guest extends Character {
    public Guest (Names name, String place) {
        super(String.valueOf(name), place);

    }

    public String getPlace() {
        return place;
    }

    @Override
    public void setCondition(String condition) {

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
