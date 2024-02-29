public abstract class Character implements IMoves, ICondition {
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

    public void forest(String about_weather, String about_food, String about_table){
        class Opinion{
            private String about_weather;
            private String about_food;
            private String about_table;
            Opinion(String about_people, String about_view, String about_general){
                this.about_weather = about_weather;
                this.about_food = about_food;
                this.about_table = about_table;
            }
            public void give_opinion(){
                System.out.println("Мнение о лесе:");
                System.out.println("О погоде: " + about_weather);
                System.out.println("О еде: " + about_food);
                System.out.println("О накрытом столе: " + about_table);
            }
        }
        Opinion opinion = new Opinion(about_weather, about_food, about_table);
        opinion.give_opinion();
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                "place='" + place + '\'' +
                '}';
    }

    @Override
    public void toStay() {
        System.out.println(name + " стоит у " + place);
    }

    @Override
    public void toSit() throws placeIsNotSetExeption {
        if (place.equals("")) {
            throw new placeIsNotSetExeption("У персонажа не задано место!");
        } else {
            System.out.println(name + " сидит на " + place);
        }
    }

    public abstract void setCondition(String condition);

    @Override
    public void isWaiting(String what) {

    }

    @Override

    public void isTalking(String message) {

    }

}
