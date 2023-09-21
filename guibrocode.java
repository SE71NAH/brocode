import javax.swing.JOptionPane;
public class guibrocode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String name = JOptionPane.showInputDialog("What is your name");
        JOptionPane.showMessageDialog(null, "your name is "+name);
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        JOptionPane.showMessageDialog(null, "You are "+age+" years old");
        		
        double height = Double.parseDouble(JOptionPane.showInputDialog("whats ur height"));
        JOptionPane.showMessageDialog(null, "you are "+height+" tall");
	}

}
