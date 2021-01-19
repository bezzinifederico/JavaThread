/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author bezzini.federiconico
 */
public class New implements Runnable {
  boolean termine=false;
  String a;
  int r=0;
  int g=100;
  
      public New(int r){
          this.r=r;
      }
  
 @Override
    public void run() {
       while (termine){
          if(a=="a"){
              System.out.println(r);
              r++;
              
          }else{
              for(int g=100;g>50;g++){
               System.out.println("        "+g);
          g--;
              }  
          }
       } 
           
    }   
    
 
    public boolean Ferma(){
           termine=true;
           return termine;
    
    }
}
