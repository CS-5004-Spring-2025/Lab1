package car;

/**
 * This class represents a Car.
 */
public class Car {

    // A data member to hold the make of the car.
    private String make;

    /*
     * TODO: create data members for model, year, and mileage.
     * Make sure to choose appropriate types!
     *
     */

    /**
     * TODO: Complete constructor.
     * @param make
     * @param model
     * @param year
     */
    public Car(String make, String model, int year) {
        //TODO: Complete the constructor.
        this.make = make;
    }

    /**
     * Returns the make of the car.
     * @return make
     */
    public String getMake() {
        return make;
    }

    /*
     * TODO: Create getters for model, year, and mileage.
     *
     */

    /**
     * Adds miles to the car as specified byCarTest the parameter.
     * @param milesToDrive distance to add to the mileage.
     */
    public void drive(double milesToDrive) {
        // TODO: Complete this method.
    }

    /**
     * Return a string representation of the object.
     * @return
     *
     */
    public String toString() {
        // TODO: Complete this method.
        return null;
    }

}
