package gettingstarted;

//Add Phidgets Library 
import com.phidget22.*;

public class GettingStarted {
    //Handle Exceptions 
    public static void main(String[] args) throws Exception{

        //Create 
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address 
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Open 
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);
        
        int greencount=0;
        int redcount=0;

        //Use your Phidgets 
        while(redcount!=10&&greencount!=10){

            if( redButton.getState()){
                redLED.setState(true);
                redcount++;
                System.out.println("Red");
                System.out.println(redcount);
            } else {
                redLED.setState(false);
            }

            if(greenButton.getState()){
                greenLED.setState(true);
                System.out.println("Green");
                greencount++;
                System.out.println(greencount);
            } else {
                greenLED.setState(false);
            }
           
            
           

            Thread.sleep(150);
        }
 
        if(greencount==10 && redcount!=10)
            {
				System.out.println("green wins");
			}
			else
			{
				System.out.println("red wins");
			}
    }
}
  
