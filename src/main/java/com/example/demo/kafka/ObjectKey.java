package com.example.demo.kafka;

import java.io.Serializable;

public class ObjectKey implements Serializable {

    private static final long serialVersionUID = 5127528438989086871L;

    public ObjectKey () {
    }

    public ObjectKey (final String ur_code, final String customer_code) {
        this.ur_code = ur_code;
        this.customer_code = customer_code;
    }

    private String ur_code;
    private String customer_code;

    public String getUr_code () {
        return ur_code;
    }

    public void setUr_code (final String ur_code) {
        this.ur_code = ur_code;
    }

    public String getCustomer_code () {
        return customer_code;
    }

    public void setCustomer_code (final String customer_code) {
        this.customer_code = customer_code;
    }
}
