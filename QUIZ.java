package COVID19REGISTRATION;
import java.awt.event.*;
import javax.swing.*;

public class QUIZ extends JFrame {
   private final JCheckBox q1a1, q1a2, q1a3, q1a4, q2a1, q2a2, q2a3, q2a4, q3a1, q3a2, q3a3, q3a4, q3a5;
   private final JLabel s, q1, q2, q3, q4, L1;
   private final JRadioButton q4a1, q4a2;
   private ButtonGroup g1, g2, g3, g4;
   private final JButton fB;

   QUIZ () {
      JPanel p = new JPanel ();
      JFrame myFrame = new JFrame ("Simple Quiz");  
      myFrame.setSize (800, 500);
      myFrame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      myFrame.add (p); 
   
      p.setLayout (null);
    
      q1 = new JLabel ("1. What is the symptoms of COVID-19?");
      q1.setBounds (10, 20, 300, 25);
      p.add (q1);
      g1 = new ButtonGroup ();
      q1a1 = new JCheckBox ("Fever");
      q1a1.setBounds (10, 40, 70, 25);
      p.add (q1a1);
      q1a2 = new JCheckBox ("Chills");
      q1a2.setBounds (100, 40, 70, 25);
      p.add (q1a2);
      q1a3 = new JCheckBox ("Cough");
      q1a3.setBounds (190, 40, 70, 25);
      p.add (q1a3);
      q1a4 = new JCheckBox ("Shortness of breath");
      q1a4.setBounds (280, 40, 200, 25);
      p.add (q1a4);
   
      q2 = new JLabel ("2. How COVID-19 spread?");
      q2.setBounds (10, 70, 220, 25);
      p.add (q2);
      g2 = new ButtonGroup ();
      q2a1 = new JCheckBox ("Touching contamnated objects");
      q2a1.setBounds (10, 90, 250, 25);
      p.add (q2a1);
      q2a2 = new JCheckBox ("Staying at home too much");
      q2a2.setBounds (10, 110, 250, 25);
      p.add (q2a2);
      q2a3 = new JCheckBox ("Coughing and sneezing");
      q2a3.setBounds (10, 130,250, 25);
      p.add (q2a3);
      q2a4 = new JCheckBox ("Certain types of food");
      q2a4.setBounds (10, 150, 250, 25);
      p.add (q2a4);
   
      q3 = new JLabel ("3. When you wash your hand, you should?");
      q3.setBounds (10, 180, 300, 25);
      p.add (q3);
      g3 = new ButtonGroup ();
      q3a1 = new JCheckBox ("Scrub the back and front of your hand");
      q3a1.setBounds (10, 200, 250, 25);
      p.add (q3a1);
      q3a2 = new JCheckBox ("Use soap and water");
      q3a2.setBounds (10, 220, 250, 25);
      p.add (q3a2);
      q3a3 = new JCheckBox ("Spend 20 seconds doing it");
      q3a3.setBounds (10, 240, 250, 25);
      p.add (q3a3);
      q3a4 = new JCheckBox ("Scrub between your fingers");
      q3a4.setBounds (10, 260, 250, 25);
      p.add (q3a4);
      q3a5 = new JCheckBox ("Clean under your fingernails");
      q3a5.setBounds (10, 280, 250, 25);
      p.add (q3a5);
   
      q4 = new JLabel ("4. If you don't have any syntoms, you definately are not contagious.");
      q4.setBounds (10, 310, 400, 25);
      p.add (q4);
      g4 = new ButtonGroup ();
      q4a1 = new JRadioButton ("TRUE");
      q4a1.setBounds (10, 330, 70, 25);
      p.add (q4a1);
      q4a2 = new JRadioButton ("FALSE");
      q4a2.setBounds (100, 330, 70, 25);
      p.add (q4a2);    
   
      fB = new JButton ("Finish"); 
      fB.setBounds (10, 380, 100, 25);
      fB.addActionListener (
         new ActionListener(){
            public void actionPerformed (ActionEvent ae) {
               if(ae.getActionCommand().equals("Finish")) {
                  int score = 0;
                  if (q1a1.isSelected() && q1a2.isSelected() && q1a3.isSelected() && q1a4.isSelected()){
                     score++;
                  }
                  if (q2a1.isSelected() && q2a3.isSelected()){
                     score++;
                  }
                  if (q3a1.isSelected() && q3a2.isSelected() && q3a3.isSelected() && q3a4.isSelected() && q3a5.isSelected()){
                     score++;
                  }
                  if (q4a2.isSelected()){
                     score++;
                  }
                     
                  JOptionPane.showMessageDialog (new QUIZ(), "You scored : " + score + " out of 4.");
               
                  g1.clearSelection ();
                  g2.clearSelection ();
                  g3.clearSelection ();
                  g4.clearSelection ();
               }
            }
         });
      p.add (fB);
              
      myFrame.setVisible(true);
   
   }   
}

class Safetyquiz {    
   public static void main (String[] args) throws Exception {
      QUIZ q = new QUIZ ();
   }
}