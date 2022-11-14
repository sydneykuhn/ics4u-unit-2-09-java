/*
* Bike
*
* @author  Sydney Kuhn
* @version 1.0
* @since   2022-11-13
*/

/**
 * Extends Vehicle to Bike.
 */

public class Bike extends Vehicle {

    /**
     * This is the cadence.
     */
    private int cadence;

    /**
     * This is the constructor for Bicycle.
     *
     * @param color this is the color.
     * @param maxSpeed this is the maxSpeed.
     * @param numWheel this is the # of wheels.
     *
     */
    public Bike(String color, int maxSpeed, int numWheel) {
        super(color, maxSpeed, numWheel);
    }

    /**
     * This sets the appliedPower.
     *
     * @param appliedPower this is the new variable.
     */
    public void accelerate(int appliedPower) {
        this.cadence = this.cadence + appliedPower;
        super.setSpeed(this.cadence * 2);
    }

    /**
     * This is the status method.
     */
    public void status() {
        super.status();
        System.out.println(" → Cadence: " + this.cadence);
    }

    /**
     * This is the cadence.
     *
     * @return this returns the cadence.
     */
    public int getCadence() {
        return this.cadence;
    }

    /**
     * This is the ringbell.
     */
    public void ringBell() {
        System.out.println("Ding ding!");
    }
}
