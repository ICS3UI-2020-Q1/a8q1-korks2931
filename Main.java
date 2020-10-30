import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables 

  JTextField nameInput;

  JButton sayHelloButton;

  JTextArea outputTextArea;
  
  JPanel mainPanel;


  

  


  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);


    // initialize the JTextFields 
     nameInput = new JTextField();
     // set the location and the size of the input fields 
     nameInput.setBounds(200,200,300,30);
     
     //initialize the JButton
     sayHelloButton = new JButton( "Say Hello");

     // set the location and the size of the buttons 
     sayHelloButton.setBounds (330,350,100,35);

     //set the actionCommand 
     sayHelloButton.setActionCommand("Say Hello");
     // add the action listener to the button 
     sayHelloButton.addActionListener(this);

     //initialize the textarea
     outputTextArea = new JTextArea();
     outputTextArea.setBounds(200, 290,90,25);




    // initialize the main Jpanel 
    mainPanel = new JPanel();
    // turn on the manual layouts 
    mainPanel.setLayout(null);
    // add the panel to the frame to see it 

   // add the textfields to the panel
   mainPanel.add(nameInput);
   // add the buttons to the main panel 
   mainPanel.add(sayHelloButton);
   // add the text area to the panel 
   mainPanel.add(outputTextArea);
 
   // add the main panel to the screen
   frame.add(mainPanel);
    

  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();


   if(command.equals("Say Hello")){
     // say hello button was pressed 
     String userName = nameInput.getText();
     // say hello to the username
     outputTextArea.setText("Hello " + userName);
   }
  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
