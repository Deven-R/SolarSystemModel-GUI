public class Planet extends OrbitableObject {

    /**
     * This class inherits OrbitableObject class to differentiate planets and moons.
     * Give objects of the class to orbit round the sun.
     * @author Deven Ramchandani
     */


    /**
     * @param name
     * @param color
     * @param angle
     * @param diameter
     * @param distance
     * @param system
     * @param centreOfRotationDistance
     * @param centreOfRotationAngle
     * @param velocity
     * @param parentspeed
     */
    public Planet(String name, String color, double angle, double diameter, double distance, SolarSystem system,
                  double centreOfRotationDistance, double centreOfRotationAngle, double velocity, double parentspeed) {

        super(name, color, angle, diameter, distance, system, centreOfRotationDistance, centreOfRotationAngle, velocity, parentspeed);


    }




}