package logic;

public class Square implements Comparable<Integer> {
	private Integer value;
	private int xIndex;
	private int yIndex;
	
	Square(Integer value, int x, int y){
		this.value = value;
		xIndex = x;
		yIndex = y;
	}
	
	public int getXIndex(){
		return xIndex;
	}
	public int getYIndex(){
		return yIndex;
	}
	public Integer getValue(){
		return value;
	}
	public int compareTo(Integer in){
		return value - in;
	}
}