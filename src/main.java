
import java.util.ArrayList;

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
    
    
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
           // INPUT   

           System.out.println("introduza numero de pontos ");
           Scanner pi = new Scanner(System.in);
           int numberPoints = pi.nextInt();
           //INPUT
           
           // GERAR THREADS
           System.out.println("Numero de threads que deseja");
           Scanner nthreads= new Scanner(System.in);
           int numeroThreads=  nthreads.nextInt(); //4
           
            ArrayList<Double> pis =new ArrayList<>(numeroThreads);
           int pontosPorThread =Math.round(numberPoints/numeroThreads);//1000/4 == numero de pontos por cada thread
           
           Thread  []setOfThreads = new Thread[numeroThreads];
           for (int i=0 ; i <numeroThreads;i++){
               
                setOfThreads[i]= new Thread(new MyRunners(pontosPorThread,pis),"My Thread nr"+i);//CRIAR THREAD
                setOfThreads[i].start();//INICIAR THREAD
           }
           
           
           Thread resthread = new Thread(new ResultThread(numberPoints, pis));
         
           resthread.start();

           //GERAR THREADS
    }
   
}
