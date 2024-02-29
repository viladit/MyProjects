public abstract class Character implements Moves, Condition {
    protected String name;
    protected String place;

    public Character(String name, String place) {
        this.name = name;
        this.place = place;
    }
    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() == getClass()) return false;
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void toStay() {
        System.out.println(name + " стоит у " + place);
    }

    @Override
    public void toSit() {
        System.out.println(name + " сидит на " + place);
    }

    public abstract void setCondition(String condition);
}
