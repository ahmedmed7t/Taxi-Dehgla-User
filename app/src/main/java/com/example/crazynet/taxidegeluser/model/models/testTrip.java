package com.example.crazynet.taxidegeluser.model.models;

/**
 * Created by Medhat on 16/10/2018.
 */

public class testTrip {
    private String from;
    private String to ;
    private String car;
    private String carColor;
    private String tripNo;
    private String driverName;
    private String driverRate;
    private String price;
    private String date;
    public boolean visible;

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public testTrip(String from, String to, String date) {
        this.from = from;
        this.to = to;
        this.date = date;
        visible = false;
    }

    public testTrip(String from, String to, String car, String carColor, String tripNo, String driverName, String driverRate, String price , String date) {
        this.from = from;
        this.to = to;
        this.car = car;
        this.carColor = carColor;
        this.tripNo = tripNo;
        this.driverName = driverName;
        this.driverRate = driverRate;
        this.price = price;
        this.date = date;
        visible = false;
    }

    public testTrip() {
        visible = false;
    }

    public String getFrom() {
        return from;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getTripNo() {
        return tripNo;
    }

    public void setTripNo(String tripNo) {
        this.tripNo = tripNo;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverRate() {
        return driverRate;
    }

    public void setDriverRate(String driverRate) {
        this.driverRate = driverRate;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
