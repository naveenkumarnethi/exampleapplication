package Inheritace;

class Doctor
{
	void doctor_detial()
	{
		System.out.println("i am in doctor class");
	}
}

class Surgeon extends Doctor
{
	void surgeon_detail()
	{	
		super.doctor_detial();
		System.out.println("i am in surgeion class");
	}
}






public class Hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Surgeon sur = new Surgeon();
		sur.doctor_detial();
		sur.surgeon_detail();

	}

}
