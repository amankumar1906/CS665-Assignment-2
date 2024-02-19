/**
 * Name: Aman Kumar
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/17/2024
 * File Name: TestDeliverySystem.java
 * Description: This class represents JUnit tests for the implementation of the Observer pattern.
 */
package edu.bu.met.cs665;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

// Update the import statements if needed based on your package structure
import edu.bu.met.cs665.example1.DeliveryRequest;
import edu.bu.met.cs665.example1.Driver;
import edu.bu.met.cs665.example1.ConcreteShop;
import edu.bu.met.cs665.example1.Shop; // Import the Shop interface

/**
 * Unit tests for the delivery system demonstrating the Observer pattern functionality.
 * This class verifies the correct registration, notification, and removal of drivers.
 */
public class TestDeliverySystem {
  private Shop shop;
  private Driver driver1, driver2, driver3;
  private DeliveryRequest request;

  @Before
  public void setUp() {
    // Initialize the concrete shop and mock drivers
    shop = new ConcreteShop();
    driver1 = mock(Driver.class);
    driver2 = mock(Driver.class);
    driver3 = mock(Driver.class);

    // Create a sample delivery request
    request = new DeliveryRequest("Order123", "1234 Main St, Anytown");
  }


    @Test
    public void testDriverRegistrationAndNotification() {
        // Register drivers with the shop
        shop.attach(driver1);
        shop.attach(driver2);

        // Simulate a delivery request notification
        shop.notifyDrivers(request);

        // Verify that each registered driver received exactly one notification
        verify(driver1, times(1)).update(request);
        verify(driver2, times(1)).update(request);
    }

    @Test
    public void testDriverDeregistration() {
        // Register and then deregister driver1
        shop.attach(driver1);
        shop.detach(driver1);

        // Attempt to notify all drivers of a new delivery request
        shop.notifyDrivers(request);

        // Verify that the deregistered driver did not receive any notification
        verify(driver1, never()).update(request);
    }

    @Test
    public void testNotificationWithoutRegistration() {
        // Attempt to notify drivers without registering them first
        shop.notifyDrivers(request);

        // Verify that an unregistered driver did not receive a notification
        verify(driver3, never()).update(request);
    }

    @Test
    public void testMultipleDriverNotification() {
        // Register multiple drivers
        shop.attach(driver1);
        shop.attach(driver2);
        shop.attach(driver3);

        // Notify all drivers of a new delivery request
        shop.notifyDrivers(request);

        // Verify all drivers received the notification
        verify(driver1, times(1)).update(request);
        verify(driver2, times(1)).update(request);
        verify(driver3, times(1)).update(request);
    }

    @Test
    public void testMultipleNotificationsToOneDriver() {
        // Register a single driver
        shop.attach(driver1);

        // Create another delivery request
        DeliveryRequest anotherRequest = new DeliveryRequest("Order456", "5678 Another St, Sometown");

        // Notify the driver of both requests
        shop.notifyDrivers(request);
        shop.notifyDrivers(anotherRequest);

        // Verify the driver received notifications for both requests
        verify(driver1, times(1)).update(request);
        verify(driver1, times(1)).update(anotherRequest);
    }
}
