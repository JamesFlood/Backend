package solarcaluator.backend;

import java.util.List;

public class Panel {

	private int length;
	private int width;
	private int angle;
	private String direction;
	private int deadLength;
	private int deadWidth;
	private String name;
	private List<Panel> Panels;

	public Panel(String name, int length, int width, int angle, String direction, int deadLength, int deadWidth) {
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
	
	
}
