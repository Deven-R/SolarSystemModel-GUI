public class Moon extends OrbitableObject{


    /**
     * This class extends Orbitable Object but differentiates from Planet class as it doesn't orbit around the sun, but planets.
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
    public Moon(String name, String color, double angle, double diameter, double distance, SolarSystem system,
                double centreOfRotationDistance, double centreOfRotationAngle, double velocity, double parentspeed) {
        super(name, color, angle, diameter, distance, system, centreOfRotationDistance, centreOfRotationAngle, velocity, parentspeed);


    }


}
