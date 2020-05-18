package com;

public class Person {
    String id;
    String p_name;
    String p_sex;
    int p_age;

    public Person() {
    }

    public Person(String id, String p_name, String p_sex, int p_age) {
        this.id = id;
        this.p_name = p_name;
        this.p_sex = p_sex;
        this.p_age = p_age;
    }

    public void driveTransport(Airship airship){
        System.out.println(this.getId()+this.getP_name()+"正在驾驶"+airship.getId());
    }

    public void driveTransport(Aircraft aircraft){
        System.out.println(this.getId()+this.getP_name()+"正在驾驶"+aircraft.getId());
    }

    public void driveTransport(Automobile automobile){
        System.out.println(this.getId()+this.getP_name()+"正在驾驶"+automobile.getId());
    }

    public void driveTransport(Bicycle bicycle){
        System.out.println(this.getId()+this.getP_name()+"正在驾驶"+bicycle.getId());
    }

    public void driveTransport(HotAirBalloon hotAirBalloon){
        System.out.println(this.getId()+this.getP_name()+"正在驾驶"+hotAirBalloon.getId());
    }

    public void driveTransport(Hovercraft hovercraft){
        System.out.println(this.getId()+this.getP_name()+"正在驾驶"+hovercraft.getId());
    }

    public void driveTransport(Motorcycle motorcycle){
        System.out.println(this.getId()+this.getP_name()+"正在驾驶"+motorcycle.getId());
    }

    public void driveTransport(Ship ship){
        System.out.println(this.getId()+this.getP_name()+"正在驾驶"+ship.getId());
    }

    public void driveTransport(Submarine submarine){
        System.out.println(this.getId()+this.getP_name()+"正在驾驶"+submarine.getId());
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_sex() {
        return p_sex;
    }

    public void setP_sex(String p_sex) {
        this.p_sex = p_sex;
    }

    public int getP_age() {
        return p_age;
    }

    public void setP_age(int p_age) {
        this.p_age = p_age;
    }

}
