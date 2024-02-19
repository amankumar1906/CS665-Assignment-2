/**
 * Name: Aman Kumar
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/17/2024
 * File Name: Driver.java
 * Description: This interface defines the update method for drivers receiving delivery requests.
 */

package edu.bu.met.cs665.example1;

/**
 * The Driver interface.
 * It defines the behavior for drivers in the delivery system.
 */
public interface Driver {
  void update(DeliveryRequest request);
}
