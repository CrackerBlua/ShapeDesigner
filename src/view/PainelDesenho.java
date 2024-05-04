package view;

import javax.swing.JPanel;
import javax.swing.GroupLayout;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;

@SuppressWarnings("serial")
public class PainelDesenho extends JPanel {
	
	Shape desenho;
	
	public PainelDesenho(Shape desenho) {
        painelDesenhoLayout();
		
		this.desenho = desenho;
	}
	
	public void updateDesenho(Shape desenho) {
		this.desenho = desenho;
		this.repaint();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setStroke(new BasicStroke(15));
		g2d.fill(desenho);
	}
	
	/*Auto-generated code*/
	
	public void painelDesenhoLayout() {	
		this.setBackground(new Color(255, 255, 255));
        this.setPreferredSize(new Dimension(760, 615));
        
		GroupLayout ShapePanelLayout = new GroupLayout(this);
        
		this.setLayout(ShapePanelLayout);
        
		ShapePanelLayout.setHorizontalGroup(
            ShapePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 760, Short.MAX_VALUE)
        );
		
        ShapePanelLayout.setVerticalGroup(
            ShapePanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0, 615, Short.MAX_VALUE)
        );
	}

}
