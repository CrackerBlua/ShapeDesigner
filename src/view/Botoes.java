package view;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JLabel;


@SuppressWarnings("serial")
public class Botoes extends JPanel{
	
	double rFator = 100;
	
    JLabel cisX_Slider_label				= new JLabel();
    JLabel cisY_Slider_label				= new JLabel();
    JLabel escalonar_label					= new JLabel();
    JLabel forma_title						= new JLabel();
    JLabel formatoTitle						= new JLabel();
    JLabel rotacionar_label					= new JLabel();
    JLabel setarPontos_Slider_label			= new JLabel();
    JLabel transX_Slider_label				= new JLabel();
    JLabel transY_Slider_label				= new JLabel();
    JLabel transicoes_label					= new JLabel();
    JSlider cisX_Slider						= new JSlider(0, 100, 0);
    JSlider cisY_Slider						= new JSlider(0, 100, 0);
    JSlider escalonar_Slider				= new JSlider(0, 100, 50);
    JSlider rotacionar_Slider				= new JSlider(0, (int)(2 * Math.PI * rFator), 314);
    JSlider setarPontos_Slider				= new JSlider();
    JSlider transX_Slider					= new JSlider();
    JSlider transY_Slider					= new JSlider();
    JSeparator separator_formato_transicao	= new JSeparator();
    JSeparator separator_transicao_forma 	= new JSeparator();
    ButtonGroup radio_group					= new ButtonGroup();
    JRadioButton radio_circular				= new JRadioButton();
    JRadioButton radio_eliptico				= new JRadioButton();
	
	public Botoes() {
		setarComponentsInfos();
        addAll();
        botoesLayout();
	}
	
	public int getTransX_Slider() {
		return (int)((transX_Slider.getValue() - 50) * 5);
	}	
	
	public int getTransY_Slider() {
		return (int)((transY_Slider.getValue() - 50) * 5);
	}
	
	public int getCisX_Slider() {
		return cisX_Slider.getValue();
	}	
	
	public int getCisY_Slider() {
		return cisY_Slider.getValue();
	}	
	
	public int getEscalonar_Slider() {
		return (escalonar_Slider.getValue() - 50);
	}
	
	public double getRotacionar_Slider() {
		return ((double)(rotacionar_Slider.getValue() - 314)) / (double) this.rFator;
	}
	
	public int getSetarPontos_Slider() {
		return setarPontos_Slider.getValue();
	}
	
	
	public void addListenerSlide(ChangeListener cl) {
		transX_Slider.addChangeListener(cl);
		transY_Slider.addChangeListener(cl);
		cisX_Slider.addChangeListener(cl);
		cisY_Slider.addChangeListener(cl);
		rotacionar_Slider.addChangeListener(cl);
		setarPontos_Slider.addChangeListener(cl);
		escalonar_Slider.addChangeListener(cl);
	}	
	
	public void addListenerRadio(ActionListener al) {
		radio_circular.addActionListener(al);
		radio_eliptico.addActionListener(al);
	}
	
	/*Auto-Generated layout*/
	
	private void addAll() {
		this.add(cisX_Slider_label);
		this.add(cisY_Slider_label);
		this.add(escalonar_label);
		this.add(forma_title);
		this.add(formatoTitle);
		this.add(rotacionar_label);
		this.add(setarPontos_Slider_label);
		this.add(transX_Slider_label);
		this.add(transY_Slider_label);
		this.add(transicoes_label);
		this.add(cisX_Slider);
		this.add(cisY_Slider);
		this.add(escalonar_Slider);
		this.add(rotacionar_Slider);
		this.add(setarPontos_Slider);
		this.add(transX_Slider);
		this.add(transY_Slider);
		this.add(separator_formato_transicao);
		this.add(separator_transicao_forma);
		this.add(radio_circular);
		this.add(radio_eliptico);
	}
	
	private void setarComponentsInfos() {
		formatoTitle.setFont(new Font("Segoe UI", 1, 12));
        formatoTitle.setHorizontalAlignment(SwingConstants.CENTER);
        formatoTitle.setText("Formato");

        radio_group.add(radio_circular);
        radio_circular.setText("Circular");
        radio_circular.setName("Circular");
        radio_circular.setSelected(true);
        radio_group.add(radio_eliptico);
        radio_eliptico.setText("Eliptico");
        radio_eliptico.setName("Eliptico");


        transicoes_label.setFont(new Font("Segoe UI", 1, 12));
        transicoes_label.setHorizontalAlignment(SwingConstants.CENTER);
        transicoes_label.setText("Alterações de Transições");
        
        transX_Slider_label.setText("Transicionar em X");
        transY_Slider_label.setText("Transicionar em Y");
        cisX_Slider_label.setText("Cisalhamento em X");
        cisY_Slider_label.setText("Cisalhamento em Y");
        escalonar_label.setText("Escalonar figura");

        rotacionar_label.setText("Rotacionar figura");

        forma_title.setFont(new Font("Segoe UI", 1, 12));
        forma_title.setHorizontalAlignment(SwingConstants.CENTER);
        forma_title.setText("Alterações da Forma");

        setarPontos_Slider_label.setText("Adicionar/Remover pontos");
        setarPontos_Slider.setValue(0);
	}
	
	private void botoesLayout() {
		GroupLayout MenuPanelLayout = new GroupLayout(this);
		
        this.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(separator_formato_transicao)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGroup(MenuPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(transX_Slider_label, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(MenuPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(transicoes_label, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(formatoTitle, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(MenuPanelLayout.createSequentialGroup()
                                .addGap(0, 18, Short.MAX_VALUE)
                                .addComponent(radio_circular, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio_eliptico, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(MenuPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(transY_Slider_label, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(transX_Slider, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(MenuPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(cisX_Slider_label, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(transY_Slider, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(MenuPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(MenuPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(cisY_Slider_label, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cisX_Slider, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(MenuPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(MenuPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(escalonar_label, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cisY_Slider, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(MenuPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(MenuPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(rotacionar_label, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(escalonar_Slider, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rotacionar_Slider, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(separator_transicao_forma))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(MenuPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(MenuPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(setarPontos_Slider_label, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(forma_title, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(setarPontos_Slider, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formatoTitle)
                .addGap(18, 18, 18)
                .addGroup(MenuPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(radio_circular)
                    .addComponent(radio_eliptico))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(separator_formato_transicao, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transicoes_label)
                .addGap(18, 18, 18)
                .addComponent(transX_Slider_label)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transX_Slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transY_Slider_label)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transY_Slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cisX_Slider_label)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cisX_Slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cisY_Slider_label)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cisY_Slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escalonar_label)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escalonar_Slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rotacionar_label)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rotacionar_Slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(separator_transicao_forma, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(forma_title)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(setarPontos_Slider_label)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setarPontos_Slider, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );
	}
}
