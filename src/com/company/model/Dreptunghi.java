package com.company.model;

import com.company.Figura;

public class Dreptunghi implements Figura {

    private Punct p1;
    private Punct p2;
    private Punct p3;
    private Punct p4;

    public Dreptunghi(Punct p1, Punct p2,Punct p3,Punct p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
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
        String x="punctele dreptunghiului sunt : " + "P1("+ this.p1.getX()+","+this.p1.getY()+")" +";" +
                "P2("+ this.p2.getX()+","+this.p2.getY()+")" +";" +
                "P3("+ this.p3.getX()+","+this.p3.getY()+")" +";" +
                "P4("+ this.p4.getX()+","+this.p4.getY()+")" +";";

        return x;

    }

    @Override
    public void translateX(int x) {

        this.p1.setX(p1.getX()+x);
        this.p2.setX(p2.getX()+x);
        this.p3.setX(p3.getX()+x);
        this.p4.setX(p4.getX()+x);
    }

    @Override
    public void translateY(int y) {
        this.p1.setY(p1.getY()+y);
        this.p2.setY(p2.getY()+y);
        this.p3.setY(p3.getY()+y);
        this.p4.setY(p4.getY()+y);

    }

    @Override
    public void copy(Figura figura) {
        Dreptunghi dreptunghi=(Dreptunghi) figura;

        this.p1.setX(dreptunghi.p1.getX());
        this.p1.setY(dreptunghi.p1.getY());
        this.p2.setX(dreptunghi.p2.getX());
        this.p2.setY(dreptunghi.p2.getY());
        this.p3.setX(dreptunghi.p3.getX());
        this.p3.setY(dreptunghi.p3.getY());
        this.p4.setX(dreptunghi.p4.getX());
        this.p4.setY(dreptunghi.p4.getY());

    }

    public Punct getP3() {
        return p3;
    }

    public void setP3(Punct p3) {
        this.p3 = p3;
    }

    public Punct getP4() {
        return p4;
    }

    public void setP4(Punct p4) {
        this.p4 = p4;
    }
}
