package com.company;

import java.util.ArrayList;

public class Desen {


    private ArrayList<Figura> figuri;


    public Desen(ArrayList<Figura> figuri) {
        this.figuri = figuri;
    }

    public void deseneaza(){
         for(Figura figura:figuri){
             System.out.println(figura.draw());
         }
    }

    public void translatareX(int x){
        for(Figura figura: figuri){
            figura.translateX(x);
        }
    }

    public void translatareY(int y){
        for(Figura figura:figuri){
            figura.translateY(y);
        }
    }

    public void copiere(Figura fig){
        for(Figura figura:figuri){
            figura.copy(fig);
        }
    }

}
