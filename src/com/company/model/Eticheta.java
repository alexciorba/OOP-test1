package com.company.model;

import com.company.Figura;

public class Eticheta extends Dreptunghi{
    private String text;

    public Eticheta(Punct p1,Punct p2,Punct p3,Punct p4,String text){
        super(p1,p2,p3,p4);
        this.text=text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override

    public String draw(){
        String x="punctele dreptunghiului sunt : " + "P1("+ this.getP1().getX()+","+this.getP1().getY()+")" +";" +
                "P2("+ this.getP2().getX()+","+this.getP2().getY()+")" +";" +
                "P3("+ this.getP3().getX()+","+this.getP3().getY()+")" +";" +
                "P4("+ this.getP4().getX()+","+this.getP4().getY()+")" +";" + " si textul este : " + text;
        return x;
    }

    @Override

    public void copy(Figura figura){
        Eticheta eticheta=(Eticheta) figura;
        this.text=text;
        super.copy(figura);


    }



}
