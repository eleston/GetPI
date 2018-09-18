/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emanuelleston
 */
public class Ponto {
    public double x;
    public double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public boolean inCircle(){
        // x^2  + y^2 ==1
        return (this.x*this.x) +(this.y*this.y) <=1;
    }
    
}
