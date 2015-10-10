package SpaceObjects.Planets;

import SpaceObjects.SpaceObject;

public abstract class Planet extends SpaceObject{

    protected Planet(String aName, int aCountSatellite, long aWeight, long aArea, int aLengthOfCircle, double aMaxTemperature, double aGravity) {
        super(aName, aCountSatellite, aWeight, aArea, aLengthOfCircle, aMaxTemperature, aGravity);
    }

    @Override
    public abstract String getInformation();

    @Override
    public String getType() {
        return "Планета";
    }
}
