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
        if(lightPercent>=100)
        {
            this.lightPercent=100;
        }
        else {
            this.lightPercent += 20;
        }

    }

    public void turnDown(){
        if(lightPercent-20<=0)
        {
            this.lightPercent=0;
        }
        else
        {
            this.lightPercent-=20;
        }
    }

    public String toString(){
        return "LightPercent: \t" + this.lightPercent + "\nColor: \t\t\t" + this.color;
    }


    public short getLightPercent() {
        return lightPercent;
    }

    public void setLightPercent(short lightPercent) {
        if (lightPercent >= 100){
            this.lightPercent = 100;
        }
        else if (lightPercent <= 0){
            this.lightPercent = 0;
        }
        else{
            this.lightPercent = lightPercent;
        }

    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        if (color == Color.BLACK){
            this.color = Color.DARKGRAY;
        }
        else{
            this.color = color;
        }

    }
}
