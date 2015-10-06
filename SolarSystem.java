import SpaceObjects.Planets.*;
import SpaceObjects.Stars.Sun;

public final class SolarSystem {

    public SolarSystem () {
        init();
    }

    public static final long SOLAR_SYSTEM_AGE = 4568200000l;
    public static final byte COUNT_PLANETS = 8;
    public static final byte COUNT_STARS = 1;

    Sun sun;
    Mercury mercury;
    Venus venus;
    Earth earth;
    Mars mars;
    Saturn saturn;
    Jupiter jupiter;
    Neptune neptune;
    Uranus uranus;

    public static long getSolarSystemAge() {
        return SOLAR_SYSTEM_AGE;
    }

    public static byte getCountPlanets() {
        return COUNT_PLANETS;
    }

    public static byte getCountStars() {
        return COUNT_STARS;
    }

    void createSun(){
        sun = new Sun("Солнце", "Звезда", 0,1989100000000000000l, 6087350987525L, 437001000, 6000.0, 27.96);
    }

    void createMercury(){
        mercury = new Mercury("Меркурий", "Планета", 0, 3330220000000000000L, 74980584L, 15329, 427, 0.377);
    }

    void createVenus(){
        venus = new Venus("Венера", "Планета", 0, 4867669000000000000L, 460084944L, 38018, 464, 0.904);
    }

    void createEarth(){
        earth = new Earth("Земля", "Планета", 1, 5972600000000000000L, 144350376L, 40075, 56.7, 0.99732);
    }

    void createMars(){
        mars = new Mars("Марс", "Планета", 2, 6418500000000000000L, 74800000L, 21337, 20, 0.378);
    }

    void createSaturn(){
        saturn = new Saturn("Сатурн", "Планета", 62, 5684600000000000000L, 42720000000L, 341569, -139, 1.044);
    }

    void createJupiter(){
        jupiter = new Jupiter("Юпитер", "Планета", 67, 1898600000000000000l, 62179600000l, 705597, -145, 2.535);
    }

    void createNeptune(){
        neptune = new Neptune("Нептун", "Планета", 14, 1024300000000000000L, 7640800000L, 240236, -200, 1.1);
    }

    void createUranus(){
         uranus = new Uranus("Уран", "Планета", 27, 8683200000000000000L, 8115600000L, 252257, -216 ,0.886);
    }

    void init(){
        createSun();
        createMercury();
        createVenus();
        createEarth();
        createMars();
        createSaturn();
        createJupiter();
        createUranus();
        createNeptune();
    }
}
