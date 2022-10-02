import java.util.Date;
import java.util.Calendar;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        String greeting = String.format("Hello, %s. Lovely to see you.", name);
        return greeting;
    }
    
    public String dateAnnouncement() {
        // returns a polite announcement of the current date and time
        Date date = new Date();
        String dateGreeting = String.format("At the tone it will be %s...Tone.", date);
        return dateGreeting;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") > -1){
            return "Right away, sir. She certainly isn't sophisticated enough for that";
        }
        else if(conversation.indexOf("Alfred") > -1) {
            return "At your servise. As you wish, naturally";
        }
        else {
            return "Right. And with that I shall retired.";
        }
    }
    
	// NINJA BONUS
    public String guestGreeting(String name, String dayPeriod){
        //return a guest greeting with time of day.
        String guestGreeting = String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
        return guestGreeting;
    }
    // SENSEI BONUS
    public String guestGreeting(){
        Calendar now = Calendar.getInstance();
        int hour = now.get(Calendar.HOUR_OF_DAY);
        String greeting = "";
        if (hour < 12){
            greeting = "Good morning";
        }
        else if (hour > 12 && hour < 5 ){
            greeting = "Good afternoon";
        }
        else if (hour > 5){
            greeting = "Good evening";
        }
        else {
            greeting = "We've left the space-time continuium";
        }
    return greeting;
    // Write your own AlfredQuote method using any of the String methods you have learned!
    }
}

