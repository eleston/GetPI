
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emanuelleston
 */
public  class MyRunners implements Runnable {
        Thread thread = Thread.currentThread();
            
        int numero;
        ArrayList<Double> res;
        public MyRunners(int numero, ArrayList<Double> resultado) {
            this.numero = numero;
            this.res = resultado;
        }
        @Override
        public void run (){
            
            
            try{
                double inCircle =getPi();// numero 250
                    res.add(inCircle);
                    System.out.println("Nome da thread+"+thread.getName());
            
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            
            
        } 
        
        private double getPi() throws InterruptedException{
            Thread.sleep(5000);
             double inCircle =  aproxiPi(numero);
            return inCircle;
        }
        
        private double aproxiPi(int num){
            //VARIAVEIS INTERMEDIAS
           
           double inCirclePoints=0;
           double outCirclePoints=0;
           Ponto [] pontos = new Ponto[num];
           
        //VARIAVEIS INTERMEDIAS
        
        //TODO
        
            // Gerar pontos (criar ponto a medida que se itera)
                for(int i=0; i <num-1;i++){
                    double x = Math.random()*1.0;
                    double y = Math.random()*1.0;
                  pontos[i]= new Ponto(x,y);
                  if(pontos[i].inCircle())
                  {
                      inCirclePoints++;
                  }
                  else{
                      outCirclePoints++;
                  }
                }
            // Gerar pontos GERA 1000 pontos (x,y)
        
        
        //TODO
        
        //OUTPUT
        System.out.println("Points:"+num);
        System.out.println("Points within circle:"+ inCirclePoints);
        System.out.println("Pi estimation:"+ 4*(inCirclePoints/num));
           
        //OUTPUT
        
        return inCirclePoints;
        }
    }