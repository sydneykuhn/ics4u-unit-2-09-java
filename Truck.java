/*
* Truck
*
* @author  Sydney Kuhn
* @version 1.0
* @since   2022-11-13
*/

/**
 * Extends Vehicle to Truck.
 */

public class Truck extends Vehicle {

    /**
    * This is the license plate.
    */
    private String licensePlate;

    /**
     * This is the truck constructor.
     *
     * @param color this is the color.
     * @param licensePlate this is the license plate.
     * @param maxSpeed this is the max speed.
     * @param numWheel this is the # of wheel.
     */
    public Truck(String color, String licensePlate, int maxSpeed,
           int numWheel) {
        super(color, maxSpeed, numWheel);
        this.licensePlate = licensePlate;
    }

    /**
     * This is the status method.
     */
    public void status() {
        super.status();
        System.out.println(" → licensePlate: " + this.getLicensePlate());
    }

    /**
     * This returns the licensePlate.
     *
     * @return this returns the licensePlate.
     */
    public String getLicensePlate() {
        return this.licensePlate;
    }

    /**
     * This sets the licensePlate.
     *
     * @param newLicensePlate this is the new variable.
     */
    public void setLicensePlate(String newLicensePlate) {
        this.licensePlate = newLicensePlate;
    }

    /**
     * This is the air pressure breaking method.
     *
     * @param airPressure this is the air pressure.
     * @param breakTime this is for the break time.
     * @param breakPower this is the break power.
     */
    public void airBrake(int breakPower, int breakTime, int airPressure) {
        super.setSpeed(
            super.getSpeed() - breakPower * breakTime - airPressure * breakTime
        );

        if (super.getSpeed() < 0) {
            super.setSpeed(0);
        }
    }
}
