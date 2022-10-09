package javacafe;
import java.util.ArrayList;

public class CafeUtil {

	    public int getStreakGoal(){
	        //Calculate how many drinks a customer needs after 10 weeks
	        //sum together every conseccutive integer from 1 to 10
	        int goal = 0;
	        for (int i = 0; i <= 10; i++){
	            goal += i; 
	        }
	        return goal;
	    }

	    public int getStreakGoal(int setGoal){
	        //Calculate how many drinks a customer needs after 10 weeks
	        //sum together every conseccutive integer from 1 to the set Goal
	        int goal = 0;
	        for (int i = 0; i <= setGoal; i++){
	            goal += i; 
	        }
	        return goal;
	    }

	    public double getOrderTotal(double[] prices){
	        double sum = 0;
	        for (double price : prices){
	            sum += price;
	        }
	        return sum;
	    }

	    public void displayMenu(ArrayList<String> menuItems){
	        for(int i = 0; i < menuItems.size(); i++){
	            int menuIndex = i;
	            String item = menuItems.get(i);
	            System.out.println(menuIndex + " " + item);
	        } 
	    }

	    public void addCustomer(ArrayList<String> customers){
	        System.out.println("Please enter your name:");
	        String userName = System.console().readLine();
	        System.out.println("Hello, " + userName);
	        customers.add(userName);
	        int lineNumber = customers.indexOf(userName)+1;
	        System.out.println("You are number " + lineNumber + " of " + customers.size());
	    }
	}


