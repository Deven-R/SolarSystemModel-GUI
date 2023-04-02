public abstract class SolarBody {

    /**
     * This abstract class provides parameters and methods that can be used  by Sun, Planets and moons.
     * Is the common class between all objects to signify common properties of Solar System objects.
     * @author Deven Ramchandani
     */

    SolarSystem system;
    String name;
    String color;
    double angle;
    double diameter;
    double distance;


    public SolarBody(String name, String color, double angle, double diameter, double distance, SolarSystem system){
        this.name = name;
        this.color = color;
        this.angle = angle;
        this.diameter = diameter;
        this.distance = distance;
        this.system = system;
    }

    /**
     * Abstract method to allow classes inheriting from it to be able to display Objects.
     */
    public abstract void displayObject();

    /**
     * @return Distance to parent object.
     */
    public double getdistance(){
        return distance;
    }





}