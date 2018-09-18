
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emanuelleston
 */
public class ResultThread implements Runnable{

    private ArrayList<Double> res;
    private int nPoints;
    public ResultThread(int numero,ArrayList<Double> res) {
        this.res = res;
        nPoints =numero;
    }
    
    
    
    @Override
    public void run() {
       
        
             double inCircle = sumIncircle()/nPoints;
             
        System.out.println("Points:"+nPoints);
        System.out.println("Points within circle:"+ inCircle);
        System.out.println("Pi estimation:"+ 4*(inCircle/nPoints));
        
      
    }
    public double sumIncircle(){
        
        double resultado = 0;
        for(int i =0; i < res.size();i++)
        {
          resultado += res.get(i);
        }
        return resultado;
    }
    
   
    
}
