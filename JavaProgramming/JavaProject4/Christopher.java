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

    public boolean christopherIsReadyForTalking() {
        if (Math.random() < 0.5) {
            return false;
        }
        else {
            return true;
        }
    }

    public void talkFinalSpeech() throws christopherDidntStartTalkingExeption {

        System.out.println("Кристофер вот-вот что-то скажет...");
        if (christopherIsReadyForTalking()) {
            isTalking("что в честь того, кто совершил славное дело приготовлен Большой Подарок.");
        } else {
            throw new christopherDidntStartTalkingExeption("Кристофер передумал, и все разошлись.");
        }
    }

    public class christophersLook {
        private String hairColor = "Блонд";
        private int height = 170;

        public String getHairColor() {
            return hairColor;
        }

        public int getHeight() {
            return height;
        }
    }

    public static class howChristopherLooksLike{
        public static int getChristophersHeight(int height) {
            return height;
        }
        public static String getChristophersHairColor(String hairColor) {
            return hairColor ;
        }
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
