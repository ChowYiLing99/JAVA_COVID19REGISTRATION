package COVID19REGISTRATION;
import java.awt.event.*;
import javax.swing.*;

public class BASICINFORMATION extends JFrame { 
   private final JTextField N, I, M, T;
   private final JLabel Name, IC, MN, Temp;
   private final JButton nextB;
   
   BASICINFORMATION () {
      JPanel panel= new JPanel();
      JFrame myFrame = new JFrame ("Basic Information");             
      myFrame.setSize (500, 300);      
      myFrame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      myFrame.add (panel);
      
      panel.setLayout (null);       
      
      Name = new JLabel ("Name: ");
      Name.setBounds (10, 20, 80, 25);
      panel.add (Name);
      N = new JTextField (20);
      N.setBounds (200, 20, 165, 25);
      panel.add (N);
      
      IC = new JLabel ("IC: ");
      IC.setBounds (10, 50, 80, 25);
      panel.add (IC);
      I = new JTextField (20);
      I.setBounds (200, 50, 165, 25);
      panel.add (I);
      
      MN = new JLabel ("Mobile Number: ");
      MN.setBounds (10, 80, 100, 25);
      panel.add (MN);
      M = new JTextField (20);
      M.setBounds (200, 80, 165, 25);
      panel.add (M);
      
      Temp = new JLabel ("Body Temperature (C): ");
      Temp.setBounds (10, 110, 150, 25);
      panel.add (Temp);
      T = new JTextField (20);
      T.setBounds (200, 110, 165, 25);
      panel.add (T);
                     
      nextB = new JButton ("Next Page");
      nextB.setBounds (10, 150, 150, 25);
      nextB.addActionListener (
         new ActionListener(){
            public void actionPerformed (ActionEvent ae) {  
               new SAFETYQUESTION ();
            }
         }); 
      panel.add (nextB);
   
      myFrame.setVisible (true);
   
   }    
}

class Information {    
   public static void main (String[] args) throws Exception {
      BASICINFORMATION information = new BASICINFORMATION ();
   }
}    
