package view;

import javax.swing.JFrame;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeListener;
import java.awt.Dimension;
import java.awt.Shape;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;
import javax.swing.GroupLayout;

@SuppressWarnings("serial")
public class Janela extends JFrame {
	
	Botoes botoes;
	PainelDesenho painelDesenho;
	
	public Janela(Shape desenho) {
		super("Shape Designer");
		
		botoes 			= new Botoes();
		painelDesenho 	= new PainelDesenho(desenho);
		
		init();
        janelaLayout();

        this.pack();
	}

	public void init() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(1040, 620));
        this.setResizable(false);
        this.add(painelDesenho);
        this.add(botoes);
		this.setVisible(true);
	}
	
	public void addListenerSlide(ChangeListener cl) {
		botoes.addListenerSlide(cl);
	}
	
	public void addListenerRadio(ActionListener al) {
		botoes.addListenerRadio(al);
	}
	
	public void updateDesenho(Shape desenho) {
		painelDesenho.updateDesenho(desenho);
	}
	
	public Point2D.Double getValorSliderTransicion() {
		return new Point2D.Double(botoes.getTransX_Slider(), botoes.getTransY_Slider());
	}
	
	public int getSetarPontos_Slider() {
		return botoes.getSetarPontos_Slider();
	}

	public double getRotacionar_Slider() {
		return botoes.getRotacionar_Slider();
	}
	
	public int getEscalonar_Slider() {
		return botoes.getEscalonar_Slider();
	}
	
	public int getCisX_Slider() {
		return botoes.getCisX_Slider();
	}
	
	public int getCisY_Slider() {
		return botoes.getCisY_Slider();
	}	
	/*Auto-Generated code*/
	
	private void janelaLayout() {
        GroupLayout layout = new GroupLayout(getContentPane());
        
        getContentPane().setLayout(layout);
        
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelDesenho, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botoes, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(botoes, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelDesenho, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
	}
}
