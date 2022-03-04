package edu.school.views;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.lang.module.ModuleDescriptor.Opens;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComponent;

public class ColoredTriangle extends JComponent{
    private double[]points = new double[1024];
   
    private int index = 0;
    public static void main(String args[])
    {
    
    JFrame window = new JFrame("ColoredTriangle");
    window.setBounds(300,300,500,500);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
    window.setLayout(null);
    
     JButton red = new JButton("");
     red.setBackground(Color.RED);
     red.setBounds(250,20,30,30);
     window.add(red);

     JButton black = new JButton("");
     black.setBackground(Color.BLACK);
     black.setBounds(250,60,30,30);
     window.add(black);

     JButton blue = new JButton("");
     blue.setBackground(Color.BLUE);
     blue.setBounds(250,100,30,30);
     window.add(blue);

     JButton green = new JButton("");
     green.setBackground(Color.GREEN);
     green.setBounds(250,140,30,30);
     window.add(green);

     JButton white = new JButton("");
     white.setBackground(Color.WHITE);
     white.setBounds(250,180,30,30);
     window.add(white);

     PointsPanel p = new PointsPanel();
	 p.setBounds(10, 10, 210, 200);
	 window.add(p);

     
     
     window.repaint();

    }
   
    
    
    public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(getBackground());
		g2d.fillRect(getBounds().x, getBounds().y, getBounds().width,
				getBounds().height);
		if(index > 0)
		{
			for(int i = 0; i<index; i+=2)
			{
                red.addActionListener(e->{

                });
				g2d.setColor(Color.RED);
				Ellipse2D ellipse = new Ellipse2D.Double(points[i]-1, points[i+1]-5, 5, 5);
				g2d.draw(ellipse);
				g2d.fill(ellipse);
			}
		}
		
    }

        
    }


			
		
    

