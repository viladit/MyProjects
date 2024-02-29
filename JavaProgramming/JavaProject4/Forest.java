public class Forest {
    private String forest;

    public Forest(String forest){
        this.forest = forest;

    }
    public boolean forestIsSet() {
        if (Math.random() < 0.2) {
            return false;
        }
        else {
            return true;
        }
    }

    public void forestIsReady() throws forestIsNotSetExeption {

        System.out.println("Проверяем лес на готовность...");
        if (forestIsSet()) {
            System.out.println("Лес готов! Ждём гостей...");
        } else {
            throw new forestIsNotSetExeption("Лес не готов, нужно подготовить его лучшe.");
        }
    }




    public String getForest() {
        return forest;
        }
}

