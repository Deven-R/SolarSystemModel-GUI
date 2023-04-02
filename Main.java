public class Main {

    /**
     * This class provides a graphical user interface to a model of the solar system and objects created.
     * @author Deven Ramchandani
     */

    /**
     * Displays all SolarBody objects.
     * Uses classes that inherit Solarbody and OrbitableObject class.
     * A window is displayed using SolarSystem class.
     * An array is created to ensure user can add and remove Planets as he/she wishes.
     * The array is iterated to ensure all planets are able to orbit around the sun.
     * @param args
     */
    public static void main(String[] args) {

        SolarSystem system = new SolarSystem(1600, 900);
        Sun sun = new Sun("Sun", "YELLOW", 0, 100, 0, system);
        Planet[] planets = {
                new Planet("Mercury", "#1a1a1a", 0, 10, sun.getdistance() , system, 150, 10, 4.7, 0),
                new Planet("Venus", "#e6e6e6", 0, 10, sun.getdistance() , system, 200, 10, 3.5, 0),
                new Planet("Earth", "BLUE", 0, 15, sun.getdistance() , system, 250, 10, 3, 0),
                new Planet("Mars", "RED", 0, 15, sun.getdistance() , system, 300, 10, 2.4, 0),
                new Planet("Jupiter", "#b07f35", 0, 25, sun.getdistance() , system, 350, 10, 1.3, 0),
                new Planet("Saturn", "#b08f36", 0, 20, sun.getdistance() , system, 400, 10, 0.9, 0),
                new Planet("Uranus", "#5580aa", 0, 10, sun.getdistance() , system, 450, 10, 0.6, 0),
                new Planet("Neptune", "#366896", 0, 15, sun.getdistance() , system, 500, 10, 0.5, 0),
        };
        Moon moon = new Moon("Moon", "WHITE", 0, 10, planets[2].getdistance(), system, planets[2].getcentreOfRotationDistance(), 10, 5, 0);


        while (true) {
            for (int i = 0; i < 8; i++) {
                planets[i].orbit();
            }
            moon.orbit();
            sun.displayObject();
            system.finishedDrawing();
        }
    }
}