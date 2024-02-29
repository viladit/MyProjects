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

    public String getForest() {
        return forest;
        }
}

