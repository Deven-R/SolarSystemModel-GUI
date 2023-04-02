public class Sun extends SolarBody {

    /**
     * This class is to represent the Sun object on the SolarSystem window.
     * Class directly inherits from SolarBody as it is stationary and does not need orbitable functionalities.
     * @author Deven Ramchandani
     */

    /**
     * @param name the name given to the solarbody object that has been created
     * @param color col the colour of this object, as a string.
     * @param angle the angle (in degrees) that represents how far the object is around its orbit.
     * @param diameter the size of the object.
     * @param distance the distance from this object to the point about which it is orbiting.
     * @param system instance of SolarSystem.
     */
    public Sun(String name, String color, double angle, double diameter, double distance, SolarSystem system) {
        super(name, color, angle, diameter, distance, system);
        //TODO Auto-generated constructor stub
    }

    /* (non-Javadoc)
     * @see SolarBody#displayObject()
     */
    @Override
    public void displayObject() {
        system.drawSolarObject(distance, angle, diameter, color);
    }


}