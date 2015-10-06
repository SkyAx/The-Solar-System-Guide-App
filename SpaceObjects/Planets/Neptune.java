package SpaceObjects.Planets;

import SpaceObjects.SpaceObject;

import java.math.BigInteger;

public final class Neptune extends SpaceObject implements Planet{

    public Neptune(String name, String type, int countSatellite, long weight, long area, int lengthOfCircle, double maxTemperature, double gravity) {
        super(name, type, countSatellite, weight, area, lengthOfCircle, maxTemperature, gravity);
    }

    @Override
    public BigInteger getWeight() {
        return super.getWeight().multiply(BigInteger.valueOf(100000));
    }

    public String getInformation() {
        return "Тип : " + getType() + "\n" + "Имя планеты : " + getName()+" - восьмая и самая дальняя планета от Солнца. Классифицируется как ледяной гигант."
                + "\n" + "Количество спутников : " + getCountSatellite() + "\n" + "Вес планеты : " + getWeight() + " тонн. 17 масс Земли."
                + "\n" + "Площадь поверхности : " + getArea() + " км.кв." + "\n" + "Длина окружности : " + getLengthOfCircle() + " км."
                + "\n" + "Максимальная зафиксированная температура на поверхности : " + getMaxTemperature() + " град. Цельсия."
                + "\n" + "Гравитация : " + getGravity() + " g." + "\n" + "\n" + "  Интересные факты  " + "\n" + "\n"
                + "В атмосфере Нептуна бушуют самые сильные ветры в Солнечной системе, их скорости могут достигать 2100 км/ч."
                + "\n" + "12 июля 2011 года Нептун завершил свой первый с момента открытия планеты в 1846 году полный оборот."
                + "\n" + "У Нептуна есть кольцевая система, хотя гораздо менее существенная, чем, к примеру, у Сатурна. Количество колец - 5" + "\n";
    }
}
