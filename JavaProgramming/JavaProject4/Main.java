
public class Main {
    public static void main(String[] args) {
    //Задаём время суток и наполняем лес героями
        Forest forest = new Forest("Лес");
        TimeOfTheDay time = new TimeOfTheDay("Вечер", "чудесный");
        Christopher christopher = new Christopher("Кристофер", "Председательское место");
        Guest winniePooh = new Guest(eNames.WINNIEPOHH, "Конец стола");
        Guest piggy = new Guest(eNames.PIGGY, "стул №1");
        Guest rabbit = new Guest(eNames.RABBIT, "стул №2");
        Guest donkey = new Guest(eNames.DONKEY, "стул №3");
        Guest kengu = new Guest(eNames.KENGU, "");
        Guest ru = new Guest(eNames.RU, "стул №11");
        Guest Owl = new Guest(eNames.OWL, "стул №5");
        Guest relatives = new Guest(eNames.RELATIVES, "трава");


        System.out.println("Это был чудесный " + time.getTime() +"!");

        try {
            forest.forestIsReady();
        } catch (forestIsNotSetExeption message) {
            System.out.println(message.getMessage());
            System.exit(0);
        }

        System.out.println("В " + forest.getForest() +"у был накрыт длинный-предлинный стол, и на " + christopher.getPlace() + " сидит " + christopher.getName());
        winniePooh.toStay(); piggy.toSit(); rabbit.toSit(); donkey.toSit();kengu.toSit();ru.toSit();Owl.toSit();relatives.toSit();
        winniePooh.isWaiting("Пока " + christopher.getName() + " начнёт говорить");

        try {
            christopher.talkFinalSpeech();
        } catch (christopherDidntStartTalkingExeption message) {
            System.out.println(message.getMessage());
            System.exit(0);
        }


    }
}