package com.company;

/**
 * Created by idejesus on 05/03/2017.
 */
public class Car {
    private  int mDoors;
    private  int mWheels;
    private String mModel;
    private String mEngine;
    private String mColor;

    public Car(int doors, int wheels, String model, String engine, String color) {
        mDoors = doors;
        mWheels = wheels;
        mModel = model;
        mEngine = engine;
        mColor = color;
    }

    public Car(String model) {

        mModel = model;
        mColor = "red";

    }w


    public int getDoors() {
        return mDoors;
    }

    public void setDoors(int doors) {
        if(doors < 2){
            System.out.println("Please enter a valid number of doors");

        }else{
            mDoors = doors;

        }
    }

    public int getWheels() {
        return mWheels;
    }

    public void setWheels(int wheels) {
        mWheels = wheels;
    }

    public String getModel() {
        return mModel;
    }

    public void setModel(String model) {
        mModel = model;
    }

    public String getEngine() {
        return mEngine;
    }

    public void setEngine(String engine) {
        mEngine = engine;
    }

    public String getColor() {
        return mColor;
    }

    public void setColor(String color) {
        mColor = color;
    }
}
