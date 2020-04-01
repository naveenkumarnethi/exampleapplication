package Interface;

interface WaterBottein{
	String color = "blue";
	void fillup();
}

public class Tinter implements WaterBottein{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(color);
		Tinter obj = new Tinter();
		obj.fillup();
	}

	public void fillup() {
		// TODO Auto-generated method stub
		System.out.println("it is filled up");
	}

}
