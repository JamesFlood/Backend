package solarcaluator.backend;

public class Roof {

	private int length;
	private int width;
	private int angle;
	private String direction;
	private int deadLength;
	private int deadWidth;
	private String name;

	public Roof(String name, int length, int width, int angle, String direction, int deadLength, int deadWidth) {
		this.name = name;
		this.length = length;
		this.width = width;
		this.angle = angle;
		this.direction = direction;
		this.deadLength = deadLength;
		this.deadWidth = deadWidth;
	}

}
