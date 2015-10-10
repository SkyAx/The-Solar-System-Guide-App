package SpaceObjects.Planets;

import java.math.BigInteger;

public final class Earth extends Planet {

    public Earth(String name, int countSatellite, long weight, long area, int lengthOfCircle, double maxTemperature, double gravity) {
        super(name, countSatellite, weight, area, lengthOfCircle, maxTemperature, gravity);
    }

    @Override
    public BigInteger getWeight() {
        return super.getWeight().multiply(BigInteger.valueOf(1000));
    }

    @Override
    public String getInformation() {
        return "Тип : " + getType() + "\n" + "Имя планеты : " + getName() + " - третья планета от Солнца. Другие названия Земли - Terra, SOL 3."
                + "\n" + "Количество спутников : " + getCountSatellite() + "\n" + "Вес планеты : " + getWeight() + " тонн."
                + "\n" + "Площадь поверхности : " + getArea() + " км.кв. В сравнении с Солнцем, это как крупинка мака и апельсин."
                + "\n" + "Длина окружности : " + getLengthOfCircle() + " км." + "\n" + "Максимальная зафиксированная температура на поверхности : "
                + getMaxTemperature() + " град. Цельсия." + "\n" + "Гравитация : " + getGravity() + " g." + "\n" + "\n"
                + "  Интересные факты  " + "\n" + "\n" + "Благодоря, наверное, чуду наша Земля находится не так далеко,"
                + " что быть холодной и не так близко, что бы быть расскаленной." + "\n" + "Такие благоприятные условия способствовали"
                + " зарождению жизни. Наша планета - уникальный и единственный в своем роде объект Солнечной системы." + "\n";
    }
}

