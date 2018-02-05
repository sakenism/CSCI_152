public class Clock {
  
    // Fields
    private int hours;
    private int minutes;
    private int seconds;
 
    // Constructor
    public Clock(int h, int m, int s) {
    
		if(h <= 23 && h >= 0 && m >= 0 && m < 60 && s >= 0 && s < 60)
		{
			hours = h;
			minutes = m;
			seconds = s;
		}   	
		else 
		{
			hours = 0; minutes = 0; seconds = 0;
		}
    }

    public void setTime(int h, int m, int s)
    {
    	if(h <= 23 && h >= 0 && m >= 0 && m < 60 && s >= 0 && s < 60)
		{
			hours = h;
			minutes = m;
			seconds = s;
		}   	
		else 
		{
			hours = 0; minutes = 0; seconds = 0;
		}
    }
 
    // Reset method
    public void resetToMidnight() {
        hours = 0; minutes = 0; seconds = 0;
    }                             
        // Check if morning method
    public boolean isMorning() {
        return hours > 12;
    }

    public int getHours()
    {
    	return hours;
    }

    public int getMin()
    {
    	return minutes;
    }


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