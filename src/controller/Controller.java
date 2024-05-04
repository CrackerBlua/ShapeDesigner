package controller;

import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import model.Model;
import view.View;

public class Controller {
	
	View view;
	Model model;
	
	public Controller() {
		model 	= new Model();
		view 	= new View(model.getShapeDesign());
		
		view.addListenerSlide(new MudaSlide());
		view.addListenerRadio(new mudaRadio());
	}
	

	class MudaSlide implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			model.updateQuantidade(view.getSetarPontos_Slider());
			model.updateEscala(view.getEscalonar_Slider());
			model.updateCisX(view.getCisX_Slider());
			model.updateCisY(view.getCisY_Slider());

			Shape desenho = model.makeTransformacoes(view.getValorSliderTransicion(), view.getRotacionar_Slider());
			view.atualiza(desenho);
		}	
	}
	
	class mudaRadio implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String radioName = ((JRadioButton) e.getSource()).getName();
			
			model.setEliptico(radioName.equalsIgnoreCase("Eliptico"));
			
			Shape desenho = model.makeTransformacoes(view.getValorSliderTransicion(), view.getRotacionar_Slider());
			view.atualiza(desenho);
		}
	}
}
