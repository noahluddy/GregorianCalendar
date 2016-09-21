
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.util.GregorianCalendar;
import java.util.Calendar;

/**
 *  This class composes a component with the entire week laid out according to
 *  part 2 of the specification.
 *
 *  @author Noah Luddy
 *
 */
public class Component extends JComponent
{
    /**
	 *
	 */
	private static final long serialVersionUID = 1L;
	GregorianCalendar usersBirthday;

    public Component(GregorianCalendar tempDate)
    {
         usersBirthday = tempDate;
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;

        int returnDay = usersBirthday.get(Calendar.DATE);

        int returnMonth = usersBirthday.get(Calendar.MONTH) + 1;

        //Getting Birth Month as a string
        String birthMonth = "";
        if (returnMonth == 1)
        {
            birthMonth = "January";
        }
        else if (returnMonth == 2)
        {
            birthMonth = "February";
        }
        else if (returnMonth == 3)
        {
            birthMonth = "March";
        }
        else if (returnMonth == 4)
        {
            birthMonth = "April";
        }
        else if (returnMonth == 5)
        {
            birthMonth = "May";
        }
        else if (returnMonth == 6)
        {
            birthMonth = "June";
        }
        else if (returnMonth == 7)
        {
            birthMonth = "July";
        }
        else if (returnMonth == 8)
        {
            birthMonth = "August";
        }
        else if (returnMonth == 9)
        {
            birthMonth = "September";
        }
        else if (returnMonth == 10)
        {
            birthMonth = "October";
        }
        else if (returnMonth == 11)
        {
            birthMonth = "November";
        }
        else if (returnMonth == 12)
        {
            birthMonth = "December";
        }

        //Creating boxes with color
        Rectangle sun = new Rectangle(20, 60, 120, 80);
        g2.setColor(Color.PINK);
        g2.fill(sun);
        Rectangle mon = new Rectangle(140, 60, 120, 80);
        g2.setColor(new Color(245, 150, 245));
        g2.fill(mon);
        Rectangle tues = new Rectangle(260, 60, 120, 80);
        g2.setColor(Color.ORANGE);
        g2.fill(tues);
        Rectangle wed = new Rectangle(380, 60, 120, 80);
        g2.setColor(Color.LIGHT_GRAY);
        g2.fill(wed);
        Rectangle thurs = new Rectangle(500, 60, 120, 80);
        g2.setColor(new Color(143, 223, 93));
        g2.fill(thurs);
        Rectangle fri = new Rectangle(620, 60, 120, 80);
        g2.setColor(new Color(167, 90, 23));
        g2.fill(fri);
        Rectangle sat = new Rectangle(740, 60, 120, 80);
        g2.setColor(new Color(87, 223, 245));
        g2.fill(sat);

        //Creating day names
        g2.setColor(Color.BLACK);
        g2.drawString("Sunday", 40, 50);
        g2.drawString("Monday", 160, 50);
        g2.drawString("Tuesday", 280, 50);
        g2.drawString("Wednesday", 400, 50);
        g2.drawString("Thursday", 520, 50);
        g2.drawString("Friday", 640, 50);
        g2.drawString("Saturday", 760, 50);

        //Getting Birth Day of Week as a string
        int n = usersBirthday.get(Calendar.DAY_OF_WEEK);
        String dayOfWeek = "";
        if (n==1) //Sunday
        {
            //Assigning Sunday
            dayOfWeek = "Sunday";

            //Smiley Face
            g2.setColor(Color.YELLOW);
            Ellipse2D.Double faceSun = new Ellipse2D.Double(40, 65, 70, 70);
            g2.fill(faceSun);
            g2.setColor(Color.BLACK);
            g2.drawOval(55, 80, 5, 5);
            g2.drawOval(85, 80, 5, 5);
            g2.drawArc(55, 105, 35, 10, 180, 180);
        }
        else if (n==2) //Monday
        {
            //Assigning Monday
            dayOfWeek = "Monday";

            //Changing date to get Sunday before
            usersBirthday.add(Calendar.DATE, -1);

            //Smiley Face
            g2.setColor(Color.YELLOW);
            Ellipse2D.Double faceMon = new Ellipse2D.Double(160, 65, 70, 70);
            g2.fill(faceMon);
            g2.setColor(Color.BLACK);
            g2.drawOval(175, 80, 5, 5);
            g2.drawOval(205, 80, 5, 5);
            g2.drawArc(175, 105, 35, 10, 180, 180);
        }
        else if (n==3) //Tuesday
        {
            //Assigning Tuesday
            dayOfWeek = "Tuesday";

            //Changing date to get Sunday before
            usersBirthday.add(Calendar.DATE, -2);

            //Smiley Face
            g2.setColor(Color.YELLOW);
            Ellipse2D.Double faceTues = new Ellipse2D.Double(280, 65, 70, 70);
            g2.fill(faceTues);
            g2.setColor(Color.BLACK);
            g2.drawOval(295, 80, 5, 5);
            g2.drawOval(325, 80, 5, 5);
            g2.drawArc(295, 105, 35, 10, 180, 180);
        }
        else if (n==4) // Wednesday
        {
            //Assigning Wednesday
            dayOfWeek = "Wednesday";

            //Changing date to get Sunday before
            usersBirthday.add(Calendar.DATE, -3);

            //Smiley Face
            g2.setColor(Color.YELLOW);
            Ellipse2D.Double faceWed = new Ellipse2D.Double(400, 65, 70, 70);
            g2.fill(faceWed);
            g2.setColor(Color.BLACK);
            g2.drawOval(415, 80, 5, 5);
            g2.drawOval(445, 80, 5, 5);
            g2.drawArc(415, 105, 35, 10, 180, 180);
        }
        else if (n==5) //Thursday
        {
            //Assigning Thursday
            dayOfWeek = "Thursday";

            //Changing date to get Sunday before
            usersBirthday.add(Calendar.DATE, -4);

            //Smiley Face
            g2.setColor(Color.YELLOW);
            Ellipse2D.Double faceThurs = new Ellipse2D.Double(520, 65, 70, 70);
            g2.fill(faceThurs);
            g2.setColor(Color.BLACK);
            g2.drawOval(535, 80, 5, 5);
            g2.drawOval(565, 80, 5, 5);
            g2.drawArc(535, 105, 35, 10, 180, 180);
        }
        else if (n==6) //Friday
        {
            //Assigning Friday
            dayOfWeek = "Friday";

            //Changing date to get Sunday before
            usersBirthday.add(Calendar.DATE, -5);

            //Smiley Face
            g2.setColor(Color.YELLOW);
            Ellipse2D.Double faceFri = new Ellipse2D.Double(640, 65, 70, 70);
            g2.fill(faceFri);
            g2.setColor(Color.BLACK);
            g2.drawOval(655, 80, 5, 5);
            g2.drawOval(685, 80, 5, 5);
            g2.drawArc(655, 105, 35, 10, 180, 180);
        }
        else if (n==7) //Saturday
        {
            //Assigning Saturday
            dayOfWeek = "Saturday";

            //Changing date to get Sunday before
            usersBirthday.add(Calendar.DATE, -6);

            //Smiley Face
            g2.setColor(Color.YELLOW);
            Ellipse2D.Double faceSat = new Ellipse2D.Double(760, 65, 70, 70);
            g2.fill(faceSat);
            g2.setColor(Color.BLACK);
            g2.drawOval(775, 80, 5, 5);
            g2.drawOval(805, 80, 5, 5);
            g2.drawArc(775, 105, 35, 10, 180, 180);
        }
        else
        {
            System.out.println("What????????");
        }

        //Creating day numbers
        g2.drawString("" + usersBirthday.get(Calendar.DATE), 120, 130);
        usersBirthday.add(Calendar.DATE, 1);
        g2.drawString("" + usersBirthday.get(Calendar.DATE), 240, 130);
        usersBirthday.add(Calendar.DATE, 1);
        g2.drawString("" + usersBirthday.get(Calendar.DATE), 360, 130);
        usersBirthday.add(Calendar.DATE, 1);
        g2.drawString("" + usersBirthday.get(Calendar.DATE), 480, 130);
        usersBirthday.add(Calendar.DATE, 1);
        g2.drawString("" + usersBirthday.get(Calendar.DATE), 600, 130);
        usersBirthday.add(Calendar.DATE, 1);
        g2.drawString("" + usersBirthday.get(Calendar.DATE), 720, 130);
        usersBirthday.add(Calendar.DATE, 1);
        g2.drawString("" + usersBirthday.get(Calendar.DATE), 840, 130);


        //Drawing the header for the week
        g2.drawString("The week of " + dayOfWeek + ", " + birthMonth + " " + returnDay + ", " + usersBirthday.get(Calendar.YEAR) + ":", 20, 20);
    }
}
