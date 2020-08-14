package com.example.demo.kafka.model;

public class URValue {

    private Float value1;
    private Float value2;
    private Float value3;

    public URValue () {
    }

    public URValue (final Float value1, final Float value2, final Float value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public Float getValue1 () {
        return value1;
    }

    public void setValue1 (final Float value1) {
        this.value1 = value1;
    }

    public Float getValue2 () {
        return value2;
    }

    public void setValue2 (final Float value2) {
        this.value2 = value2;
    }

    public Float getValue3 () {
        return value3;
    }

    public void setValue3 (final Float value3) {
        this.value3 = value3;
    }

    @Override
    public String toString () {
        final StringBuilder builder = new StringBuilder()//
                .append("URValue [")//
                .append("value1=")//
                .append(value1)//
                .append(",value2=")//
                .append(value2)//
                .append(",value3=")//
                .append(value3)//
                .append("]");
        return builder.toString();
    }
}
