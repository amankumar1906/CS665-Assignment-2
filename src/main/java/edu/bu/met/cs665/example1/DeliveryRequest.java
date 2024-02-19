/**
 * Name: Aman Kumar
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/17/2024
 * File Name: DeliveryRequest.java
 * Description: This class is responsible for the details of a delivery request.
 */

package edu.bu.met.cs665.example1;

/**
 * This is the DeliveryRequest class.
 * It represents the details of a delivery request.
 */
public class DeliveryRequest {
  private final String orderId;
  private final String deliveryAddress;

  /**
   * Constructor for DeliveryRequest.
   *
   * @param orderId the ID of the order
   * @param deliveryAddress the address where the delivery is to be made
   */
  public DeliveryRequest(String orderId, String deliveryAddress) {
    this.orderId = orderId;
    this.deliveryAddress = deliveryAddress;
  }

  @Override
  public String toString() {
    return "Order ID: " + orderId + ", Delivery Address: " + deliveryAddress;
  }
}
