package SpaceObjects.Planets;

import java.math.BigInteger;

public final class Mercury extends Planet{

    public Mercury(String name, int countSatellite, long weight, long area, int lengthOfCircle, double maxTemperature, double gravity) {
        super(name, countSatellite, weight, area, lengthOfCircle, maxTemperature, gravity);
    }

    @Override
    public BigInteger getWeight() {
        return super.getWeight().multiply(BigInteger.valueOf(100));
    }

    public String getInformation() {
        return "Тип : " + getType() + "\n" + "Имя планеты : " + getName() + " - первая от Солнца планета." + "\n" + "Количество спутников : " + getCountSatellite()
                + "\n" + "Вес планеты : " + getWeight() + " тонн. (0,055274 земной)" + "\n" + "Площадь поверхности : "
                + getArea() + " км.кв.(0.147 земной)" + "\n" + "Длина окружности : " + getLengthOfCircle() + " км."
                + "\n" + "Максимальная температура на поверхности : " + getMaxTemperature() + " град. Цельсия."
                + "\n" + "Гравитация : " + getGravity() + " g." + "\n" + "\n" + "  Интересные факты  " + "\n" + "\n"
                + "Из-за экстремальных температур, жизнь на Меркурии отсутствует." + "\n" + "Меркурий — самая маленькая планета земной группы."
                + " Она уступает по размерам Ганимеду и Титану — самым крупным спутникам Юпитера и Сатурна соответственно." + "\n"
                + "В течение примерно 8 суток скорость орбитального движения превышает скорость вращательного — Солнце на небе планеты Меркурий"
                + " останавливается и начинает двигаться в обратном направлении." + "\n";
    }
}
