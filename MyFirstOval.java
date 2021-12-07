import doodlepad.*;

public class MyFirstOval {
	
	private static boolean isOn;
	Rectangle selectButton;

	 
    public MyFirstOval() 
    {
	 
	  
	  Rectangle background= new Rectangle(0,0,600,600);
	  background.setFillColor(0,255,255); 
	  Rectangle ground = new Rectangle(0,500,600, 100);
	  ground.setFillColor(0,255,0);
	  Rectangle r1 = new Rectangle(200,500,200,75);
      r1.setFillColor(139, 69, 19);
      Rectangle r2 = new Rectangle(200, 400, 20, 100);
      r2.setFillColor(139, 69, 19);
    
      Rectangle r3 = new Rectangle(375, 400, 20,100);
      r3.setFillColor(139,69,19);
      Rectangle r4 = new Rectangle (200, 355, 200, 75);
      r4.setFillColor(139, 69, 19);
      Oval o1 = new Oval (400,10, 100,100);
      o1.setFillColor(255,255,0);
      selectButton = new Rectangle(100, 100, 75, 50);
	  selectButton.setMousePressedHandler( this::onPressed );
	  Text changebackground = new Text("Change Background", 95,95,75);
      //139 69 19
      
    }
    	  private void onPressed(Shape shp, double x, double y, int button) {
        // Toggle button state
        isOn = !isOn;

        // Set button fill color based on state
        if (isOn) {
            selectButton.setFillColor(0, 255, 0);
        } else {
            selectButton.setFillColor(200);
        }
    }
    public static void main(String[] args) {
		MyFirstOval oval = new MyFirstOval();
	}//Close main method
}
