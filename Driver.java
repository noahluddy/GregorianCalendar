
import javax.swing.JOptionPane;
import java.util.GregorianCalendar;

public class Driver
{
    public static void main (String[] args)
    {
        
        // declarations and initializations of variables
        String returnValue = new String("");
        int returnMonth = 0;
        int returnDay = 0;
        int returnYear = 0;
        
        returnValue = JOptionPane.showInputDialog("Please enter the year you were born: (yyyy)");
        returnYear = Integer.parseInt(returnValue);
        
        // Get Birthday from user
        // because JOptionPane returns a string, we must convert it into an integer
        returnValue = JOptionPane.showInputDialog("Please enter the numerical value of the month you were born: (mm)");
        returnMonth = Integer.parseInt(returnValue);
        
        //Making sure the user enters a valid month
        while (returnMonth <= 0)
        {
            returnValue = JOptionPane.showInputDialog("Please enter a valid month: ");
            returnMonth = Integer.parseInt(returnValue);
        }
        while (returnMonth > 12)
        {
            returnValue = JOptionPane.showInputDialog("Please enter a valid month: ");
            returnMonth = Integer.parseInt(returnValue);
        }
        
        returnValue = JOptionPane.showInputDialog("Please enter the day you were born: (dd)");
        returnDay = Integer.parseInt(returnValue);
        
        //Making sure the user enters a valid day
        while (returnDay <= 0)
        {
            returnValue = JOptionPane.showInputDialog("Please enter a valid day: ");
            returnDay = Integer.parseInt(returnValue);
        }
        // Months with 31 days
        if (returnMonth == 1 || returnMonth == 3 || returnMonth == 5 || returnMonth == 7 || returnMonth == 8 || returnMonth == 10 || returnMonth == 12)
        {
            while (returnDay > 31)
            {
                returnValue = JOptionPane.showInputDialog("Please enter a valid day: ");
                returnDay = Integer.parseInt(returnValue);
            }
        }
        //Months with 30 days
        if (returnMonth == 4 || returnMonth == 6 || returnMonth == 9 || returnMonth == 11) 
        {
            while (returnDay > 30)
            {
                returnValue = JOptionPane.showInputDialog("Please enter a valid day: ");
                returnDay = Integer.parseInt(returnValue);
            }
        }
        //February
        if (returnMonth == 2 && returnYear % 4 != 0)
        {
            while (returnDay > 28)
            {
                returnValue = JOptionPane.showInputDialog("Please enter a valid day: ");
                returnDay = Integer.parseInt(returnValue);
            }
        }
        //Leap Years
        if (returnMonth == 2 && returnYear % 4 == 0)
        {
            while (returnDay > 29)
            {
                returnValue = JOptionPane.showInputDialog("Please enter a valid day: ");
                returnDay = Integer.parseInt(returnValue);
            }
        }
        
        //Creating a new calendar for my birthday
        GregorianCalendar usersBirthday = new GregorianCalendar(returnYear, returnMonth - 1, returnDay);
   
        Viewer myView = new Viewer();
        myView.weekViewer(usersBirthday); //Passes usersBirthday through the weekView call
       
    }
}