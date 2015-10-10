import java.io.*;

public final class Main {

    protected Main(){
        helloUser();
        getInfoOfSolarSystem();
    }

    SolarSystem solarSystem = new SolarSystem();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    //Ключевые строковые переменные, хранящие текст, участвующие в общении с пользователем

    private static String name;

    private String aboutSolarSystemAge = "Начнем с общей картины. По примерным подсчетам, нашей Солнечной системе "
            + SolarSystem.getSolarSystemAge() + " лет.";

    private String aboutStarsOfSolarSystem = "Количество звезд в нашей Солнечной системе - " + SolarSystem.getCountStars()
            + ", ее имя - " + solarSystem.sun.getName();

    private String aboutPlanetsOfSolarSystem = "Количество планет - " + SolarSystem.getCountPlanets() + ". Вот они, познакомьтесь : "
            + solarSystem.mercury.getName() + ", " + solarSystem.venus.getName() + ", " + solarSystem.earth.getName() + ", "
            + solarSystem.mars.getName() + ", " + solarSystem.jupiter.getName() + ", " + solarSystem.saturn.getName() + ", "
            + solarSystem.uranus.getName() + ", " + solarSystem.neptune.getName() + ".";


    public String getAboutSolarSystemAge() {
        return aboutSolarSystemAge;
    }

    public String getAboutStarsOfSolarSystem() {
        return aboutStarsOfSolarSystem;
    }

    public String getAboutPlanetsOfSolarSystem(){
        return aboutPlanetsOfSolarSystem;
    }

    private String helloUser() {

        String familiarity = "Вас приветствует путеводитель Солнечной системы.";

        String instructions = "Для прододжения работы введите имя :";

        System.out.println(familiarity);

        System.out.println(instructions);

        while (true) {

            String incorrectName = "Неккоректное имя. Попробуйте снова.";

            try {
                name = reader.readLine();
            }catch (IOException ex){
                ex.printStackTrace();
            }

            if ("".equals(name)) {
                System.out.println(incorrectName);
                continue;

            } else {
                String helloName = "Здравствуйте, " + name + "!";
                System.out.println(helloName);
            }
            return name;
        }
    }

    private void getInfoOfSolarSystem(){

        String instructions = "Для продолжения нажмите клавишу \"y\" , для выхода из программы нажмите \"n\".";
        System.out.println(instructions);
        String key= "";

        while (true) {
            try {
                key = reader.readLine();
            } catch (IOException ex){
                ex.printStackTrace();
            }
            String tryAgain = "Повторяем, любо y, либо n.";
            if ("".equals(key)) {
                System.out.println(tryAgain);

            } else if ("y".equals(key)) {

                System.out.println(getAboutSolarSystemAge());
                System.out.println(getAboutStarsOfSolarSystem());
                System.out.println(getAboutPlanetsOfSolarSystem());

                try {
                    getInfoOfSolarSystemObject();
                } catch (IOException ioex){
                    ioex.printStackTrace();
                }
                break;

            } else if ("n".equals(key)) {
                String goodByeUser = "До свидания, " + name + "!";
                System.out.println(goodByeUser);
                break;

            } else System.out.println(tryAgain);
        }
    }

    private void getInfoOfSolarSystemObject() throws IOException{

        String instructions = "Введите имя объекта нашей Солнечной системы, для получения подробной информации о нем. Для выхода нажмите \"n\".";
        String name = "";
        String notInfoAboutObject = "Не могу предоставить информации об этом объекте.";

        System.out.println(instructions);

        while (true) {

            name = reader.readLine().toLowerCase();

            if ("n".equals(name)) {
                System.out.println("До свидания, " + name + "!");
                reader.close();
                break;

            } else if ("меркурий".equals(name)) {
                System.out.println(solarSystem.mercury.getInformation());

            } else if ("венера".equals(name)) {
                System.out.print(solarSystem.venus.getInformation());

            } else if ("земля".equals(name)) {
                System.out.println(solarSystem.earth.getInformation());

            } else if ("марс".equals(name)) {
                System.out.println(solarSystem.mars.getInformation());

            } else if ("юпитер".equals(name)) {
                System.out.println(solarSystem.jupiter.getInformation());

            } else if ("сатурн".equals(name)) {
                System.out.println(solarSystem.saturn.getInformation());

            } else if ("уран".equals(name)) {
                System.out.println(solarSystem.uranus.getInformation());

            } else if ("нептун".equals(name)) {
                System.out.println(solarSystem.neptune.getInformation());

            } else if ("солнце".equals(name)) {
                System.out.println(solarSystem.sun.getInformation());

            } else System.out.println(notInfoAboutObject);
        }
    }

    public static void main(String[] args) {
        new Main();
    }

}
