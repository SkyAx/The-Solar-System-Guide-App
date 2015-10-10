package SpaceObjects;

import java.math.BigInteger;

public abstract class SpaceObject {

    private String name;
    private int countSatellite;
    private long weight;
    private int lengthOfCircle;
    private long area;
    private double maxTemperature;
    private double gravity;

    protected SpaceObject(String aName,  int aCountSatellite, long aWeight, long aArea, int aLengthOfCircle, double aMaxTemperature, double aGravity) {
        this.name = aName;
        this.countSatellite = aCountSatellite;
        this.weight = aWeight;
        this.area = aArea;
        this.lengthOfCircle = aLengthOfCircle;
        this.maxTemperature = aMaxTemperature;
        this.gravity = aGravity;
    }

    public String getName() {
        return name;
    }

    public double getGravity() {
        return gravity;
    }

    public double getMaxTemperature() {
        return maxTemperature;
    }

    public long getArea() {
        return area;
    }

    public BigInteger getWeight() {
        return BigInteger.valueOf(weight);
    }

    public BigInteger getLengthOfCircle() {
        return BigInteger.valueOf(lengthOfCircle);
    }

    public int getCountSatellite() {
        return countSatellite;
    }

    public abstract String getType();

    public abstract String getInformation();

}

