package com.company.model;

import com.company.Figura;

public class Cerc implements Figura {


    private Punct p1;
    private int raza;

    public Cerc(Punct p1, int raza) {
        this.p1 = p1;
        this.raza = raza;
    }




    @Override
    public String draw() {
       String x="punctul cercului este : " + "P(" + p1.getX() + "," + p1.getY() +")" + " iar raza este : " + raza;
       return x;
    }

    @Override
    public void translateX(int x) {
        this.p1.setX(p1.getX()+x);


    }

    @Override
    public void translateY(int y) {
        this.p1.setY(p1.getY()+y);

    }

    @Override
    public void copy(Figura figura) {

        Cerc cerc=(Cerc) figura;

        this.p1.setX(cerc.p1.getX());
        this.p1.setY(cerc.p1.getY());
        this.raza=cerc.raza;

    }

    public Punct getP1() {
        return p1;
    }

    public void setP1(Punct p1) {
        this.p1 = p1;
    }

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }
}
