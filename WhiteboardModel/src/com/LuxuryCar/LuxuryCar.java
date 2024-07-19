package com.LuxuryCar;

public class LuxuryCar {
    private static int MAX_SPEED = 200;
    private static int MIN_SPEED = 0;
    private String make;
    private String model;
    private Body body;
    private int year;
    private int dash;
    private boolean isTurnedOn;
    private int mph;

    // Constructors
    public LuxuryCar() {

    }

    public LuxuryCar(String make, String model, Body body, int year, int dash) {
        setMake(make);
        setModel(model);
        setBody(body);
        setYear(year);
        setDash(dash);
    }

    //Getters and Setters

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDash() {
        return dash;
    }

    public void setDash(int dash) {
        this.dash = dash;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        isTurnedOn = turnedOn;
    }

    public int getMph() {
        return mph;
    }

    public void setMph(int mph) {
        this.mph = mph;
    }

    // BUSINESS METHODS (functions) - what operations can com.LuxuryCar objects do?
    public void turnOn() {
        setTurnedOn(true);
            System.out.println("Welcome Big Ke");
    }

    public void turnOff() {
        setTurnedOn(false);
        System.out.println("Shutting down...goodbye");
    }

    public void accelerate(int mph) {
        if (mph > MAX_SPEED || MIN_SPEED > mph) {
            System.out.println("Please accelerate speed between " + MIN_SPEED +
                    " and " + MAX_SPEED + " .");
        }
        else {
            setMph(mph);
            System.out.println("You are going " + getMph() + " mph.");
        }
    }

    @Override
    public String toString () {
        return String.format("%s: make=%s, model=%s, body=%s, year=%s, color=%s",
                getClass().getSimpleName(), getMake(), getModel(), getBody(), getYear(), getDash());
    }

}