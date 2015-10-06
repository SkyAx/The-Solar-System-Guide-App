package SpaceObjects.Stars;

import SpaceObjects.SpaceObject;

import java.math.BigInteger;

public final class Sun extends SpaceObject implements Star {

    public Sun(String name, String type, int countSatellite, long weight, long area, int lengthOfCircle, double maxTemperature, double gravity) {
        super(name, type, countSatellite, weight, area, lengthOfCircle, maxTemperature, gravity);
    }

    @Override
    public BigInteger getWeight() {
        return super.getWeight().multiply(BigInteger.valueOf(1000000000l));
    }

    @Override
    public BigInteger getLengthOfCircle() {
        return  super.getLengthOfCircle().multiply(BigInteger.valueOf(10));
    }

    public String getInformation() {
        return "Тип : " + getType() + "\n" + "Имя : " + getName() + "\n" + "Количество спутников : все объекты солнечной системы являются спутниками Солнца."
                + "\n" + "Вес + " + getWeight() + " тонн. Это 333 037 планет Земля!!! " + "\n" + "Площадь поверхности : " + getArea() + " км.кв. или 11 917 площадей Земли!!!"
                + "\n" + "Длина окружности : " + getLengthOfCircle() + " км." + "\n" + "Максимальная температура на поверхности : " + getMaxTemperature() + " град. Цельсия."
                + "\n" + "Гравитация : " + getGravity() + " g." + "\n" + "\n" + "  Интересные факты  " + "\n" + "\n"
                + "Забудьте, что температура Солнца" + getMaxTemperature() + " град. Цельсия, подумайте о притяжении в 28 раз привышаюшее земное!" + "\n"
                + "Именно эта огромная равитация Солнца заставляет вращатьяс вокруг себя такие удаленные объекты Солнечной системы, как Плутон." + "\n"
                + "Несмотря на все это, астраномы считают что Солнце имеет средний размер. Самая большая известная звезда - это VY Большого Пса, средний радиус которой составляетет 1420 радиусов солнца."
                + "\n" + "Что бы облететь такую звезду на реактивном самолете потребовалось бы 787 лет." + "\n";
    }
}


