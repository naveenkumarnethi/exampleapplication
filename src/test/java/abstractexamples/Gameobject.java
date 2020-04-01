package abstractexamples;

public abstract class Gameobject 
{
	public abstract void draw();
	public void run()
	{

	}
	//Player p = new Player();
	//Gameobject g = new Gameobject();
	//can't initiate in the abstract class it should only extends
	public static void main(String args[])
	{
	Player myobj = new Player();
	myobj.draw();
	myobj.run();
	}

}
