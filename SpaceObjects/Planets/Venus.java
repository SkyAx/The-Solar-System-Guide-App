package SpaceObjects.Planets;

import SpaceObjects.SpaceObject;

import java.math.BigInteger;

public final class Venus extends SpaceObject implements Planet{

    public Venus(String name, String type, int countSatellite, long weight, long area, int lengthOfCircle, double maxTemperature, double gravity) {
        super(name, type, countSatellite, weight, area, lengthOfCircle, maxTemperature, gravity);
    }

    @Override
    public BigInteger getWeight() {
        return super.getWeight().multiply(BigInteger.valueOf(1000));
    }

    public String getInformation() {
        return "Тип : " + getType() + "\n" + "Имя планеты : " + getName() + " - вторая планета от Солнца." + "\n" + "Количество спутников : " + getCountSatellite()
                + "\n" + "Вес планеты : " + getWeight() + " тонн." + "\n" + "Площадь поверхности : " + getArea() + " км.кв."
                + "\n" + "Длина окружности : " + getLengthOfCircle() + " км." + "\n" + "Максимальная зафиксированная температура на поверхности : "
                + getMaxTemperature() + " град. Цельсия." + "\n" + "Гравитация : " + getGravity() + " g." + "\n" + "\n" + "\n" + "  Интересные факты  " + "\n" + "\n"
                + "Размеры Венеры практически идентичны размера земли, поэтому эти две планеты называют близнецами." + "\n"
                + "К сожелению этого не достаточно для развития жизни на этой планете. Из-за постоянного покрытия плаенты облогами из серной кислоты, образуется парниковый эффект."
                + "Приятный факт : невооруженным глазом на закате и на восходе можно наблюдать Венеру." + "\n";
    }
}
