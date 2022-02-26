package com.company.model;

import com.company.Figura;


public class Linie implements Figura {

    private Punct p1;
    private Punct p2;

    public Linie(Punct p1, Punct p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Punct getP1() {
        return p1;
    }

    public void setP1(Punct p1) {
        this.p1 = p1;
    }

    public Punct getP2() {
        return p2;
    }

    public void setP2(Punct p2) {
        this.p2 = p2;
    }

    @Override
    public String draw() {

        String x="punctele sunt : " + this.p1 + "," + this.p2;
        return x;




    }

    @Override
    public void translateX(int x) {

        this.p1.setX(p1.getX()+x);
        this.p2.setX(p2.getX()+x);

    }

    @Override
    public void translateY(int y) {
        this.p1.setY(p1.getY()+y);
        this.p2.setY(p2.getY()+y);

    }

    @Override
    public void copy(Figura figura)
    {
        Linie linie=(Linie)figura;

        this.p1.setX(linie.p1.getX());
        this.p1.setY(linie.p1.getY());
        this.p2.setX(linie.p2.getX());
        this.p2.setY(linie.p2.getY());



    }
}
