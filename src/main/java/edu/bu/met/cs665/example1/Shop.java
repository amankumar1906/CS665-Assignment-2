package edu.bu.met.cs665.example1;

/**
 * The interface for the subject in the Observer pattern.
 * It provides methods to attach, detach, and notify observers.
 */

public interface Shop {

  /**
   * Method to register an observer.
   *
   * @param driver the observer to be registered.
   */
  void attach(Driver driver);

  /**
   * Method to deregister an observer.
   *
   * @param driver the observer to be deregistered.
   */
  void detach(Driver driver);

  /**
   * Method to notify all registered observers of a change.
   *
   * @param request the delivery request to be sent to all observers.
   */
  void notifyDrivers(DeliveryRequest request);

}
