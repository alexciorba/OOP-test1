package com.company.model;

import com.company.Desen;
import com.company.Figura;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LinieTest {

    @Test

    public void test1(){
        Punct punct1=new Punct(1,2);
        Punct punct2=new Punct(2,3);
        Linie linie=new Linie(punct1,punct2);
        String text="punctele sunt : " + punct1 + "," + punct2;
        assertEquals(text,linie.draw());
    }

    @Test
    public void testTranslateX(){
        Punct punct1=new Punct(1,2);
        Punct punct2=new Punct(2,3);
        Linie linie=new Linie(punct1,punct2);
        linie.translateX(2);
        Punct punctNou1=new Punct(3,2);
        Punct punctNou2=new Punct(5,3);


        assertEquals(punctNou1.getX(),3);
        assertEquals(punctNou2.getX(),5);
    }


    @Test

    public void testTranslateY(){
        Punct punct1=new Punct(1,2);
        Punct punct2=new Punct(2,3);
        Linie linie=new Linie(punct1,punct2);
        linie.translateY(2);
        Punct punctNou1=new Punct(1,4);
        Punct punctNou2=new Punct(2,5);


        assertEquals(punctNou1.getY(),4);
        assertEquals(punctNou2.getY(),5);
    }


    @Test

    public void testCopy(){
        Punct punct1=new Punct(1,2);
        Punct punct2=new Punct(2,3);
        Linie linie=new Linie(punct1,punct2);
    }



    @Test

    public void testDesen(){
        Punct e1=new Punct(4,9);
        Punct e2=new Punct(7,9);
        Punct e3=new Punct(4,8);
        Punct e4=new Punct(7,8);
        Eticheta eticheta=new Eticheta(e1,e2,e3,e4,"eu sunt eticheta");

        Punct d1=new Punct(3,6);
        Punct d2=new Punct(8,6);
        Punct d3=new Punct(3,3);
        Punct d4=new Punct(8,3);
        Dreptunghi dreptunghi=new Dreptunghi(d1,d2,d3,d4);

        Punct c=new Punct(12,4);
        Cerc cerc=new Cerc(c,3);

        ArrayList<Figura>listaFiguri=new ArrayList<>();
        listaFiguri.add(eticheta);
        listaFiguri.add(dreptunghi);
        listaFiguri.add(cerc);
        Desen desen=new Desen(listaFiguri);
//        String x="punctele etichetei sunt : " + e1 + "," + e2+","+ e3 + ","+ e4  + " si textul este : " + "eu sunt eticheta";
//
//        x+="punctele dreptunghiului sunt : " + d1 + "," + d2 + "," + d3 + "," + d4;
//        x+="punctul cercului este : " + c + " iar raza este : " + 3;
        desen.deseneaza();

    }


}