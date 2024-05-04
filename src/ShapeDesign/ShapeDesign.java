package ShapeDesign;

import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

@SuppressWarnings("serial")
public class ShapeDesign extends Path2D.Double {
	
	private int nQtdPontos;
	private int cisX = 0;
	private int cisY = 0;
	private final double ORIGIN_RAIO = 100;
	private double raio;
	private double intervaloMinimo 	= 0;
	private double intervaloMaximo	= 2 * Math.PI;
	private boolean isEliptico = false;
	
	private Point2D.Double centro;
	
	public ShapeDesign(int qtdPontos) {
		super();
		
		this.nQtdPontos = qtdPontos;
		this.centro 	= new Point2D.Double(350, 300);
		this.raio 		= 100;
		
		updateCirculo();
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = this.ORIGIN_RAIO + raio;
		updateCirculo();
	}

	public Point2D.Double getCentro() {
		return centro;
	}

	public void setCentro(Point2D.Double centro) {
		this.centro = centro;
		updateCirculo();
	}

	public int getnQtdPontos() {
		return nQtdPontos;
	}

	public void setnQtdPontos(int nQtdPontos) {
		this.nQtdPontos = (nQtdPontos < 3)? 3: nQtdPontos;
		updateCirculo();
	}
	
	public double getIntervaloMinimo() {
		return intervaloMinimo;
	}

	public void setIntervaloMinimo(double intervaloMinimo) {
		this.intervaloMinimo = intervaloMinimo;
	}
	
	public double getintervaloMaximo() {
		return intervaloMaximo;
	}

	public void setintervaloMaximo(double intervaloMaximo) {
		this.intervaloMaximo = intervaloMaximo;
	}
	
	public int getCisX() {
		return cisX;
	}

	public void setCisX(int cisX) {
		this.cisX = cisX;
		updateCirculo();
	}
	
	public int getCisY() {
		return cisX;
	}

	public void setCisY(int cisY) {
		this.cisY = cisY;
		updateCirculo();
	}
	
	public void setIsEliptico(boolean isEliptico) {
		this.isEliptico = isEliptico;
		updateCirculo();
	}
	
	private void updateCirculo() {
		reset();
		
		// Dividiremos o intevaloMáximo (2pi ou 360°) pela quantidade de pontos, para que o poligono vá auto ajustando
		// nos angulos dentro de um circulo os pontos
		double incremento 			= intervaloMaximo / this.nQtdPontos;
		
		// Cria um ponto inicial para o meu poligono, um estado de pontos iniciais iniciais
		Point2D.Double pontoInicial = calculaPonto(intervaloMinimo);
		Point2D.Double proximoPonto = null;
		
		moveTo(pontoInicial.x, pontoInicial.y);
		
		//Iterar pela quantidade de pontos dentro de um circulo e criar seu ponto, gerando um novo desenho do poligono
		for(int i = 1; i < this.nQtdPontos; i++) {
			
			proximoPonto = applyCisalhamento(calculaPonto(i * incremento));
			
			lineTo(proximoPonto.x, proximoPonto.y);
		}
		
		closePath();
	}
	
	private Point2D.Double applyCisalhamento(Point2D.Double coordenada) {
		return new Point2D.Double(
				coordenada.x + ((coordenada.x / 5) * (this.cisX / 10)),
				coordenada.y + ((coordenada.y / 5) * (this.cisY / 10))
		);
	}
	
	private double transformElipse(double gon) {
		return this.isEliptico && this.nQtdPontos > 4? centro.y + raio * (Math.sin(gon) / 1.1) : centro.y + raio * Math.sin(gon);
	}
	
	//Pega os pontos x e y do centro e soma com o raio multplicado pelo seno e cosseno de um angulo
	private Point2D.Double calculaPonto(double gon){
		double x = centro.x + raio * Math.cos(gon);
		double y = transformElipse(gon);
		
		return new Point2D.Double(x, y);
	}
	
	public Point2D.Double getPontoCentral() {
		Rectangle2D.Double retangulo 	= (Rectangle2D.Double) getBounds2D();
		Point2D.Double canto 			= new Point2D.Double(retangulo.x, retangulo.y);
				
		return new Point2D.Double(
			canto.x + retangulo.width/2, 
			canto.y + retangulo.height/2 
		);
	}
}
