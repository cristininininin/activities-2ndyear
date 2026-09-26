import javax.swing.*;
import java.awt.event.*;

public class JMenu1 {
	public static void main (String[] args){
		JFrame frame = new JFrame("Menu Example");
		frame.setSize(400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar menuBar = new JMenuBar();

		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		JMenu helpMenu = new JMenu("Help");

		JMenuItem newItem = new JMenuItem("New");
		JMenuItem openItem = new JMenuItem("Open");
		JMenuItem exitItem = new JMenuItem("Exit");

		fileMenu.add(newItem);
		fileMenu.add(newItem);
		fileMenu.addSeparator();
		fileMenu.add(exitItem);

		exitItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);

		frame.setJMenuBar(menuBar);
		frame.setVisible(true);
	}
}

