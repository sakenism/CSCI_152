public class Clock {
  
    // Fields
    private int hours;
    private int minutes;
    private int seconds;
 
    // Constructor
    public Clock() 
    {
    	hours = 0;
    	minutes = 0;
    	seconds = 0;    
	 }

	 /**
		@param sets hours in the clock
		@throw throws an exception if hours are out of range 	  	
	 */
    public void setHours(int h) throws Exception
    {
    	if(h <= 23 && h >= 0)
		{
			hours = h;
		}   	
		else 
		{
			hours = 0; 
			throw new Exception ("Hours are out of range");			
		}
    }

    

	 /**
		@param sets minutes in the clock
		@throw throws an exception if minutes are out of range 	  	
	 */


    public void setMin(int m) throws Exception
    {
    	if(m <= 60 && m >= 0)
		{
			minutes = m;
		}   	
		else 
		{
			minutes = 0; 
			throw new Exception ("Minutes are out of range");			
		}
    }
           


	 /**
		@param sets seconds in the clock
		@throw throws an exception if seconds are out of range 	  	
	 */

    public void setSec(int s) throws Exception
    {
    	if(s <= 60 && s >= 0)
		{
			seconds = s;
		}   	
		else 
		{
			seconds = 0; 
			throw new Exception ("Seconds are out of range");			
		}
    }
           
 
    public void resetToMidnight() 
    {
        hours = 0; minutes = 0; seconds = 0;
    }                             
        // Check if morning method
    public boolean isMorning() 
    {
        return hours > 12;
    }

    /*
    * @return returns the value of hours
    */
    public int getHours()
    {
    	return hours;
    }

    /*
    * @return returns the value of minutes
    */


    public int getMin()
    {
    	return minutes;
    }



    /*
    * @return returns the value of seconds
    */

    public int getSec()
    {
    	return seconds;
    }

 
    // Advance one second method
    public void tick() {
        seconds++;
        if (seconds >= 60) {
            seconds = 0;
            minutes++;
            if(minutes >= 60)
            {
            	minutes = 0;
            	hours++;
            	if(hours >= 24)
            		hours = 0;
            }
            // need to increment mins, etc.
        }
    }
    public String toString()
    {
    	return "Time is : " + hours + ":" + minutes + ":" + seconds;
    }
}