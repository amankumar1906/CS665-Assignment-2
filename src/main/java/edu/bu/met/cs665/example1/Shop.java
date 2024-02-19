/**
 * Name: Aman Kumar
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/17/2024
 * File Name: Shop.java
 * Description: This class manages driver notifications for delivery requests.
 */

package edu.bu.met.cs665.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * The Shop class acts as a notifier in the Observer pattern.
 * It maintains a list of drivers and notifies them of new delivery requests.
 */
public class Shop {
  private final List<Driver> drivers = new ArrayList<>();

  /**
   * Attaches (registers) a driver to receive notifications.
   *
   * @param driver the driver to attach
   */
  public void attach(Driver driver) {
    drivers.add(driver);
  }

  /**
   * Detaches (unregisters) a driver from receiving notifications.
   *
   * @param driver the driver to detach
   */
  public void detach(Driver driver) {
    drivers.remove(driver);
  }

  /**
   * Notifies all attached (registered) drivers of a new delivery request.
   *
   * @param request the delivery request to notify about
   */
  public void notifyDrivers(DeliveryRequest request) {
    for (Driver driver : drivers) {
      driver.update(request);
    }
  }
}
