package SpaceObjects.Planets;

import SpaceObjects.SpaceObject;

import java.math.BigInteger;

public final class Uranus extends SpaceObject implements Planet{

    public Uranus(String name, String type, int countSatellite, long weight, long area, int lengthOfCircle, double maxTemperature, double gravity) {
        super(name, type, countSatellite, weight, area, lengthOfCircle, maxTemperature, gravity);
    }

    @Override
    public BigInteger getWeight() {
        return super.getWeight().multiply(BigInteger.valueOf(10000));
    }

    public String getInformation() {
        return "Тип : " + getType() + "\n" + "Имя планеты : " + getName()+" - седьмая планета от Солнца. Классифицируется как ледяной гигант." + "\n"
                + "Количество спутников : " + getCountSatellite() + "\n" + "Вес планеты : " + getWeight() + " тонн(14,6 земных)"
                + "\n" + "Площадь поверхности : " + getArea() + " км.кв." + "\n" + "Длина окружности : " + getLengthOfCircle() + " км."
                + "\n" + "Максимальная зафиксированная температура на поверхности : " + getMaxTemperature() + " град. Цельсия."
                + "\n" + "Гравитация : " + getGravity() + " g." + "\n" + "\n" + "  Интересные факты  " + "\n" + "\n"
                + "Ориентация Урана сильно отличается от других планет. Ось планеты лежит как бы на боку. Вселдствие, к солнцу Уран ображен то севверным поюсом, то южным"
                + "\n" + "Лето на Уране длится один долгий день – 42 года." + "\n" + "Уран имеет кольца как Юпитер и Сатурн. На данный момет известно 13 колец." + "\n";
    }
}
