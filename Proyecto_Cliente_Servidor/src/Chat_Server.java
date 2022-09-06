


import java.io.*;
import javax.swing.JOptionPane;
import java.net.ServerSocket;
import java.net.Socket;

public class Chat_Server {
 
    
    public void start(){
        ServerSocket server=null;
        try{
            server=new ServerSocket(5469);// 5000-6000 rango netstat -an  en pront usar protocolo tcp/ip
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null,"Conexion Finalizada");
            System.exit(0);
        }
        while(true){
            try{
                Socket s1= server.accept();
                DataOutputStream chat= new DataOutputStream(s1.getOutputStream());
                chat.writeUTF("Connecting....");
                System.out.println("Connected");
                chat.close();
                s1.close();
            }catch(IOException e){
                JOptionPane.showMessageDialog(null,"Error al eviar mensaje");
                System.exit(0);
            }finally{
                System.exit(0);
            }
        }
    }
    
}

    
    
    
    
    
    

