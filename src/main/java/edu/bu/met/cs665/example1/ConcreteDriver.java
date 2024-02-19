/**
 * Name: YOUR_NAME
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/17/2024
 * File Name: ConcreteDriver.java
 * Description: This class represents a concrete implementation of a driver.
 */

package edu.bu.met.cs665.example1;

/**
 * Concrete implementation of the Driver interface.
 * Represents a driver in the delivery system.
 */
public class ConcreteDriver implements Driver {
    final private String name;

    /**
     * Constructor for ConcreteDriver.
     *
     * @param name the name of the driver
     */
    public ConcreteDriver(String name) {
        this.name = name;
    }

    /**
     * Receives updates about new delivery requests.
     *
     * @param request the delivery request
     */
    @Override
    public void update(DeliveryRequest request) {
        System.out.println("Driver " + name + " notified of new delivery: " + request);
    }
}
