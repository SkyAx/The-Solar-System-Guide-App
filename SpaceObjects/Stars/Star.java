package SpaceObjects.Stars;

import SpaceObjects.SpaceObject;

public abstract class Star extends SpaceObject {

    protected Star(String aName,  int aCountSatellite, long aWeight, long aArea, int aLengthOfCircle, double aMaxTemperature, double aGravity) {
        super(aName, aCountSatellite, aWeight, aArea, aLengthOfCircle, aMaxTemperature, aGravity);
    }

    @Override
    public abstract String getInformation();

    @Override
    public String getType() {
        return "Звезда";
    }
}
