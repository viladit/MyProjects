import javax.naming.Name;

public class Main {
    public static void main(String[] args) {

    //Задаём время суток и наполняем лес героями
        Forest forest = new Forest("Лес");
        TimeOfTheDay time = new TimeOfTheDay("Вечер", "чудесный");
        Christopher christopher = new Christopher("Кристофер", "Председательское место");
        Guest winniePooh = new Guest(Names.WINNIEPOHH, "Конец стола");
        Guest piggy = new Guest(Names.PIGGY, "стул №1");
        Guest rabbit = new Guest(Names.RABBIT, "стул №2");
        Guest donkey = new Guest(Names.DONKEY, "стул №3");
        Guest kengu = new Guest(Names.KENGU, "стул №10");
        Guest ru = new Guest(Names.RU, "стул №11");
        Guest Owl = new Guest(Names.OWL, "стул №5");
        Guest relatives = new Guest(Names.RELATIVES, "трава");


        System.out.println("Это был чудесный " + time.getTime() +"!");

        if (forest.forestIsSet()) {
            System.out.println("В " + forest.getForest() +" был накрыт длинный-предлинный стол, и на " + christopher.getPlace() + " сидит " + christopher.getName());
            winniePooh.toStay(); piggy.toSit(); rabbit.toSit(); donkey.toSit();kengu.toSit();ru.toSit();Owl.toSit();relatives.toSit();
            winniePooh.isWaiting("Пока " + christopher.getName() + " начнёт говорить");

            if (Math.random() < 0.3) {
                christopher.isTalking("что в честь того, кто совершил славное дело приготовлен Большой Подарок.");
            }
            else {
                System.out.println(christopher.getName() + " не начал говорить, все разошлись.");
            }

        }
        else {
            System.out.println("В " + forest.getForest() +" ничего не накрыли и никто не пришёл.");
        }





    }
}