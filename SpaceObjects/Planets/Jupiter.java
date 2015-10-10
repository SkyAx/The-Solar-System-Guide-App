package SpaceObjects.Planets;

import java.math.BigInteger;

public final class Jupiter extends Planet {

    public Jupiter(String name, int countSatellite, long weight, long area, int lengthOfCircle, double maxTemperature, double gravity) {
        super(name, countSatellite, weight, area, lengthOfCircle, maxTemperature, gravity);
    }

    @Override
    public BigInteger getWeight() {
        return super.getWeight().multiply(BigInteger.valueOf(1000000));
    }

    public String getInformation() {
        return "Тип : " + getType() + "\n" + "Имя планеты : " + getName()+" - пятая планета от Солнца, крупнейшая в Солнечной системе. Классифицируется как газовый гигант."
                + "\n" + "Количество спутников : " + getCountSatellite() + "\n" + "Вес планеты : " + getWeight() + " тонн."
                + "\n" + "Площадь поверхности : " + getArea() + " км.кв." + "\n" + "Длина окружности : " + getLengthOfCircle() + " км."
                + "\n" + "Максимальная зафиксированная температура на поверхности : " + getMaxTemperature() + " град. Цельсия."
                + "\n" + "Гравитация : " + getGravity() + " g." + "\n" + "\n" + "  Интересные факты  " + "\n" + "\n"
                + "\n" + "Планета известна с античных времён и названа в честь древнеримского бога Юпитера, аналога древнегреческого Зевса, повелителя всех богов."
                + "\n" + "Большое красное пятно на планете Юпитер – это гигантский антициклон, который длится как минимум уже 350 лет"
                + "\n" + "Юпитер как и сатурн имеет кольца, но их всего 5." + "\n" + "Диаметр Юпитера в 11 раз превышает диаметр Земли,"
                + " а его объем - самый большой среди всех планет Солнечной системы. Он мог бы вместить в себя тысячу таких планет, как наша!" + "\n";
    }
}
