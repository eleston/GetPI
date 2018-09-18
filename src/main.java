
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emanuelleston
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     System.out.println("introduza numero de pontos ");
     Scanner pi = new Scanner(System.in);
     int numberPoints = pi.nextInt();
     aproxiPi(numberPoints);
    }
    public static void  aproxiPi(int numberPoints)
    {
        //VARIAVEIS INTERMEDIAS
           
           double inCirclePoints=0;
           double outCirclePoints=0;
           Ponto [] pontos = new Ponto[numberPoints];
           
        //VARIAVEIS INTERMEDIAS
        
        //TODO
        
            // Gerar pontos (criar ponto a medida que se itera)
                for(int i=0; i <numberPoints-1;i++){
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
        System.out.println("Points:"+numberPoints);
        System.out.println("Points within circle:"+ inCirclePoints);
        System.out.println("Pi estimation:"+ 4*(inCirclePoints/numberPoints));
        //OUTPUT
    }
    
}
