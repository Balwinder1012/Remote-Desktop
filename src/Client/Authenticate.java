package Client;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import java.io.DataInputStream;

import java.io.DataOutputStream;

import java.io.IOException;

import java.net.Socket;

public class Authenticate {
			private Socket cSocket = null;
			DataOutputStream psswrchk = null;
			DataInputStream verification = null;
			String verify ="";
			
			JPanel panel;
			
			String width="",height="";
			

public  Authenticate(Socket cSocket,String password,JPanel p){
				
				
				this.cSocket = cSocket;
		
				String value1=password;
				
				try{
				psswrchk= new DataOutputStream(cSocket.getOutputStream());
				verification= new DataInputStream(cSocket.getInputStream());
				psswrchk.writeUTF(value1);
				verify=verification.readUTF();
	
				}catch (IOException e){
				e.printStackTrace();
				}

				if(verify.equals("valid")){
				
				CreateFrame abc= new CreateFrame(cSocket,p);
				
				}
				else {
				System.out.println("enter the valid password");
				JOptionPane.showMessageDialog(null, "Incorrect  password", "Error", JOptionPane.ERROR_MESSAGE);
				
				}

				}
			
	}

