// package java_fundamentals.cafeJava;

public class cafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        String notReadyYet = "Not yet";


        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double drip = 2.5;
        double latte = 4.5;
        double cappucino = 6.5;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        // ** Your customer interaction print statements will go here ** //
        System.out.println(customer1 + pendingMessage);
        isReadyOrder1 = true;
        System.out.println(customer1 + readyMessage);
        System.out.println(displayTotalMessage + drip);
        //Noah
        System.out.println(generalGreeting + customer4);
        System.out.println(customer4 + pendingMessage);
        String readyMessage4 = (isReadyOrder4 ? customer4 + readyMessage : notReadyYet); 
        System.out.println(readyMessage4);
        String costMessage4 = (isReadyOrder4 ? displayTotalMessage + cappucino : "Will be coming up shortly" );
        //Noah
        System.out.println(generalGreeting + customer2);
        System.out.println(displayTotalMessage + latte*2);
        String readyMessage2 = (isReadyOrder2 ? customer2 + readyMessage : notReadyYet);
        //Jimmy
        System.out.println(displayTotalMessage + (latte - drip));
        }
    }
    
    

