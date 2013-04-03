package logic;

public class Square implements Comparable<Integer> {
	private Integer value;
	
	Square(Integer value){
		this.value = value;
	}
	public Integer getValue(){
		return value;
	}
	public int compareTo(Integer in){
		return value - in;
	}
}