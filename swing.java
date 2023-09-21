import javax.swing.*;
public class swing {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
      JFrame frame = new JFrame("swing");
      
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(300,200);
	
      JLabel nameLabel = new JLabel("Enter your name");
      JTextField nameField = new JTextField(20);
      JButton submitButton = new JButton("Submit");
      
      submitButton.addActionListener(e->{
    	  String name = nameField.getText();
    	  // Process the user input here
    	  JOptionPane.showMessageDialog(frame,"Hello "+name+"!");
        });
    	
        JPanel panel = new JPanel();
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(submitButton);
        
        frame.add(panel);
        frame.setVisible(true);
   }
}

