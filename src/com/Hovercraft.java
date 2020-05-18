//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com;

import javax.xml.crypto.Data;

public class Hovercraft {
    String OwnerShip;
    String GPSPosition;
    String price;
    String id;
    Data dataOfPurchase;

    public Hovercraft() {
    }

    public Hovercraft(String ownerShip, String GPSPosition, String price, String id, Data dataOfPurchase) {
        this.OwnerShip = ownerShip;
        this.GPSPosition = GPSPosition;
        this.price = price;
        this.id = id;
        this.dataOfPurchase = dataOfPurchase;
    }

    public void drivingMethod() {
    }

    public String getOwnerShip() {
        return this.OwnerShip;
    }

    public void setOwnerShip(String ownerShip) {
        this.OwnerShip = ownerShip;
    }

    public String getGPSPosition() {
        return this.GPSPosition;
    }

    public void setGPSPosition(String GPSPosition) {
        this.GPSPosition = GPSPosition;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Data getDataOfPurchase() {
        return this.dataOfPurchase;
    }

    public void setDataOfPurchase(Data dataOfPurchase) {
        this.dataOfPurchase = dataOfPurchase;
    }
}
