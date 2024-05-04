package model;

import java.awt.Shape;
import java.awt.geom.Point2D;
import java.awt.geom.AffineTransform;

import ShapeDesign.ShapeDesign;

public class Model {
	
	ShapeDesign desenho = new ShapeDesign(3);

	public Model() { }
	
	public void updateQuantidade(int quantidadePontos) {
		desenho.setnQtdPontos(quantidadePontos);
	}
	
	public void updateEscala(int raio) {
		desenho.setRaio(raio);
	}
	
	public void updateCisX(int cisX) {
		desenho.setCisX(cisX);
	}
	
	public void updateCisY(int cisY) {
		desenho.setCisY(cisY);
	}
	
	public void setEliptico(boolean eliptico) {
		desenho.setIsEliptico(eliptico);
	}
	
	public Shape makeTransformacoes(Point2D.Double t, double a) {
		
		Point2D.Double pontoCentral 	= desenho.getPontoCentral();
		AffineTransform transformacao 	= new AffineTransform();
		
		// Transformação de rotação
		transformacao.preConcatenate(AffineTransform.getTranslateInstance(-pontoCentral.x, -pontoCentral.y));
		transformacao.preConcatenate(AffineTransform.getRotateInstance(a));
		transformacao.preConcatenate(AffineTransform.getTranslateInstance(pontoCentral.x, pontoCentral.y));
		
		// Transformação de Translação
		transformacao.preConcatenate(AffineTransform.getTranslateInstance(t.x, t.y));
				
		return transformacao.createTransformedShape(desenho);
	}
	
	public ShapeDesign getShapeDesign() {
		return desenho;
	}
}
