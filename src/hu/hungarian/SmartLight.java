package hu.hungarian;

import javafx.scene.paint.Color;

public class SmartLight {

    private short lightPercent;
    private Color color;

    public SmartLight(){

        // Sluk for lampen
        lightPercent = 0;

        // Set color to white
        color = Color.WHITESMOKE;
    }

    public void turnUp(){

        if (lightPercent+20 >= 100){
            lightPercent = 100;
        }
        else{
            lightPercent += 20;
        }

    }

    public void turnDown(){
        if(lightPercent-20<=0)
        {
            lightPercent=0;
        }
        else
        {
            lightPercent-=20;
        }
    }

    public String toString(){
        return "";
    }


}
