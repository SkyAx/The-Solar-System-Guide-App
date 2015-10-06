package SpaceObjects;

import java.math.BigInteger;

public abstract class SpaceObject {

    private String name;
    private String type;
    private int countSatellite;
    private long weight;
    private int lengthOfCircle;
    private long area;
    private double maxTemperature;
    private double gravity;


    public String getName() {
        return name;
    }

    public String getType() {
        return type;
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

    protected abstract String getInformation();

    protected SpaceObject(String aName, String aType, int aCountSatellite, long aWeight, long aArea, int aLengthOfCircle, double aMaxTemperature, double aGravity) {
            this.name = aName;
            this.type = aType;
            this.countSatellite = aCountSatellite;
            this.weight = aWeight;
            this.area = aArea;
            this.lengthOfCircle = aLengthOfCircle;
            this.maxTemperature = aMaxTemperature;
            this.gravity = aGravity;

    }

    protected SpaceObject () {

    }

}

