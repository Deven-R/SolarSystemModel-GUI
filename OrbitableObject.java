public abstract class OrbitableObject extends SolarBody {

    /**
     * This class inherits SolarBody class and provides additional parameters and methods for objects to be able to orbit.
     * @author Deven Ramchandani
     */

    double velocity;
    double centreOfRotationDistance;
    double centreOfRotationAngle;
    double parentspeed;

    /**
     * @param name
     * @param color
     * @param angle
     * @param diameter
     * @param distance
     * @param system
     * @param centreOfRotationDistance
     * @param centreOfRotationAngle
     */
    public OrbitableObject(String name, String color, double angle, double diameter, double distance,
                           SolarSystem system, double centreOfRotationDistance, double centreOfRotationAngle, double velocity ,double parentspeed) {
        super(name, color, angle, diameter, distance, system);
        this.velocity = velocity;
        this.centreOfRotationAngle = centreOfRotationAngle;
        this.centreOfRotationDistance = centreOfRotationDistance;
        this.parentspeed = parentspeed;
        //TODO Auto-generated constructor stub
    }

    /**
     * Uses angle and parentspeed to give an orbital functionality to all objects calling this method
     *
     * The method also calls displayObject() method to provide display functionality along with orbital functionality
     * improving code simplicity.
     */
    public void orbit() {
        angle += parentspeed;
        centreOfRotationAngle = centreOfRotationAngle + velocity;
        displayObject();
    }

    /* (non-Javadoc)
     * @see SolarBody#displayObject()
     */
    @Override
    public void displayObject() {
        system.drawSolarObjectAbout(distance, angle, diameter, color, centreOfRotationDistance, centreOfRotationAngle);
    }

    /**
     * @return centreofRotationDistance the distance part of the polar co-ordinate about which this object orbits.
     */
    public double getcentreOfRotationDistance(){
        return centreOfRotationDistance;
    }

    /**
     * @return parentspeed
     */
    public  double getparentspeed() {
        return parentspeed;
    }

    /**
     * @return velocity that the object is supposed to orbit
     */
    public double getspeed() {
        return velocity;
    }




}