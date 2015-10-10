package SpaceObjects.Planets;

import java.math.BigInteger;

public final class Saturn extends Planet{

    public Saturn(String name, int countSatellite, long weight, long area, int lengthOfCircle, double maxTemperature, double gravity) {
        super(name, countSatellite, weight, area, lengthOfCircle, maxTemperature, gravity);
    }

    @Override
    public BigInteger getWeight() {
        return super.getWeight().multiply(BigInteger.valueOf(100000));
    }

    public String getInformation() {
        return "Тип : " + getType() + "\n" + "Имя планеты : " + getName()+" - шестая планета от Солнца. Классифицируется как газовый гигант." + "\n"
                + "Количество спутников : " + getCountSatellite() + " (вращает вокруг себе около 40% всех спутников Солнечной системы)"
                + "\n" + "Вес планеты : " + getWeight() + " тонн или 95 масс Земли." + "\n" + "Площадь поверхности : " + getArea() + " км.кв."
                + "\n" + "Длина окружности : " + getLengthOfCircle() + " км." + "\n" + "\n" + "  Интересные факты  " + "\n" + "\n"
                + "Огромный интерес " + getName() + " вызывает из-за своих колец, которые окружают планету. Состоят они в основном из пыли и льда."
                + " Однако, попадаются и большие объекты." + "\n" + "По факту, " + getName() + " очень большой, но легкий. Если планету погрузить в воду,"
                + " она будет плавать на ее поверхности." + "\n" + getName() + " считается планетой бурь и ветров. Скорость ветра достигает скорости до 1700км/ч."
                + " Бури тут не такие большие и интенсивные как на Юпитере, но по сравнению с земными, они просто огромны." + "\n";
    }
}
