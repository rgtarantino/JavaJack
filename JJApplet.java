import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JJApplet extends JApplet{

  // >>>>>>> The model <<<<<<<<

  // Declare and intantiate the thermometer    
  private newJavaJack game = new newJavaJack();

  // >>>>>>> The view <<<<<<<<

  // Declare and instantiate the window objects.
  private JLabel betLabel        = new JLabel("Enter your bet:");
  private JLabel resultLabel    = new JLabel("Result of the game:");        
  private JTextField betField    = new JTextField("0");  
  private JTextField resultField = new JTextField("0");
  private JButton playButton      = new JButton("Play a Hand");


  // Constructor
  public void init(){
      // Set up panels to organize widgets and
      // add them to the window
      JPanel dataPanel = new JPanel(new GridLayout(2, 2, 12, 6));
      dataPanel.add(betLabel);
      dataPanel.add(resultLabel);
      dataPanel.add(betField);
      dataPanel.add(resultField);
      JPanel buttonPanel = new JPanel();
      buttonPanel.add(playButton);
      Container container = getContentPane();
      container.add(dataPanel, BorderLayout.CENTER);
      container.add(buttonPanel, BorderLayout.SOUTH);
      // Attach a listener to the convert button
      playButton.addActionListener(new JJApplet.gameListener()); 
      
  }
  
  // >>>>>>> The controller <<<<<<<<

  private class gameListener implements ActionListener{
      public void actionPerformed(ActionEvent e){
        try{
            String input = betField.getText();      // Obtain input
            double bet = Double.parseDouble(input);  // Convert to double
            game.setBet(bet);
            game.setAccount(100);
            double account = game.getWin();
            
            String output = String.format("%.2f", account); // Format to 2 places
            resultField.setText(output);            // Output result
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, 
                                          "Bad number format",
                                          "Temperature Converter",
                                          JOptionPane.ERROR_MESSAGE);
        }
      }
  }



}
