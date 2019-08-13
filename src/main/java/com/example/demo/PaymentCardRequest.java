package com.example.demo;

import java.io.Serializable;

import lombok.Data;

/**
 * The Payment card request to create send payment method requests
 * 
 * @author sappraja
 *
 */
@Data
public class PaymentCardRequest implements Serializable {

    /**
     * The Constant serialVersionUID.
     */
    private static final long serialVersionUID = 5589430520219362269L;

    private String id;
    private String name;
    private String label;
    private long mlifeNumber;
    private String paymentType;
    private String ccType;
    private String expiration;
    private String cardNumber;
    private int cvv;
    private boolean defaultMethod;
    private String street1;
    private String street2;
    private String city;
    private String state;
    private String country;
    private String postalCode;
    private String paymentApiAccessToken;
}