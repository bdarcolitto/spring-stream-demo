package com.example.demo.kafka.model;

public class URKey {

    private String ur_id;
    private String customer_id;

    public URKey () {
    }

    public URKey (final String ur_id, final String customer_id) {
        this.ur_id = ur_id;
        this.customer_id = customer_id;
    }

    public String getUr_id () {
        return ur_id;
    }

    public void setUr_id (final String ur_id) {
        this.ur_id = ur_id;
    }

    public String getCustomer_id () {
        return customer_id;
    }

    public void setCustomer_id (final String customer_id) {
        this.customer_id = customer_id;
    }

    @Override
    public String toString () {
        final StringBuilder builder = new StringBuilder()//
                .append("URKey [")//
                .append("ur_id=\"")//
                .append(ur_id).append("\"")//
                .append(",customer_id=\"")//
                .append(customer_id).append("\"")//
                .append("]");
        return builder.toString();
    }
}
