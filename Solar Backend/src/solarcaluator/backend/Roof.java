package solarcaluator.backend;

import java.util.List;

public class Roof {

	private int length;
	private int width;
	private int angle;
	private String direction;
	private int deadLength;
	private int deadWidth;
	private String name;
	private List<Panel> Panels;

	public Roof(String name, int length, int width, int angle, String direction, int deadLength, int deadWidth) {
		this.name = name;
		this.length = length;
		this.width = width;
		this.angle = angle;
		this.direction = direction;
		this.deadLength = deadLength;
		this.deadWidth = deadWidth;
	}
	
	public String getName(){
		
		return this.name;
	}
	
	public int getAngle(){
		
		return this.angle;
	}
	
	public String direction(){
		
		return this.direction;
	}
	
	public void addPanels(Panel panelSection){
		
		Panels.add(panelSection);
	}
	
	public Panel getPanel(int index){
		
		return Panels.get(index);
	}
	
	public int numberOfPanels(){
		
		return Panels.size();
	}

}
