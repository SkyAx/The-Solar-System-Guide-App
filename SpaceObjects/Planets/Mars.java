package SpaceObjects.Planets;

import java.math.BigInteger;

public final class Mars extends Planet{

    public Mars(String name, int countSatellite, long weight, long area, int lengthOfCircle, double maxTemperature, double gravity) {
        super(name, countSatellite, weight, area, lengthOfCircle, maxTemperature, gravity);
    }

    @Override
    public BigInteger getWeight() {
        return super.getWeight().multiply(BigInteger.valueOf(100));
    }

    public String getInformation() {
        return "Тип : " + getType() + "\n" + "Имя планеты : " + getName()+" - четвертая планета от Солнца." + "\n" + "Количество спутников : " + getCountSatellite()
                + "\n" + "Вес планеты : " + getWeight() + " тонн." + "\n" + "Площадь поверхности : " + getArea() + " км.кв.(0,283 земной)"
                + "\n" + "Длина окружности : " + getLengthOfCircle() + " км." + "\n" + "Максимальная зафиксированная температура на поверхности : "
                + getMaxTemperature() + " град. Цельсия." + "\n" + "Гравитация : " + getGravity() + " g." + "\n" + "\n"
                + "  Интересные факты  " + "\n" + "\n" + getName()+" - планета земной группы, с разряженной атмосферой."
                + " Имеет красный оттенок из-за оксида железа." + "\n" + "Планета приобрела свою популярность у исследователей"
                + " благодоря относительно умеренной температуре, наличию воды (в виде льда), рельефу (наблюдаются русла рек), своей атмосфере и др."
                + "\n" + getName()+ " - самая исследуемая планета. На данный момент ее изучением занимаются 2 марсахода и 5 искусственных спутников."
                + "\n" + "В ближайшие десятелетия планируется высадка и колонизация человека на поверхность." + "\n";
    }
}
