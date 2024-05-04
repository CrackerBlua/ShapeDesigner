package view;

import java.awt.Shape;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;

import javax.swing.event.ChangeListener;

public class View {
	
	Janela janela;
	
	public View(Shape desenho) {
		janela = new Janela(desenho);
	}
	
	public void atualiza(Shape desenho) {
		janela.updateDesenho(desenho);
	}
	
	public void addListenerSlide(ChangeListener cl) {
		janela.addListenerSlide(cl);
	}
	
	public void addListenerRadio(ActionListener al) {
		janela.addListenerRadio(al);
	}
	
	public Point2D.Double getValorSliderTransicion() {
		return janela.getValorSliderTransicion();
	}

	public int getSetarPontos_Slider() {
		return janela.getSetarPontos_Slider();
	}

	public double getRotacionar_Slider() {
		return janela.getRotacionar_Slider();
	}
	
	public int getEscalonar_Slider() {
		return janela.getEscalonar_Slider();
	}

	public int getCisX_Slider() {
		return janela.getCisX_Slider();
	}	
	
	public int getCisY_Slider() {
		return janela.getCisY_Slider();
	}	
}
