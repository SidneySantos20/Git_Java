import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Aula01 extends JPanel{
	JLabel lb1, lb2, lb3, lb4, lb5, lb6;
	JButton bt1, bt2, bt3;
	ImageIcon img1, img2, img3;

public Aula01() {
	InicializarComponentes();
	DefinirEventos();
}

public void InicializarComponentes() {
	
	setLayout(null);
	setBackground(Color.black);
	
	lb1 = new JLabel("Sol");
	lb1.setForeground(Color.yellow);
	img1 = new ImageIcon("C:\\\\Users\\\\sidne\\\\Downloads\\\\sun.png");
	lb2 = new JLabel(img1);
	bt1 = new JButton("Sol");
	bt1.setBackground(Color.yellow);
	bt1.setForeground(Color.black);
	
	lb3 = new JLabel("Bola de Tênis");
	lb3.setForeground(Color.green);
	img2 = new ImageIcon("C:\\\\Users\\\\sidne\\\\Downloads\\\\bola.png");
	lb4= new JLabel(img2);
	bt2 = new JButton("Bola de Tênis");
	bt2.setBackground(Color.green);
	bt2.setForeground(Color.black);
	
	lb5 = new JLabel("Computador");
	lb5.setForeground(Color.gray);
	img3 = new ImageIcon("C:\\Users\\sidne\\Downloads\\computador.png");
	lb6 = new JLabel(img3);
	bt3 = new JButton("Computador");
	bt3.setBackground(Color.gray);
	bt3.setForeground(Color.black);
	
	lb1.setBounds(140, 200, 150, 50);
	lb2.setBounds(50, 0, 200, 250);
	bt1.setBounds(75, 250, 150, 25);
	
	lb3.setBounds(325, 200, 150, 50);
	lb4.setBounds(265, 0, 200, 250);
	bt2.setBounds(290, 250, 150, 25);
	
	lb5.setBounds(540, 200, 150, 50);
	lb6.setBounds(470, 0, 200, 250);
	bt3.setBounds(500, 250, 150, 25);
	
	add(lb1);
	add(lb2);
	add(lb3);
	add(lb4);
	add(lb5);
	add(lb6);
	add(bt1);
	add(bt2);
	add(bt3);
	

}

public void DefinirEventos(){
	bt1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){	
			JOptionPane.showMessageDialog(null, "Você escolheu o Sol!");	
			}	
	});
	
	bt2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){	
			JOptionPane.showMessageDialog(null, "Você escolheu a Bola de tênis!");
			}	
	});
	bt3.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0){	
			JOptionPane.showMessageDialog(null, "Você escolheu o Computador!");
			}	
	});
	
}

	
public static void main(String args[]) {
	JFrame frame = new JFrame("Janela com imagem");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().add(new Aula01());
	frame.setBounds(400, 250, 700, 400);
	frame.setVisible(true);
	
	frame.setResizable(false);
}
}