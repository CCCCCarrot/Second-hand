package com.carrot.SecondHand.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@Embeddable
public class Address {

    @Column(name = "userEntity")
    private String city;
    private String street;

}
