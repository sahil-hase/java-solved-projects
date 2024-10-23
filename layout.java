package slip18;
import javax.swing.*;
import java.awt.*;
public class layout {
   public static void main(String[] args) {
	        
	        JFrame frame = new JFrame("Border Layout");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel panel = new JPanel(new BorderLayout());
            panel.add(new JButton("North"), BorderLayout.NORTH);
	        panel.add(new JButton("South"), BorderLayout.SOUTH);
	        panel.add(new JButton("East"), BorderLayout.EAST);
	        panel.add(new JButton("West"), BorderLayout.WEST);
	        panel.add(new JButton("Center"), BorderLayout.CENTER);
	        frame.getContentPane().add(panel);
            frame.setSize(400, 300);
	        frame.setVisible(true);

	}

}


