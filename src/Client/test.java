package Client;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saini
 */
public class test {
   static public boolean n=true;
    public static void main(String args[]){
   new Thread(){
       
       @Override
       public void run() {
            
              
        try{
         ServerSocket ssk = new ServerSocket(1236);
        while(n){
       
        Socket sk = ssk.accept();
        InputStream is= sk.getInputStream();
        byte[] sizeAr = new byte[4];
        
        is.read(sizeAr);
        int size= java.nio.ByteBuffer.wrap(sizeAr).asIntBuffer().get();
        
        
        byte[] sizeAr1= new byte[4];
        
        is.read(sizeAr1);
        int size1=java.nio.ByteBuffer.wrap(sizeAr1).asIntBuffer().get();
        Robot r = new Robot();
        r.mouseMove(size,size1);
        
        
       
        
        
        }
    }
    catch(Exception ex){System.err.println(""+ex);}
       }
   }.start();
    
    
    
    new Thread(){

        @Override
        public void run() {
        try{
         ServerSocket ssk = new ServerSocket(1237);
        while(n){
       
        Socket sk = ssk.accept();
        InputStream is= sk.getInputStream();
           
        byte[] click13 = new byte[4];
        is.read(click13);
        int click12= java.nio.ByteBuffer.wrap(click13).asIntBuffer().get();  
        
        
        
        byte[] click = new byte[4];
        is.read(click);
        int click1= java.nio.ByteBuffer.wrap(click).asIntBuffer().get();
        Robot r1 = new Robot();
            System.out.println(click1);
            
            
            switch(click12){
                case -1:
                     r1.mousePress(click1);
                    break;
                case -2:
                     r1.mouseRelease(click1);
                    break;
            }
            
      
      
       
        }
    }
    catch(Exception ex){System.err.println(""+ex);}
     
        }
    }.start();
    
    
    
    new Thread(){
    
        @Override
        public void run(){
             try{
         ServerSocket ssk = new ServerSocket(1238);
        
       while(n){
        Socket sk = ssk.accept();
        InputStream is= sk.getInputStream();
        byte[] click = new byte[4];
        is.read(click);
        int click1= java.nio.ByteBuffer.wrap(click).asIntBuffer().get();
 byte[] click12 = new byte[4];
        is.read(click12);
        int click121= java.nio.ByteBuffer.wrap(click12).asIntBuffer().get();
        
        
        switch(click1)
        {
            case -1:
        
            new Robot().keyPress(click121);
        break;
            case -2:
               new Robot().keyRelease(click121);  
        
        }
        
        
        
        
        
       }
        
        }
             catch(Exception ex){System.err.println(""+ex);}
             
          }

    }.start();
    
      
}

}