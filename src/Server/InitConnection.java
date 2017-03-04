package Server;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GraphicsDevice;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.*;

public class InitConnection{
static	public boolean st=true;	
	ServerSocket socket = null;
	DataInputStream password = null;
	DataOutputStream verify = null;
	String width="";
	String height="";
			
public	InitConnection(int port,String value1){
		
		Rectangle rectangle = null;
		try{
			System.out.println("Awaiting Connection from Client");
			socket=new ServerSocket(port);
			
			
	
			Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
                        System.out.println("Dimensions are "+dim);
			String width=""+dim.getWidth();
			String height=""+dim.getHeight();
			rectangle=new Rectangle(dim);
			

			

			while(st){
				Socket sc=socket.accept();
				password=new DataInputStream(sc.getInputStream());
				verify=new DataOutputStream(sc.getOutputStream());
			
				String pssword=password.readUTF();
				
				if(pssword.equals(value1)){
					verify.writeUTF("valid");
					
					new SendScreen(sc,rectangle);
					
                                }
				else{
					verify.writeUTF("Invalid");
				}
			}
		}catch (Exception ex){
			ex.printStackTrace();
		}
	}
			
	

}
