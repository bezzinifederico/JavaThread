/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecno;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

     
    
/**
 *
 * @author bezzini.federiconico
 */
public class Server {
   private int porta;
    private ServerSocket SS;
  
    public Server(int porta){
        this.porta=porta;
         if(!startServer())
            System.out.println("errore creazione");
    }
    private boolean startServer(){
       try {
           SS= new ServerSocket(porta);
           
       }catch (IOException ex) {
           Logger.getLogger(Server.class.getName()).log(Level.SEVERE,null, ex);
           return false;
       }
       System.out.println("Server creato");
       
        return true;
    }
    public void runServer() throws IOException{
     
            while (true){
            System.out.println("Server in attesa di richieste... ");
        Socket client=SS.accept();
        System.out.println("client connesso ");
        
        OutputStream versoIlClient=client.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(versoIlClient));
            System.out.println("=============================");
            bw.write(" ===========Server========== ");
            System.out.println("=============================");
            bw.close();
            client.close();
            
            System.out.println("Connessione effettuata");
            System.out.println("Inserire il numero di Thread richiesti, quanti quanti quelli dichiarati ");   
            
            
            }catch (IOException ex) {
           Logger.getLogger(Server.class.getName()).log(Level.SEVERE,null, ex);
                    }   
        Server server= new Server(666);
        server.startServer();
    }
    
}
