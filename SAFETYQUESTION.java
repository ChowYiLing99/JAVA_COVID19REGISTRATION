package COVID19REGISTRATION;
import java.awt.event.*;
import javax.swing.*;

public class SAFETYQUESTION extends JFrame { 
   private final JLabel S, T, V, risk;
   private JRadioButton yesB1, noB1, yesB2, noB2, yesB3, noB3;
   private final JButton nextB;
   
   SAFETYQUESTION () { 
      JPanel panel = new JPanel();
      JFrame myFrame = new JFrame ("Safety Questions");
      myFrame.setSize (800, 300);   
      myFrame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      myFrame.add(panel);
      
      panel.setLayout (null);
       
      S = new JLabel ("1. Do you have any following symptoms? #Fever #Sore throat #Cough #Shortness of breath");
      S.setBounds (10, 20, 790, 25);
      panel.add (S);
      yesB1 = new JRadioButton ("Yes");
      yesB1.setBounds (10, 40, 50, 25);
      panel.add (yesB1);
      noB1 = new JRadioButton ("No");
      noB1.setBounds (60, 40, 50, 25);
      panel.add (noB1);
      
      T = new JLabel ("2. Have you travelled or resided in any country outside Malaysia in the last 14 days?");
      T.setBounds (10, 70, 790, 25);
      panel.add (T);
      yesB2 = new JRadioButton ("Yes");
      yesB2.setBounds (10, 90, 50, 25);
      panel.add (yesB2);
      noB2 = new JRadioButton ("No");
      noB2.setBounds (60, 90, 50, 25);
      panel.add (noB2);
      
      V = new JLabel ("3. Have you attended on event or visited any area which was reported to have suspected or confirmed COVID-19 case in Malaysia?");
      V.setBounds (10, 120, 790, 25);
      panel.add (V);
      yesB3 = new JRadioButton ("Yes");
      yesB3.setBounds (10, 140, 50, 25);
      panel.add (yesB3);
      noB3 = new JRadioButton ("No");
      noB3.setBounds (60, 140, 50, 25);
      panel.add (noB3);
      
      nextB = new JButton ("Next Page");
      nextB.setBounds (10, 170, 100, 25);
      nextB.addActionListener (
         new ActionListener(){
            public void actionPerformed (ActionEvent ae) { 
               String ac = ae.getActionCommand();      
               if (ac.equals("Next Page")){
                  if (yesB1.isSelected() && yesB2.isSelected() && yesB3.isSelected())
                     risk.setText ("The risk of getting COVID-19 is high.");
                  if (yesB1.isSelected() && yesB2.isSelected() && noB3.isSelected())
                     risk.setText ("The risk of getting COVID-19 is high.");
                  if (yesB1.isSelected() && noB2.isSelected() && noB3.isSelected())
                     risk.setText ("The risk of getting COVID-19 is high.");      
                  if (noB1.isSelected() && noB2.isSelected() && noB3.isSelected())
                     risk.setText ("The risk of getting COVID-19 is low.");
                  if (noB1.isSelected() && noB2.isSelected() && yesB3.isSelected())
                     risk.setText ("The risk of getting COVID-19 is high.");
                  if (noB1.isSelected() && yesB2.isSelected() && yesB3.isSelected())
                     risk.setText ("The risk of getting COVID-19 is high.");      
               
                  new QUIZ ();
               }
            }
         });
      panel.add (nextB);
   
      risk = new JLabel("");
      risk.setBounds (10, 200, 300, 25); 
      panel.add (risk);  
      
      myFrame.setVisible (true);
   }   
}

class Question {    
   public static void main (String[] args) throws Exception {
      SAFETYQUESTION question = new SAFETYQUESTION ();
   }
}